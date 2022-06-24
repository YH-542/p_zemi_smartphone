package com.example.change;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);

        setContentView(R.layout.activity_sub);

        Button returnButton = findViewById(R.id.btn_back);
        returnButton.setOnClickListener(v -> finish());

    }
}
