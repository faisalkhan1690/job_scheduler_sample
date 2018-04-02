package com.khan.faisal.jobschedulersample;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.widget.Toast;


public class JobSchedulerService extends JobService {
    private static final String TAG = "SyncService";

    @Override
    public boolean onStartJob(JobParameters params) {
        Intent service = new Intent(getApplicationContext(), JobSchedulerService.class);
        getApplicationContext().startService(service);
        Toast.makeText(getApplicationContext(), "job scheduled ", Toast.LENGTH_SHORT).show();
        Util.scheduleJob(getApplicationContext()); // reschedule the job
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}