package com.example.basicthings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void photoView12(View view){
        Intent intent = new Intent(this, PhotoViewActivity.class);
        startActivity(intent);
    }

    public void listArrayAdapters13(View view){
        Intent intent = new Intent(this, ListAdapterViewActivity.class);
        startActivity(intent);
    }

    public void countDown15(View view){
        Intent intent = new Intent(this, CountDownTimerActivity.class);
        startActivity(intent);
    }
}