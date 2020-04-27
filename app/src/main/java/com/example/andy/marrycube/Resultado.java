package com.example.andy.marrycube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
    String dato1;
    String dato2;
    String dato3;
    String dato4;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    MediaPlayer mp;

        private TextView txtView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resultado);
            txt1=(TextView)findViewById(R.id.texto1);
            txt2=(TextView)findViewById(R.id.texto2);
            txt3=(TextView)findViewById(R.id.texto3);
            txt4=(TextView)findViewById(R.id.texto4);

        mp = MediaPlayer.create(this,R.raw.marchanubcial);
        mp = MediaPlayer.create(this,R.raw.marchanubcial);
        mp.seekTo(0);
        mp.start();

        Bundle bundle =getIntent().getExtras();

        dato1 = bundle.getString("nombre1");
        dato2 = bundle.getString("transporte");
        dato3 = bundle.getString("luna");
        dato4 = bundle.getString("hijos");

        txt1.setText(dato1);
        txt2.setText(dato2);
        txt3.setText(dato3);
        txt4.setText(dato4);

    }
    public void boton_click(View sender) {
        Intent volverJu = new Intent(getApplicationContext(), Galleta.class);
        startActivity(volverJu);
        Toast.makeText(this,"Todo lo que te digo va a pasar",Toast.LENGTH_LONG).show();
        mp.stop();
        finish();
    }
    @Override
    public void onBackPressed() {

    }
}
