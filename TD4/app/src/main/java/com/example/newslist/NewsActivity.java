package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());

        Button detail = (Button) findViewById(R.id.btnDetail);
        Button deco = (Button) findViewById(R.id.btnDeco);
        Button about = (Button) findViewById(R.id.btnAbout);
        TextView usernameAffichage = (TextView) findViewById(R.id.userNameTextView);

        String url = "https://news.google.com/";

        final Intent intent = new Intent(this, DetailsActivity.class);
        final Intent intentLog = new Intent(this, LoginActivity.class);
        final Intent intentAbout = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        Intent i = getIntent();
        String userName = "";
        if(i.hasExtra("login")){
            userName = i.getStringExtra("login");
        }

        usernameAffichage.setText(userName);

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentLog);
                finish();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentAbout);
            }
        });
    }
}
