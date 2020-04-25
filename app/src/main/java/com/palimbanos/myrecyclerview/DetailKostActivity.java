package com.palimbanos.myrecyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailKostActivity extends AppCompatActivity {
    public static final String EXTRA_ALAMAT = "extra_alamat";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_FOTO = "extra_foto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kost);


        TextView tvNama = findViewById(R.id.tv_namakost);
        String strnama = "Nama: " + getIntent().getStringExtra(EXTRA_NAME);
        tvNama.setText(strnama);

        TextView tvHarga = findViewById(R.id.tv_harga);
        String strharga = "Harga: " + getIntent().getStringExtra(EXTRA_HARGA);
        tvHarga.setText(strharga);

        TextView tvDataDapat = findViewById(R.id.tv_alamat);
        String stralamat = "Alamat : " + getIntent().getStringExtra(EXTRA_ALAMAT);
        tvDataDapat.setText(stralamat);

        ImageView image = findViewById(R.id.image);
        String strimage = getIntent().getStringExtra(EXTRA_FOTO);
        Glide.with(this)
                .asDrawable()
                .load(strimage)
                .into(image);



    }
}