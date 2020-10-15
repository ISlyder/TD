package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle(getLocalClassName());

        final NewsListApplication app = (NewsListApplication) getApplicationContext();

        final EditText userName = (EditText) findViewById(R.id.userName);
        Button btnConn = (Button) findViewById(R.id.btnConn);

        final Intent intent = new Intent(this, NewsActivity.class);

        btnConn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("login", userName.getText().toString());
                app.setLogin(userName.getText().toString());
                String userNameApp = app.getLogin();
                startActivity(intent);
                finish();
            }
        });
    }
}
