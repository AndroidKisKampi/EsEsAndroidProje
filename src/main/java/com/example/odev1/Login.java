package com.example.odev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText userName;
    EditText password;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName=findViewById(R.id.userName);
        password=findViewById(R.id.password);
    }

    public void onClick(View view) {
        if(userName.getText().toString().equals("omer") && password.getText().toString().equals("1234")){
            Toast.makeText(Login.this, "Giriş yapıldı!!!", Toast.LENGTH_LONG).show();

            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(Login.this, "Şifreniz veya kullanıcı adınız hatalı. Tekrar deneyiniz!!!", Toast.LENGTH_LONG).show();
            userName.setText("");
            password.setText("");

        }
    }
}
