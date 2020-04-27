package com.example.andy.marrycube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class preguntaM1 extends AppCompatActivity {
    public EditText txt1;
    public EditText txt2;
    public EditText txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_m1);
        txt1 = (EditText) findViewById(R.id.texto1);
        txt2 = (EditText) findViewById(R.id.texto2);
    }

    public void boton_click(View sender) {
        String nombre = txt1.getText().toString();
        String nombre2 = txt2.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Debes de escribir tus 2 opciones", Toast.LENGTH_SHORT).show();
        }
        else if (nombre2.length() == 0) {
            Toast.makeText(this, "Debes de escribir tus 2 opciones", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && nombre2.length() != 0) {
            Intent SegundaPR = new Intent(getApplicationContext(), Castigo1M.class);
            SegundaPR.putExtra("nombre1", txt1.getText().toString());
            SegundaPR.putExtra("nombre2", txt2.getText().toString());
            startActivity(SegundaPR);
            finish();
        }

    }
    @Override
    public void onBackPressed() {

    }
}