package com.hitachi_tstv.yaowaluk.yaowaluk.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Bind Widget : การผูกความสัมพันธ์ตัวWidget บน Activity
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Cast to :: Alt + Enter
        //key end :: Shift + Ctrl +Enter
    //------------end Bind Widget---------------

        // Controller for button
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.bird);
                mediaPlayer.start();


                //Web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/Uk4BEb90A7I"));
                startActivity(intent);


            }  // onClick
        });

        // ----end----Controller for button

    }// Main Method and statement in method



}// Main Class นี่คือคลาสหลัก
