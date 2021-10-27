package com.example.modul2_kel30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.modul2_kel30.R;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama, tvNama2, tvEmail;
    private ImageView imgPhotoUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvNama2 = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        imgPhotoUser = findViewById(R.id.img_photo_user);

        if (getIntent().hasExtra("avatar")) {
            Glide.with(getApplicationContext()).load(getIntent().getStringExtra("avatar")).into(imgPhotoUser);

        }
        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText(nama);

        }
        if (getIntent().hasExtra("lastname")) {

            String nama2 = getIntent().getStringExtra("lastname");
            tvNama2.setText(nama2);
        }
        if (getIntent().hasExtra("email")) {

            String email1 = getIntent().getStringExtra("email");
            tvEmail.setText(email1);
        }
    }
}

