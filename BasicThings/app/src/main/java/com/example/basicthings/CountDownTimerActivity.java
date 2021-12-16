package com.example.basicthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class CountDownTimerActivity extends AppCompatActivity {
    int number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down_timer);

        new CountDownTimer(35000, 1000){
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("lpg", "onTick: I am hero");

            }

            @Override
            public void onFinish() {
                Log.d("lpg", "Khatam ho gaya");

            }
        }.start();

        // Task Scheduler using Handler and Runnable
        /*
        final Handler handler = new Handler();
            Runnable run = new Runnable(){
                @Override
                public void run() {
                    // Code to execute
                    number++;
                    Toast.makeText(CountDownTimerActivity.this, "This is toast " + number , Toast.LENGTH_SHORT).show();
                    handler.postDelayed(this, 1000);

                }
            };
        handler.post(run);

         */
    }
}