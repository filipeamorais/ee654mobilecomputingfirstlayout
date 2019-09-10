package com.example.firstlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.TXT);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup)
                findViewById(R.id.secondLayout);
        layout.addView(textView);
    }
}
