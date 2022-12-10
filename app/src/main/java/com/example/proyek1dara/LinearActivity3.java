package com.example.proyek1dara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LinearActivity3 extends AppCompatActivity {
    String kepada, subyek, pesan;
    EditText eKepada, eSubyek, ePesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        eKepada = findViewById(R.id.kepada2);
        eSubyek = findViewById(R.id.subyek2);
        ePesan = findViewById(R.id.pesan2);

        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);
    }
}