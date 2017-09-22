package edu.ratpack.nikitarajput.cs2340.gatech.ratpack_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class Login_Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    public void login(View v) {
        //will need to verify username/password
        startActivity(new Intent(Login_Activity.this, Home_Activity.class));
    }

    public void toRegisterActivity(View v){
        startActivity(new Intent(Login_Activity.this, Register_Activity.class));
    }

    public void forgotPassword(View v)  {
        //needs to be implemented later?
    }
}
