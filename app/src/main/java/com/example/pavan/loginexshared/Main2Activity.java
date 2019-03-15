package com.example.pavan.loginexshared;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2;
    SharedPreferences sp;
    private String spfilename="com.example.pavan.loginexshared";
    String s1,s2,s3,s4;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.e21);
        e2=findViewById(R.id.e22);
        sp=getSharedPreferences(spfilename,MODE_PRIVATE);
        s1=sp.getString("email",s1);
        s2=sp.getString("password",s2);
        s3=sp.getString("name",s3);
                s4=sp.getString("phone",s4);
        t1=findViewById(R.id.txt);
    }

    public void check(View view) {
        if((s1.equals(e1.getText().toString()))&& s2.equals(e2.getText().toString()))
        {
            Toast.makeText(this, "LOGIN MATCHED", Toast.LENGTH_SHORT).show();
            t1.setText("NAME:"+s3+"\n"+"PHONE:"+s4);

        }
        else {
            Toast.makeText(this, "LOGIN DETAILS INVALID", Toast.LENGTH_SHORT).show();
        }
    }
}
