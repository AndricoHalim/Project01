package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);



        EditText txtangka1 = findViewById(R.id.txt_angka1);
        EditText txtangka2 = findViewById(R.id.txt_angka2);

        Button btntambah = findViewById(R.id.btn_tambah);
        Button btnkurang = findViewById(R.id.btn_kurang);
        Button btnkali = findViewById(R.id.btn_kali);
        Button btnbagi = findViewById(R.id.btn_bagi);
        Button btnclear = findViewById(R.id.btn_clear);

        TextView tvHasil = findViewById(R.id.tvHasil);

        tvHasil.setVisibility(View.INVISIBLE);

        btntambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tvHasil.setVisibility(View.VISIBLE);
                if (txtangka1.getText().toString().length() > 0 && txtangka1.getText().toString().length() > 0) {
                    //ambil edit teks
                    double angka1 = Double.parseDouble(txtangka1.getText().toString());
                    double angka2 = Double.parseDouble(txtangka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 + angka2;
                    tvHasil.setText("Hasil\n"+ hasil);
                }

            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setVisibility(View.VISIBLE);
                if (txtangka1.getText().toString().length() > 0 && txtangka1.getText().toString().length() > 0) {
                    //ambil edit teks
                    double angka1 = Double.parseDouble(txtangka1.getText().toString());
                    double angka2 = Double.parseDouble(txtangka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 - angka2;
                    tvHasil.setText("Hasil\n"+ hasil);
                }

            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setVisibility(View.VISIBLE);
                if (txtangka1.getText().toString().length() > 0 && txtangka1.getText().toString().length() > 0) {
                    //ambil edit teks
                    double angka1 = Double.parseDouble(txtangka1.getText().toString());
                    double angka2 = Double.parseDouble(txtangka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 * angka2;
                    tvHasil.setText("Hasil\n"+ hasil);
                }

            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setVisibility(View.VISIBLE);
                if (txtangka1.getText().toString().length() > 0 && txtangka1.getText().toString().length() > 0) {
                    //ambil edit teks
                    double angka1 = Double.parseDouble(txtangka1.getText().toString());
                    double angka2 = Double.parseDouble(txtangka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 / angka2;
                    tvHasil.setText("Hasil\n"+ hasil);
                }

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtangka1.setText("");
                txtangka2.setText("");
                tvHasil.setVisibility(View.INVISIBLE);
            }
        });
    }
}