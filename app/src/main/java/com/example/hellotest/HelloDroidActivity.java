package com.example.hellotest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HelloDroidActivity extends AppCompatActivity {
    private TextView message;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.clickCounter);
        ImageView droid = findViewById(R.id.droidImage);

        droid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapDroid();
            }
        });
    }
    private void tapDroid(){
        counter ++;
        String CountAsText;
        switch(counter){
            case 1:
                CountAsText = "Once";
                break;
            case 2:
                CountAsText = "Twice";
                break;
            default:
                CountAsText = String.format("%d times", counter);
        }
        message.setText(String.format("you touched the droid %s", CountAsText));
    }
}