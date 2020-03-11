package com.example.calculadoredeidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    Button botao;
    EditText txt1;
    EditText txt2;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    botao = (Button)findViewById(R.id.buttonCalc);
    txt1 = (EditText)findViewById (R.id.txtIdade);
    txt2 = (EditText)findViewById (R.id.txtMostrar);
    buttonCalc.setOnClickListener(new View.OnClick);

    public void onClick (View v) {
        int ano;
        int idade;

        ano = Interger.parseInt(txt1.getText().toString());
        ano = (2020-year);

        txt2.setText("Você tem " + ano +" anos");

    }

}
