package com.viperapps.sorteio_0_a_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView resultado = findViewById(R.id.txtResultado);
        int numero = new Random().nextInt(11);
        resultado.setText("O número sorteado foi: " + numero);

    }
}