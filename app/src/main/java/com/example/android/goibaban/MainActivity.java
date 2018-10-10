package com.example.android.goibaban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomePageBtn = findViewById(R.id.welcome_page);
        welcomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainPageIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(MainPageIntent);
            }
        });
    }
}
