package com.khan.faisal.jobschedulersample;
import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private JobScheduler mJobScheduler;
    private Button mScheduleJobButton;
    private Button mCancelAllJobsButton;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        mJobScheduler = (JobScheduler) getSystemService(JobScheduler.class);
        mScheduleJobButton = (Button) findViewById( R.id.schedule_job );
        mCancelAllJobsButton = (Button) findViewById( R.id.cancel_all );

        mScheduleJobButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Util.scheduleJob(MainActivity.this);
            }
        });

        mCancelAllJobsButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Util.cancelAll(MainActivity.this);
            }
        });
    }
}
