package com.viperapps.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Casa minhaCasa = new Casa();
        minhaCasa.cor= "Azul";

        Animal animal = new Animal();
        animal.correr();*/

        /*Cachorro cao = new Cachorro();
        cao.dormir();*/

        /*Passaro passaro = new Passaro();
        passaro.dormir();*/

        /*Cachorro cao1 = new Cachorro();
        cao1.Latir();*/

        Cachorro cao1 = new Cachorro();
        cao1.setCor("Azul");

        System.out.println(cao1.getCor());



    }
}