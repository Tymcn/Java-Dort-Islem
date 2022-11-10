package com.yasar.dortislem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1;
    EditText sayi2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1=findViewById(R.id.sayi1Text);
        sayi2=findViewById(R.id.sayi2Text);
        sonuc=findViewById(R.id.sonucText);
    }

    public void topla(View view){
        if(sayi1.getText().toString().matches("")|| sayi2.getText().toString().matches("")){
            sonuc.setText("LÜTFEN METİN,HARF YADA BOŞ BIRAKMAYINIZ SAYI GİRİNİZ..!");
        }
        else
        {
            int Sayi1=Integer.parseInt(sayi1.getText().toString());
            int Sayi2=Integer.parseInt(sayi2.getText().toString());
            int Sonuc=Sayi1+Sayi2;

            sonuc.setText("SONUÇ: "+ Sonuc);
        }


    }
    public void cikarma(View view){
        if(sayi1.getText().toString().matches("")|| sayi2.getText().toString().matches("")){
            sonuc.setText("LÜTFEN METİN,HARF YADA BOŞ BIRAKMAYINIZ SAYI GİRİNİZ..!");
        }
        else
        {
            int Sayi1=Integer.parseInt(sayi1.getText().toString());
            int Sayi2=Integer.parseInt(sayi2.getText().toString());
            int Sonuc=Sayi1-Sayi2;

            sonuc.setText("SONUÇ: "+ Sonuc);
        }

    }
    public void carpma(View view){
        if(sayi1.getText().toString().matches("")|| sayi2.getText().toString().matches("")){
            sonuc.setText("LÜTFEN METİN,HARF YADA BOŞ BIRAKMAYINIZ SAYI GİRİNİZ..!");
        }
        else
        {
            int Sayi1=Integer.parseInt(sayi1.getText().toString());
            int Sayi2=Integer.parseInt(sayi2.getText().toString());
            int Sonuc=Sayi1*Sayi2;

            sonuc.setText("SONUÇ: "+ Sonuc);
        }

    }
    public void bolme(View view){
        if(sayi1.getText().toString().matches("")|| sayi2.getText().toString().matches("")){
            sonuc.setText("LÜTFEN METİN,HARF YADA BOŞ BIRAKMAYINIZ SAYI GİRİNİZ..!");
        }
        else
        {
            int Sayi1=Integer.parseInt(sayi1.getText().toString());
            int Sayi2=Integer.parseInt(sayi2.getText().toString());
            double Sonuc=Sayi1/Sayi2;

            sonuc.setText("SONUÇ: "+ Sonuc);
        }

    }
}