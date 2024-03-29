package com.example.firstlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TXT = "whatiwant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(
                this, DisplayMessageActivity.class);
        EditText editText =
                (EditText) findViewById(R.id.message);
        String message = editText.getText().toString();
        intent.putExtra(TXT, message);
        startActivity(intent);
    }
}
