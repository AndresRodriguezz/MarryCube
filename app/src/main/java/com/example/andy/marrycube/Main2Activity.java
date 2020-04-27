package com.example.andy.marrycube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void boton_mujer (View sender)
    {
        Intent tercerAC = new Intent(getApplicationContext(), preguntaM1.class);
        startActivity(tercerAC);
        finish();
    }
    public void boton_click (View sender)
    {
        Intent tercerAC = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(tercerAC);
        finish();
    }
    @Override
    public void onBackPressed() {

    }
}
