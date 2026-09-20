package com.example.myfirstapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private Button btnChangeText;
    private Button btnChangeColor;
    private Button btnChangeBgColor;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
        btnChangeText = findViewById(R.id.btnChangeText);
        btnChangeColor = findViewById(R.id.btnChangeColor);
        btnChangeBgColor = findViewById(R.id.btnChangeBgColor);
        mainLayout = findViewById(R.id.mainLayout);

        // 1. Button: Changes text
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("Text Changed!");
            }
        });

        // 2. Button: Changes text color to green
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setTextColor(Color.GREEN);
            }
        });

        // 3. Button: Changes background color to yellow
        btnChangeBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}//Code for revert