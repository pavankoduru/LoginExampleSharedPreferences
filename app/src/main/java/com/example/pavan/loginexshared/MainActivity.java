package com.example.pavan.loginexshared;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    SharedPreferences sp;
    EditText e1,e2,e3,e4;
    private String spfilename="com.example.pavan.loginexshared";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.login);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        sp=getSharedPreferences(spfilename,MODE_PRIVATE);


    }

    public void login(View view) {
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("name",e1.getText().toString());
        editor.putString("phone",e2.getText().toString());
        editor.putString("email",e3.getText().toString());
        editor.putString("password",e4.getText().toString());
        editor.apply();

        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);

    }
}
