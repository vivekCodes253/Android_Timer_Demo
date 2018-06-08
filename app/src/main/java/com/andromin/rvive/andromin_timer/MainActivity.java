package com.andromin.rvive.andromin_timer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v)
    {
        //----Timer function
        //1 - Create a new timer
        Timer t = new Timer();

        //2 - Find the view, here we are using a button
        final Button btn = (Button)findViewById(R.id.btn);

        //3 - Create the timer task, that is
        //    define the work to be performed
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                btn.setRotation(btn.getRotation()+10);
            }
        };


        //4 - Add the task to the time and schedule it
        //    A - First parameter is the TimerTask
        //    B - Second is the delay, that is after
        //    how long your execution starts in ms
        //    C - Third parameter is the time period
        //    after which the task executes
        t.schedule(tt,0,1000);

    }

}
