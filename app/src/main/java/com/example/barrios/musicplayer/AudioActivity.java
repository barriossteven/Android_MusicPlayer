 package com.example.barrios.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.io.IOException;

 public class AudioActivity extends AppCompatActivity {

     private Button playB;
     private Button pauseB;
     private Button stopB;
     private SeekBar seekBar;
     private int songID;
     MediaPlayer mediaPlayer;
     Boolean isPrepared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        playB = (Button)findViewById(R.id.playButton);
        pauseB = (Button)findViewById(R.id.pauseButton);
        stopB = (Button)findViewById(R.id.stopButton);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        mediaPlayer = MediaPlayer.create(AudioActivity.this, R.raw.meghan_trainor_no);
        isPrepared = true;
        seekBar.setMax(mediaPlayer.getDuration());

       playB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(!isPrepared) {
                   try {
                       mediaPlayer.prepare();
                       isPrepared = true;
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
               mediaPlayer.start();

           }
       });

        pauseB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        stopB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                isPrepared = false;
            }
        });






    }

    private String getSongName(){
        return null;
    }
    private void stopPlaying(){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }


}
