package com.jobsuccessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView jobListView;
    private JobAdapter jobAdapter;
    private ArrayList<Job> jobList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jobListView = findViewById(R.id.jobListView);
        jobList = new ArrayList<>();

        // Sample jobs
        jobList.add(new Job("Software Engineer", "Google", "Mountain View, CA"));
        jobList.add(new Job("Product Manager", "Facebook", "Menlo Park, CA"));
        jobList.add(new Job("Data Scientist", "Amazon", "Seattle, WA"));

        jobAdapter = new JobAdapter(this, jobList);
        jobListView.setAdapter(jobAdapter);

        jobListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Job selectedJob = jobList.get(position);
                Intent intent = new Intent(MainActivity.this, JobDetailsActivity.class);
                intent.putExtra("jobTitle", selectedJob.getTitle());
                intent.putExtra("jobCompany", selectedJob.getCompany());
                intent.putExtra("jobLocation", selectedJob.getLocation());
                startActivity(intent);
            }
        });
    }
}
