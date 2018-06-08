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
        Timer t = new Timer();
        final Button btn = (Button)findViewById(R.id.btn);
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                btn.setRotation(btn.getRotation()+10);
            }
        };

        t.schedule(tt,0,1000);

    }


}
