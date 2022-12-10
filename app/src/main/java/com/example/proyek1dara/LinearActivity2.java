package com.example.proyek1dara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user, kepada, subyek, pesan;
    EditText eKepada, eSubyek, ePesan;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        user = getIntent().getExtras().getString("user");

        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan = findViewById(R.id.pesan);
        bKirim = findViewById(R.id.btnkirim);
        eKepada.setText(user);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { kirim(); }
        });
    }
    public void kirim() {
        kepada = eKepada.getText().toString();
        subyek = eSubyek.getText().toString();
        pesan = ePesan.getText().toString();
        Intent intent = new Intent(LinearActivity2.this,LinearActivity3.class);
        intent.putExtra("kepada",kepada);
        intent.putExtra("subyek",subyek);
        intent.putExtra("pesan",pesan);

        startActivity(intent);
    }
}