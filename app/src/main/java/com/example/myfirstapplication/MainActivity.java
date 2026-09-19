package com.example.myfirstapplication;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
        Button btnChangeText = findViewById(R.id.btnChangeText);
        Button btnChangeColor = findViewById(R.id.btnChangeColor);

        btnChangeText.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                myTextView.setText("Hello World!");
            }
        });
        btnChangeColor.setOnClickListener(v -> myTextView.setTextColor(Color.GREEN));
    }

}