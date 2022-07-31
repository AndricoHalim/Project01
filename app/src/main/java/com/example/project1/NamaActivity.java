package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        EditText teks_nama = findViewById(R.id.teks_nama);
        Button button = findViewById(R.id.btn_tampil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = teks_nama.getText().toString();
                Toast.makeText(NamaActivity.this, "Hai,"+nama, Toast.LENGTH_SHORT).show();
            }
        });
    }
}