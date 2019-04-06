package com.example.skygreen.pretest_akb2_10116063;
/*
* NIM   : 10116063
* NAMA  : IMAM SATRIYADI
* KELAS : IF-2
*
* CHANGE LOG : JUM'AT 5 APRIL 2019 07:40 PM
* MEMBUAT TAMPILAN AWAL
*
* CHANGE LOG : JUM'AT 5 APRIL 2019 09:11 PM
* MEMBUAT TAMPILAN LOGIN CODE
*
* CHANGE LOG : SABTU 5 APRIL 2019 09:00 AM
* MENHUBUNGKAN TAMPILAN AWAL DENGAN TAMPILAN LOGIN CODE
* MEMBUAT TAMPILAN BIODATA
*
* CHANGE LOG : SABTU 5 APRIL 2019 09:34 AM
* MEMBUAT TAMPILAN SAY HAI
* MENGHUBUNGKAN TAMPILAN BIODATA DENGAN TAMPILAN SAY HAI
* */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn  = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logincode();
            }
        });

    }

    public void logincode(){
        Intent intent   = new Intent(this, ActivityLoginCode.class);
        startActivity(intent);
    }
}
