package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button yellowbtn,redbtn,blackbtn,purplebtn,greenbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yellowbtn =findViewById(R.id.yellowbtn);
        redbtn=findViewById(R.id.redbtn);
        blackbtn=findViewById(R.id.blackbtn);
        purplebtn=findViewById(R.id.purplebtn);
        greenbtn=findViewById(R.id.greenbtn);

        redbtn.setOnClickListener(this);
        blackbtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedbtnid=v.getId();
        if(clickedbtnid==R.id.redbtn){
            playsound(R.raw.red);
        }
        else if (clickedbtnid==R.id.blackbtn)
            playsound(R.raw.black);
        else if (clickedbtnid==R.id.yellowbtn) {
            playsound(R.raw.yellow);
        }
        else if (clickedbtnid==R.id.greenbtn)
            playsound(R.raw.green);
        else if (clickedbtnid==R.id.purplebtn) {
            playsound(R.raw.purple);
        }
    }
    public void playsound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}