package com.example.musicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent serviceIntent;
    private Button buttonStart, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStartID);
        buttonStop = findViewById(R.id.buttonStopID);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        serviceIntent = new Intent(getApplicationContext(), MyService.class);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonStartID:
                startService(new Intent(getApplicationContext(), MyService.class));
                break;
            case R.id.buttonStopID:
                stopService(new Intent(getApplicationContext(), MyService.class));
                break;

        }

    }
}
