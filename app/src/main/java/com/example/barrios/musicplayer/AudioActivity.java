 package com.example.barrios.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

 public class AudioActivity extends AppCompatActivity {

     private Button playB;
     private Button pauseB;
     private Button stopB;
     private SeekBar seekBar;
     private int songID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        playB = (Button)findViewById(R.id.playButton);
        pauseB = (Button)findViewById(R.id.pauseButton);
        stopB = (Button)findViewById(R.id.stopButton);
        seekBar = (SeekBar)findViewById(R.id.seekBar);

        //getSongName();


    }

    private String getSongName(){
        return
    }



}
