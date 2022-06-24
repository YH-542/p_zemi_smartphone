package com.example.change;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.btn_next);

        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), SubActivity.class);
            startActivity(intent);
        });
    }
}