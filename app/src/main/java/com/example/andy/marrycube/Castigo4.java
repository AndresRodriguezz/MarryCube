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

public class Castigo4 extends AppCompatActivity {
    String dato1;
    String dato2;
    String dato3;
    String dato4;
    String dato5;
    String HijosFinal;
    TextView txt;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castigo4);

        String[] nums = this.getResources().getStringArray(R.array.Hijos);
        txt= (TextView)findViewById(R.id.txt);

        Bundle bundle =getIntent().getExtras();
        dato1 = bundle.getString("transporte");
        dato2 = bundle.getString("nombre1");
        dato3 = bundle.getString("luna");
        dato4 = bundle.getString("hijos1");
        dato5 = bundle.getString("hijos2");
        Random rand = new Random();
        int i = rand.nextInt(3);
        if(i== 0){
            txt.setText(nums[0]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.ninos).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidoni);
            mp = MediaPlayer.create(this, R.raw.sonidoni);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(2);

            if(n== 0){
                HijosFinal= dato4;
            }
            if(n==1){
                HijosFinal=dato5;
            }
            if(n==2){
                HijosFinal=nums[0];
            }


        }
        if(i== 1){
            txt.setText(nums[1]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.dino).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.audiodino);
            mp = MediaPlayer.create(this, R.raw.audiodino);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);
            if(n== 0){
                HijosFinal= dato4;
            }
            if(n==1){
                HijosFinal=dato5;
            }
            if(n==2){
                HijosFinal=nums[1];
            }

        }
        if(i== 2){
            txt.setText(nums[2]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.gatovolador).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidogato);
            mp = MediaPlayer.create(this, R.raw.sonidogato);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);
            if(n== 0){
                HijosFinal= dato4;
            }
            if(n==1){
                HijosFinal=dato5;
            }
            if(n==2){
                HijosFinal=nums[2];
            }

        }
    }
    public void boton_click (View sender){
        Intent SegundaPR = new Intent(getApplicationContext(), Resultado.class);
        SegundaPR.putExtra("transporte",dato1);
        SegundaPR.putExtra("nombre1",dato2);
        SegundaPR.putExtra("luna",dato3);
        SegundaPR.putExtra("hijos",HijosFinal);
        startActivity(SegundaPR);
        mp.stop();

    }
    @Override
    public void onBackPressed() {

    }
}
