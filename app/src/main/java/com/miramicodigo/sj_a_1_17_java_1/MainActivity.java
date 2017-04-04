package com.miramicodigo.sj_a_1_17_java_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 30-03-17
     * */

    private int resultado;
    private EditText caja1;
    private EditText caja2;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI() {
        caja1 = (EditText) findViewById(R.id.valor1);
        caja2 = (EditText) findViewById(R.id.valor2);
        textoResultado = (TextView) findViewById(R.id.resultado);
    }

    public void sumar(View v) {
        if (caja1.getText().toString().equals("") || caja2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), getString(R.string.mensajetoast), Toast.LENGTH_LONG).show();
        } else {
            int v1 = Integer.parseInt(caja1.getText().toString());
            int v2 = Integer.parseInt(caja2.getText().toString());
            resultado = v1 + v2;
            textoResultado.setText(getString(R.string.mensajesuma)+" "+resultado);
        }
    }
}
