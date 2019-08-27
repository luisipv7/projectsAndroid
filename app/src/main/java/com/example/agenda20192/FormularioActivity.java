package com.example.agenda20192;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNome, etTelefone;
    private Spinner spEstado, spCidades;
    private RadioButton rbFeminino, rbMAsculino;
    private CheckBox cbCasado;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNome = (EditText) findViewById(R.id.etNome);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
        spEstado = (Spinner) findViewById(R.id.spEstado);
        spCidades = (Spinner) findViewById(R.id.spCidade);
        rbFeminino = (RadioButton) findViewById(R.id.rbFeminino);
        rbMAsculino = (RadioButton) findViewById(R.id.rbMasculino);
        cbCasado = (CheckBox) findViewById(R.id.cbCasado);
        btnSalvar = (Button)findViewById(R.id.btnSalvar);


    }

    private void carregarCidades(int posicao)
    {
        String[] cidades = {"Você deve selecionar o Estado."};

        if(posicao==0)
        {
           spCidades.setEnabled(false);
        }else
            {
            spCidades.setEnabled(true);

            if(posicao == 1)
            {
                cidades = new String[] {"Selecione a cidade......", "Curitiba",
                        "Londrina",
                        "Maringa",};
            }else if (posicao == 2){
                cidades = getResources().getStringArray(R.array.rs);
            }else if (posicao == 3){
                cidades = getResources().getStringArray(R.array.sc);
            }

        }

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1,
                cidades);

        spCidades.setAdapter(adapter);
    }
}
