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

public class Castigo2 extends AppCompatActivity {
    TextView txt;
    String dato1;
    String dato2;
    String dato3;
    String transportefinal;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castigo2);

        String[] nums = this.getResources().getStringArray(R.array.transporte);
        txt= (TextView)findViewById(R.id.txt);

        Bundle bundle =getIntent().getExtras();
        dato1 = bundle.getString("transporte1");
        dato2 = bundle.getString("transporte2");
        dato3 = bundle.getString("nombre1");

        Random rand = new Random();
        int i = rand.nextInt(3);
        if(i== 0){
            txt.setText(nums[0]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.vaca).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidodelavaca);
            mp = MediaPlayer.create(this, R.raw.sonidodelavaca);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);

            if(n== 0){
                transportefinal= dato1;
            }
            if(n==1){
                transportefinal=dato2;
            }
            if(n==2){
                transportefinal=nums[0];
            }


        }
        if(i== 1){
            txt.setText(nums[1]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.burro).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.burrosonido);
            mp = MediaPlayer.create(this, R.raw.burrosonido);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);

            if(n== 0){
                transportefinal= dato1;
            }
            if(n==1){
                transportefinal=dato2;
            }
            if(n==2){
                transportefinal=nums[1];
            }

        }
        if(i== 2){
            txt.setText(nums[2]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.caminando).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidocaminando);
            mp = MediaPlayer.create(this, R.raw.sonidocaminando);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);

            if(n== 0){
                transportefinal= dato1;
            }
            if(n==1){
                transportefinal=dato2;
            }
            if(n==2){
                transportefinal=nums[2];
            }

        }

    }
    public void boton_click (View sender){
        Intent SegundaPR = new Intent(getApplicationContext(), TerceraPregunta.class);
        SegundaPR.putExtra("transporte",transportefinal);
        SegundaPR.putExtra("nombre1",dato3);
        startActivity(SegundaPR);
        mp.stop();

    }
    @Override
    public void onBackPressed() {

    }
}
