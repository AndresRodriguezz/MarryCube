package com.example.andy.marrycube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaPregunta extends AppCompatActivity {
    TextView ejemplo;
    public String dato1;
    public String datoreal;
    public EditText txt1;
    public EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pregunta);

        txt1 =(EditText)findViewById(R.id.texto1);
        txt2 =(EditText)findViewById(R.id.texto2);

        Bundle bundle =getIntent().getExtras();
        dato1 = bundle.getString("nombre1");
        datoreal = dato1;

    }
    public void boton_click (View sender)
    {
        String nombre = txt1.getText().toString();
        String nombre2 = txt2.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Debes de escribir tus 2 opciones", Toast.LENGTH_SHORT).show();
        }
        else if (nombre2.length() == 0) {
            Toast.makeText(this, "Debes de escribir tus 2 opciones", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && nombre2.length() != 0) {
            Intent SegundaPR = new Intent(getApplicationContext(), Castigo2.class);
            SegundaPR.putExtra("transporte1", txt1.getText().toString());
            SegundaPR.putExtra("transporte2", txt2.getText().toString());
            SegundaPR.putExtra("nombre1", dato1);
            startActivity(SegundaPR);
            finish();
        }
    }
    @Override
    public void onBackPressed() {

    }
}
