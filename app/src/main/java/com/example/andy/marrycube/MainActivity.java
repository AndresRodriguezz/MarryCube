package com.example.andy.marrycube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boton_click (View sender)
    {
        Intent segundoAc = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(segundoAc);
    }
    public  void btn_clic(View sender)
    {
        finish();
    }
    @Override
    public void onBackPressed() {

    }
}
