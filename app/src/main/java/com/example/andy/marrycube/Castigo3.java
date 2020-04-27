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

public class Castigo3 extends AppCompatActivity {
    TextView txt;
    String dato1;
    String dato2;
    String dato3;
    String dato4;
    String Luna;
    String LunaFinal;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castigo3);
        String[] nums = this.getResources().getStringArray(R.array.Miel);
        txt= (TextView)findViewById(R.id.txt);

        Bundle bundle =getIntent().getExtras();
        dato1 = bundle.getString("transporte");
        dato2 = bundle.getString("nombre1");
        dato3 = bundle.getString("luna1");
        dato4 = bundle.getString("luna2");

        Random rand = new Random();
        int i = rand.nextInt(3);
        if(i== 0){
            txt.setText(nums[0]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.perreo).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidoperreke);
            mp = MediaPlayer.create(this, R.raw.sonidoperreke);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);

            if(n== 0){
                LunaFinal= dato3;
            }
            if(n==1){
                LunaFinal=dato4;
            }
            if(n==2){
                LunaFinal=nums[0];
            }


        }
        if(i== 1){
            txt.setText(nums[1]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.neza).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidoneza);
            mp = MediaPlayer.create(this, R.raw.sonidoneza);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);
            if(n== 0){
                LunaFinal= dato3;
            }
            if(n==1){
                LunaFinal=dato4;
            }
            if(n==2){
                LunaFinal=nums[1];
            }

        }
        if(i== 2){
            txt.setText(nums[2]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.basurero).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidobasura);
            mp = MediaPlayer.create(this, R.raw.sonidobasura);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);
            if(n== 0){
                LunaFinal= dato3;
            }
            if(n==1){
                LunaFinal=dato4;
            }
            if(n==2){
                LunaFinal=nums[2];
            }

        }

    }
    public void boton_click (View sender){
        Intent SegundaPR = new Intent(getApplicationContext(), CuartaPregunta.class);
        SegundaPR.putExtra("transporte",dato1);
        SegundaPR.putExtra("nombre1",dato2);
        SegundaPR.putExtra("luna",LunaFinal);
        startActivity(SegundaPR);
        mp.stop();

    }
    @Override
    public void onBackPressed() {

    }
}