package com.jobsuccessapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JobDetailsActivity extends AppCompatActivity {

    private TextView jobTitleTextView;
    private TextView jobCompanyTextView;
    private TextView jobLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);

        jobTitleTextView = findViewById(R.id.jobTitleTextView);
        jobCompanyTextView = findViewById(R.id.jobCompanyTextView);
        jobLocationTextView = findViewById(R.id.jobLocationTextView);

        // Get data from intent
        String jobTitle = getIntent().getStringExtra("jobTitle");
        String jobCompany = getIntent().getStringExtra("jobCompany");
        String jobLocation = getIntent().getStringExtra("jobLocation");

        jobTitleTextView.setText(jobTitle);
        jobCompanyTextView.setText(jobCompany);
        jobLocationTextView.setText(jobLocation);
    }
}
