package br.com.senaijandira.reculperacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox arroz;
    CheckBox leite;
    CheckBox file;
    CheckBox feijao;
    CheckBox coca;
    TextView txtValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arroz = findViewById(R.id.arroz);
        leite = findViewById(R.id.leite);
        file = findViewById(R.id.carne);
        feijao = findViewById(R.id.feijao);
        coca = findViewById(R.id.coca);

        txtValor = findViewById(R.id.TotalCompra);

    }

    public void calcular(View view) {

        float total =0f ;
        String valorReal;

        if(arroz.isChecked()){
            //Selecionou Arroz
            total += 9;
        }

        if (leite.isChecked()){
            total += 2.50;
        }

        if (file.isChecked()){
            total +=27.70;
        }

        if (feijao.isChecked()){
            total += 7.50;
        }

        if (coca.isChecked()){
            total += 8.65;
        }

        valorReal=(total+"").substring(0,5);

        txtValor.setText("R$ "+valorReal+" ");
        Toast.makeText(this, "Total: "+ total, Toast.LENGTH_LONG).show();

    }
}
