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

public class Castigo1M extends AppCompatActivity {
    TextView txt;
    String dato1;
    String dato2;
    String nombrefinal;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castigo1_m);       String[] nums = this.getResources().getStringArray(R.array.cast);

        txt= (TextView)findViewById(R.id.txt);
        Random rand = new Random();

        Bundle bundle =getIntent().getExtras();
        dato1 = bundle.getString("nombre1");
        dato2 = bundle.getString("nombre2");

        int i = rand.nextInt(3);
        if(i== 0){
            txt.setText(nums[0]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.ludo).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.golosa);
            mp = MediaPlayer.create(this, R.raw.golosa);
            mp.seekTo(0);
            mp.start();

            int n = rand.nextInt(3);
            if(n== 0){
                nombrefinal= dato1;
            }
            if(n==1){
                nombrefinal=dato2;
            }
            if(n==2){
                nombrefinal=nums[0];
            }


        }
        if(i== 1){
            txt.setText(nums[1]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.pena).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.marciano);
            mp = MediaPlayer.create(this, R.raw.marciano);
            mp.seekTo(0);
            mp.start();
            int n = rand.nextInt(3);
            if(n== 0){
                nombrefinal= dato1;
            }
            if(n==1){
                nombrefinal=dato2;
            }
            if(n==2){
                nombrefinal=nums[1];
            }

        }
        if(i== 2){
            txt.setText(nums[2]);
            ImageView imagen1 = findViewById(R.id.ima1);
            Glide.with(this).load(R.raw.bob).into(imagen1);
            mp= MediaPlayer.create(this,R.raw.sonidobob);
            mp = MediaPlayer.create(this, R.raw.sonidobob);
            mp.seekTo(0);
            mp.start();
            int n = rand.nextInt(3);
            if(n== 0){
                nombrefinal= dato1;
            }
            if(n==1){
                nombrefinal=dato2;
            }
            if(n==2){
                nombrefinal=nums[2];
            }

        }
    }
    public void boton_click (View sender){
        Intent SegundaPR = new Intent(getApplicationContext(), PreguntaM2.class);
        SegundaPR.putExtra("nombre1",nombrefinal);
        startActivity(SegundaPR);
        mp.stop();

    }
    @Override
    public void onBackPressed() {

    }
}
