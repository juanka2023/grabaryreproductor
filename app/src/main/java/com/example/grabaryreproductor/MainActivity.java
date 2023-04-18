package com.example.grabaryreproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MediaRecorder grabacion;
    private String archivoSalida = null;
    private Button btngrabar;

    ImageView play_pause, boton_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormp [] = new MediaPlayer[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_pause = (ImageView) findViewById(R.id.btnplay);
        boton_repetir = (ImageView) findViewById(R.id.btnrepetir);
        iv = (ImageView) findViewById(R.id.iview);


    }
}