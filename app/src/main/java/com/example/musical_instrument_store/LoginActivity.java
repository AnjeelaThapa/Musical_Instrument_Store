package com.example.musical_instrument_store;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText  txtUsername, txtPassword;
    private TextView tvForgetPassword, tvSignup;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        txtUsername= findViewById(R.id.txtUsername);
        txtPassword= findViewById(R.id.txtPassword);
        tvForgetPassword= findViewById(R.id.tvForgetPassword);
        tvSignup= findViewById(R.id.tvSignup);
        btnLogin= findViewById(R.id.btnLogin);

        tvForgetPassword.setOnClickListener(this);
        tvSignup.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ForgetPassword();
        SignUp();
        Login();
    }

    private void ForgetPassword(){
        startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
        finish();
    }

    private void SignUp(){
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        finish();
    }

    public void Login(){
        SharedPreferences sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("username",txtUsername.getText().toString());
        editor.putString("password",txtUsername.getText().toString());
        editor.commit();

        Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show();
    }
    private void checkUser(){
        SharedPreferences sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
        String username = sharedPreferences.getString("username","");
        String password = sharedPreferences.getString("password","");

        if(username.equals(txtUsername.getText().toString()) &&
                password.equals(txtPassword.getText().toString())){
            Toast.makeText(LoginActivity.this,"Successfull",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(LoginActivity.this,"Either Username or Password is incorrect",Toast.LENGTH_SHORT).show();
        }
    }
}
