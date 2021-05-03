package com.viperapps.frasesdodia2021;

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

    public void gerarNovaFrase(View view){

        String[] frases = {
                /*Frases retiradas do site https://www.42frases.com.br/frases-curtas-de-motivacao/#1 03-05-2021*/
                /*1*/"Olhe para cima, que é de lá que vem tua força!",
                /*2*/"Agora é a hora de começar a surpreender aqueles que duvidaram de você!",
                /*3*/"Não importa o que você decidiu. O que importa é que isso te faz feliz.",
                /*4*/"Você nunca será velho demais para sonhar um novo sonho.",
                /*5*/"Quando pensar em desistir, lembre-se porque começou.",
                /*6*/"Se não puder fazer tudo, faça tudo que puder.",
                /*7*/"Comece onde você está. Use o que você tem. Faça o que puder.",
                /*8*/"Por mais difícil que algo possa parecer, jamais desista antes de tentar!",
                /*9*/"Acreditar é a força que nos permite subir os maiores degraus da vida.",
                /*10*/"No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim.",
                /*11*/"Não coloque limite em seus sonhos. Coloque fé.",
                /*12*/"Com fé no Senhor e determinação todos os sonhos são possíveis de realizar.",
                /*13*/"A fé em Deus nos faz crer no incrível, ver o invisível e realizar o impossível.",
                /*14*/"Vá firme na direção da sua meta, porque o pensamento cria, o desejo atrai e a fé realiza!",
                /*15*/"Às vezes as coisas demoram, mas acontecem. O importante é esperar e não perder a fé.",
                /*16*/"A fé não é a estrada, mas pode ser a força que nos faz caminhar.",
                /*17*/"Enquanto houver fé, nunca faltará força.",
                /*18*/"Foco, força e fé é o lema dos vencedores.",
                /*19*/"Faça mais do que simplesmente acreditar, tenha fé.",
                /*20*/"Quem fica de joelhos diante de Deus, fica em pé diante de qualquer coisa.",
                /*21*/"O bom professor explica. O grande professor inspira.",
                /*22*/"A influência de bons professores ninguém consegue apagar.",
                /*23*/"Ser professor é ser um condutor de almas e sonhos. É lapidar diamantes.",
                /*24*/"Um bom mestre é aquele que inspira seus alunos a aprender e os ensina a pensarem por si mesmos.",
                /*25*/"O professor pode ser uma grande influência para orientar seus alunos a um caminho de sucesso.",
                /*26*/"Alguns professores contribuem para a nossa educação, outros deixam marcas para a vida inteira.",
                /*27*/"Um livro, uma caneta, uma criança e um professor podem mudar o mundo.\n" +
                "\n" +
                "Malala Yousafzai",
                /*28*/"Ser sonhador, ser semeador, ser transformador, ser professor!",
                /*29*/"Ser professor é poder construir e reconstruir formas diferentes e competentes de viver e conviver.",
                /*30*/"Ser professor é ajudar a escrever a história do futuro.",
                /*31*/"Você pode ter resultados ou desculpas. Não os dois!",
                /*32*/"Se você quer ser bem sucedido, precisa ter dedicação total, buscar seu último limite e dar o melhor de si mesmo.\n" +
                "\n" +
                "Ayrton Senna",
                /*33*/"Quem oferece mais, se prepara mais e se relaciona mais, vende mais.",
                /*34*/"Lembre-se que a verdadeira arte de vender começa quando o freguês diz não.\n" +
                "\n" +
                "H. Jackson Brown Jr",
                /*35*/"Um cliente satisfeito é um cliente leal. Invista seu tempo para oferecer o melhor produto para cada perfil e abra portas para novas oportunidades.",
                /*36*/"É fundamental que você conheça a fundo os produtos e serviços que oferece. Seja um profissional que domina o seu negócio!",
                /*37*/"O sucesso é a soma de pequenos esforços repetidos dia após dia.\n" +
                "\n" +
                "Robert Collier",
                /*38*/"Não basta simplesmente satisfazer clientes. É preciso encantá-los.\n" +
                "\n" +
                "Philip Kotler",
                /*39*/"Para ser um campeão em vendas você tem que acreditar em si mesmo, no seu potencial e nas suas habilidades.",
                /*40*/"Nunca pergunte aos seus clientes o que eles querem, diga a eles o que precisam!",
                /*41*/"",
        };

        //.length é para descobrir o tamanho do array
        int numero = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.txtResultadoFrase);
        texto.setText(frases[numero]);
    }
}