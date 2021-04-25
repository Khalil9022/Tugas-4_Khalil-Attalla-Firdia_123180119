package com.example.mangadex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    private TextView tvName,tvDetail,tvStatus ;
    private ImageView ivPhoto,ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tv_name);
        ivPhoto = findViewById(R.id.iv_photo);
        tvDetail = findViewById(R.id.tv_detail);
        tvStatus = findViewById(R.id.tv_statusmanga);
        ivBack = findViewById(R.id.iv_back);

        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));
        tvStatus.setText(getIntent().getStringExtra("status"));
        int iPhoto = getIntent().getIntExtra("photo",0);

        Glide.with(this).load(iPhoto).into(ivPhoto);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}