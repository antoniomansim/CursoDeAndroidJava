package alcoolougasolina.antoniomansim.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoGasolina;
    private EditText textoAlcool;
    private Button botaoVerificar;
    private TextView textoVerificar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Definição dos Elementos da tela.
        setContentView(R.layout.activity_main);
        textoAlcool = findViewById(R.id.txtAlcool);
        textoGasolina = findViewById(R.id.txtGasolina);
        botaoVerificar = findViewById(R.id.btnVerificar);
        textoVerificar = findViewById(R.id.lblVerificado);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alcool = textoAlcool.getText().toString();
                String gasolina  = textoGasolina.getText().toString();

                Double valAlcool = Double.parseDouble(alcool);
                Double valGasolina = Double.parseDouble(gasolina);

                //Alcool ou Gasolina
                Double resultado = valAlcool / valGasolina;
                if(resultado >= 0.7){
                    textoVerificar.setText(" É melhor ultilizar a gasolina!!! ");
                }else {
                    textoVerificar.setText(" É melhor ultilizar Alcool!!! ");
                }

            }
        });

    }
}
