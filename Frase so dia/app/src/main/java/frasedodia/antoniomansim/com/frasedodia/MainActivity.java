package frasedodia.antoniomansim.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "A vida é um constante recomeço. Não se dê por derrotado e siga adiante. As pedras que hoje atrapalham sua caminhada amanhã enfeitarão a sua estrada.",
            "   Diante dos muros da cidade, uma noite de inverno um homem que tinha sofrido muito gritou, desesperado:qual o sentido da vida? e o eco respondeu-lhe claramente: A vida!",
    "Ouse, arrisque, não desista jamais e saiba valorizar quem te ama, esses sim merecem seu respeito. Quanto ao resto, bom, ninguém nunca precisou de restos para ser feliz."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.texto_nova_frase_id);
        botaoNovaFrase = (Button) findViewById(R.id.botao_nova_frase_id);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
             int   numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText( frases[numeroAleatorio] );
            }
        });

    }
}
