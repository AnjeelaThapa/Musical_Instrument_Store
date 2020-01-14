package com.example.musical_instrument_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtUsername,txtEmail,txtAddress,txtPhonenum,txtCreatePassword,txtConfirmPassword;
    private TextView tvLogin;
    private RadioButton rdoMale, rdoFemale, rdoOthers;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txtUsername = findViewById(R.id.txtUsername);
        txtEmail= findViewById(R.id.txtEmail);
        txtAddress= findViewById(R.id.txtAddress);
        txtPhonenum= findViewById(R.id.txtPhonenum);
        txtCreatePassword= findViewById(R.id.txtCreatePassword);
        txtConfirmPassword=findViewById(R.id.txtConfirmPassword);
        tvLogin = findViewById(R.id.tvLogin);
        rdoMale= findViewById(R.id.rdoMale);
        rdoFemale= findViewById(R.id.rdoFemale);
        rdoOthers=findViewById(R.id.rdoOthers);
        btnSignUp= findViewById(R.id.btnSignUp);

        tvLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        openLogin();
    }
    private void openLogin(){
        startActivity(new Intent(SignupActivity.this, LoginActivity.class));
        finish();
    }
}
