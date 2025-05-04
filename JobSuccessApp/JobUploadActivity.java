package com.jobsuccessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class JobUploadActivity extends AppCompatActivity {

    private EditText jobTitleEditText;
    private EditText jobCompanyEditText;
    private EditText jobLocationEditText;
    private Button uploadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_upload);

        jobTitleEditText = findViewById(R.id.jobTitleEditText);
        jobCompanyEditText = findViewById(R.id.jobCompanyEditText);
        jobLocationEditText = findViewById(R.id.jobLocationEditText);
        uploadButton = findViewById(R.id.uploadButton);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = jobTitleEditText.getText().toString().trim();
                String company = jobCompanyEditText.getText().toString().trim();
                String location = jobLocationEditText.getText().toString().trim();

                if (title.isEmpty() || company.isEmpty() || location.isEmpty()) {
                    Toast.makeText(JobUploadActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // For now, just show a success message
                    Toast.makeText(JobUploadActivity.this, "Job uploaded successfully", Toast.LENGTH_SHORT).show();
                    // Clear fields
                    jobTitleEditText.setText("");
                    jobCompanyEditText.setText("");
                    jobLocationEditText.setText("");
                }
            }
        });
    }
}
