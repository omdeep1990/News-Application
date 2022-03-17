package com.omdeep.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {
    String title,desc,content,imageURL,url;
    private TextView titleTv,subDscTv,contentTv;
    private ImageView newsTv;
    private Button readNewsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");

        titleTv = findViewById(R.id.id_Tv_Title);
        subDscTv = findViewById(R.id.id_Tv_SubDesc);
        contentTv = findViewById(R.id.id_Tv_Content);
        newsTv = findViewById(R.id.id_news);
        readNewsBtn = findViewById(R.id.id_Tv_read_news);

        titleTv.setText(title);
        subDscTv.setText(desc);
        contentTv.setText(content);
        Picasso.get().load(imageURL).into(newsTv);
        readNewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}