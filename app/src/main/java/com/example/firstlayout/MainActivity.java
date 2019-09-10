package com.example.firstlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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
