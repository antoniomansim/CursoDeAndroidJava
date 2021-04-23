package toast.antoniomansim.com.mensagenstoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao=findViewById(R.id.btnCliqueAqui);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //contexto, texto, duracao

                Toast.makeText(MainActivity.this, "Mensagem", Toast.LENGTH_LONG).show();
            }
        });
    }
}
