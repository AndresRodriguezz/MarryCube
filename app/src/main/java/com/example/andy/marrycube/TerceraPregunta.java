package com.example.andy.marrycube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TerceraPregunta extends AppCompatActivity {
    TextView ejem;
    String dato1;
    String dato2;
    EditText txt1;
    EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pregunta);

        txt1 = (EditText) findViewById(R.id.texto1);
        txt2 = (EditText) findViewById(R.id.texto2);

        Bundle bundle = getIntent().getExtras();
        dato1 = bundle.getString("transporte");
        dato2 = bundle.getString("nombre1");


    }

    public void boton_click(View sender)
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
                Intent SegundaPR = new Intent(getApplicationContext(), Castigo3.class);
                SegundaPR.putExtra("transporte", dato1);
                SegundaPR.putExtra("nombre1", dato2);
                SegundaPR.putExtra("luna1", txt1.getText().toString());
                SegundaPR.putExtra("luna2", txt2.getText().toString());
                startActivity(SegundaPR);
                finish();
                }
            }
    @Override
    public void onBackPressed() {

    }
        }