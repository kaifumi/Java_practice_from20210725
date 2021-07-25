package com.kainolearn.java_practice_from20210725;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenMain();
//        setContentView(R.layout.activity_main);
//
//        Button sendButton = findViewById(R.id.send_button);
//
//        // lamda式
//        sendButton.setOnClickListener(v -> {
//            Intent intent = new Intent(getApplication(), SubActivity.class);
//            startActivity(intent);
//        });
    }

    private void setScreenMain(){
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(v -> setScreenSub());
    }

    private void setScreenSub() {
        setContentView(R.layout.activity_sub);

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(v -> setScreenMain());
    }
}