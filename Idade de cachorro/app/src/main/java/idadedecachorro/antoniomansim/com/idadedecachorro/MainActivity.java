package idadedecachorro.antoniomansim.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixatextoid);
        botaoIdade = (Button) findViewById(R.id.btnidadeid);
        resultadoIdade = (TextView) findViewById(R.id.resultadoidadeid);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reculperar oque foi digitado
              String textoDigitado =  caixaTexto.getText().toString();

              if (textoDigitado.isEmpty()){
                  //String vazia (msg de erro)
                  resultadoIdade.setText(" Nenhum numero foi digitado!!! ");

              }else{
                  int valorDigitado = Integer.parseInt( textoDigitado );
                  int resultadoFinal = valorDigitado*7;

                  resultadoIdade.setText( "A idade do cachorro em anos Humanos é: "+resultadoFinal+" anos! ");
              }

            }
        });

    }
}
