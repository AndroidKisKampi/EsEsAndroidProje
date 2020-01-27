package com.example.odev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText adi;
    EditText fiyat;
    EditText adet;
    TextView tutar;
    Intent intent;
    Intent intent2;
    ArrayList<Urun> urunler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();
        adi=findViewById(R.id.adi);
        fiyat=findViewById(R.id.fiyat);
        adet=findViewById(R.id.adet);
        tutar=findViewById(R.id.tutar);
        adet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(adet.getText().toString().isEmpty()&& fiyat.getText().toString().isEmpty()){
                    tutar.setText("Tutar: 0");
                }
                //Örnek pushlama
                else {
                    int aFiyat=Integer.parseInt(fiyat.getText().toString());
                    int aAdet=Integer.parseInt(adet.getText().toString());
                    tutar.setText("Tutar:"+aAdet*aFiyat);
                }

            }
        });

    }

    public void sepeteEkle(View view) {

        int aFiyat=Integer.parseInt(fiyat.getText().toString());
        int aAdet=Integer.parseInt(adet.getText().toString());

        Urun x=new Urun(adi.getText().toString(),aFiyat,aAdet,aAdet*aFiyat);
        urunler.add(x);
         /*
        adi.setText("");
        fiyat.setText("0");
        adet.setText("0");
        tutar.setText("0");
        */
    }

    public void sepeteGit(View view) {
        intent2 = new Intent(this,Main2Activity.class);
        startActivity(intent2);
    }
}
