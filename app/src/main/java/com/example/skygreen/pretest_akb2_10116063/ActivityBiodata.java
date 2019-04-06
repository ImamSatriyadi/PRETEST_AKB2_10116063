package com.example.skygreen.pretest_akb2_10116063;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityBiodata extends AppCompatActivity {
    Button btn_biodata;
    EditText txtnama;
    String nama;
    String key  = "nama";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btn_biodata = findViewById(R.id.btn_biodata);


        btn_biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayactivitiy();
            }
        });
    }

    public void sayactivitiy(){
        txtnama     = findViewById(R.id.txtnama);
        if(txtnama.length()>0){
            nama            = txtnama.getText().toString();
            Intent intent   = new Intent(this, SayHaiActivity.class);
            intent.putExtra(key, nama);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplication(), "Nama Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }
    }
}
