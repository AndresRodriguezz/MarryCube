package com.example.andy.marrycube;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Intro extends Activity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        mp= MediaPlayer.create(this,R.raw.efectocorazon);
        mp = MediaPlayer.create(this, R.raw.efectocorazon);
        mp.seekTo(0);
        mp.start();
        ImageView imagen1 = findViewById(R.id.ima1);
        Glide.with(this).load(R.raw.heart).into(imagen1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent PrimerAct = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(PrimerAct);
                mp.stop();
                finish(); //Elimina la pila de actividades

            }
        },4000);
    }
}
