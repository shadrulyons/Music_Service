package com.example.musicservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private MediaPlayer mediaPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate(){
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music );
        mediaPlayer.setLooping(false);
    }
    public void onStart(Intent intent, int startid){
        Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
    }
    public void onDestroy(){
        Toast.makeText(this, "Service stopped", Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
    }
}
