package com.example.escola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtN1, edtN2;
    TextView txtM, txtSit;
    LinearLayout layResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN1 = findViewById(R.id.edtN1);
        edtN2 = findViewById(R.id.edtN2);
        txtM = findViewById(R.id.txtM);
        txtSit = findViewById(R.id.txtSit);
        layResult = findViewById(R.id.layResult);



    }

    public void calcular(View view) {
        // fazendo a media
        float n1 = Float.parseFloat(edtN1.getText().toString());
        float n2 = Float.parseFloat(edtN2.getText().toString());
        float m = (n1 + n2)/2;
        //resultado da media
        txtM.setText(String.format("%.1f", m));
        //resultado situacao
        if (m < 5) {
            txtSit.setText(getString(R.string.strSitRp));
        }
        else if(m < 7){
            txtSit.setText(getString(R.string.strSitRc));
        }
        else {
            txtSit.setText(getString(R.string.strSitAp));
        }
    }
}
