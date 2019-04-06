package com.example.skygreen.pretest_akb2_10116063;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHaiActivity extends AppCompatActivity {
    TextView txtberes;
    String nama;
    String key  = "nama";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        txtberes        = findViewById(R.id.txtberes);
        Bundle extras   = getIntent().getExtras();
        nama            = extras.getString(key);
        txtberes.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HPmu tiap hari buat bantu kamu ngatur waktu");

    }
}
