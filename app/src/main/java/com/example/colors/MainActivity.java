package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    TextStyleState currentStyle = TextStyleState.REGULAR;
    TextColorState currentColor = TextColorState.RED;
    Button buttonRegular;
    Button buttonBold;
    Button buttonItalic;
    Button buttonRed;
    Button buttonGreen;
    Button buttonBlue;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonRegular = findViewById(R.id.buttonRegular);
        buttonBold = findViewById(R.id.buttonBold);
        buttonItalic = findViewById(R.id.buttonItalic);
        buttonRed = findViewById(R.id.buttonRed);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonBlue = findViewById(R.id.buttonBlue);
        textView = findViewById(R.id.textView);
        
        buttonRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStyle = TextStyleState.REGULAR;
                setCurrentTypeFace();
            }
        });

        buttonBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStyle = TextStyleState.BOLD;
                setCurrentTypeFace();
            }
        });

        buttonItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStyle = TextStyleState.ITALIC;
                setCurrentTypeFace();
            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentColor = TextColorState.RED;
                setCurrentColor();
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentColor = TextColorState.GREEN;
                setCurrentColor();
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentColor = TextColorState.BLUE;
                setCurrentColor();
            }
        });
        
    }
    
    private void setCurrentTypeFace(){
        switch(currentStyle){
            case REGULAR:
                textView.setTypeface(Typeface.DEFAULT);
                break;
            case BOLD:
                textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
                break;
            case ITALIC:
                textView.setTypeface(textView.getTypeface(), Typeface.ITALIC);
                break;
        }
    }
    
    private void setCurrentColor(){
        int color = 0;
        switch (currentColor) {
            case RED:
                color = getColor(R.color.red);
                break;
            case GREEN:
                color = getColor(R.color.green);
                break;
            case BLUE:
                color = getColor(R.color.blue);
                break;
        }
        textView.setTextColor(color);
    }
}