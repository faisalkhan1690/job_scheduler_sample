package com.khan.faisal.jobschedulersample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyStartServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "job scheduled ", Toast.LENGTH_SHORT).show();
        Util.scheduleJob(context);
    }
}