package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Second extends AppCompatActivity {
    TextView welcometxt,luckynumbertxt;
    Button share_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        welcometxt = findViewById(R.id.text2);
        luckynumbertxt = findViewById(R.id.text3);
        share_btn = findViewById(R.id.button);


        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        int randomnum=generateRandom();
        luckynumbertxt.setText(""+randomnum);
        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName,randomnum);
            }
        });

    }
        public int generateRandom(){
            Random random = new Random();
            int upper_limit=1000;
            int randomNumberGenerated = random.nextInt(upper_limit);
            return randomNumberGenerated;

    }
    public void shareData(String name,int num){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        i.putExtra(Intent.EXTRA_SUBJECT,name+" got lucky number");
        i.putExtra(Intent.EXTRA_TEXT,"His lucky number is: "+num);
        startActivity(Intent.createChooser(i," Choose a Platform"));

    }
}