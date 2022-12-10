package com.example.proyek1dara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Layout extends AppCompatActivity {
    //deklarasikan variabel dengan tipe data
    ImageView gambarLoading; //digunakan untuk menampung gambar loading dari activity_frame1
    Animation rotasiAnimasi; //digunakan untuk melakukan animasi rotasi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1_layout);
        gambarLoading = findViewById(R.id.loading);

        //panggil fungsi rotasi
        rotasi();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Frame1Layout.this,Frame2Layout.class);

                startActivity(intent);

                finish();
            }

        },3000);
    }
    private void rotasi(){

        rotasiAnimasi = AnimationUtils.loadAnimation(this, R.anim.rotasi_searah);
        gambarLoading.startAnimation(rotasiAnimasi);
    }
}