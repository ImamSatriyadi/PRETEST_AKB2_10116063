package com.example.skygreen.pretest_akb2_10116063;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLoginCode extends AppCompatActivity {
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        btn_login   = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biodata();
            }
        });
    }

    public void biodata(){
        Intent intent   = new Intent(this, ActivityBiodata.class);
        startActivity(intent);
    }
}
