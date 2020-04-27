package com.example.andy.marrycube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Random;

public class Galleta extends AppCompatActivity {
    MediaPlayer mp;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleta);
        txt = (TextView) findViewById(R.id.galleta);

        mp = MediaPlayer.create(this, R.raw.flauta);
        mp = MediaPlayer.create(this, R.raw.flauta);
        mp.seekTo(0);
        mp.start();
        ImageView imagen1 = findViewById(R.id.ima1);
        Glide.with(this).load(R.raw.galleta).into(imagen1);

        String[] nums = this.getResources().getStringArray(R.array.galleta);
        Random rand = new Random();
        int i = rand.nextInt(4);
        if (i == 0) {
            txt.setText(nums[0]);
        }
        if(i==1){
            txt.setText(nums[1]);
        }
        if(i==2){
            txt.setText(nums[2]);
        }
        if(i==3){
            txt.setText(nums[3]);
        }
        if(i==4){
            txt.setText(nums[4]);
        }
    }

    public void boton_click(View sender) {
        Intent SegundaPR = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(SegundaPR);
        mp.stop();
        finish();
    }
    @Override
    public void onBackPressed() {

    }

}
