package com.kele.android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_TEXT = "something";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView myTextView = findViewById(R.id.my_text);
        Intent startIntent = getIntent();
        Bundle Extras = startIntent.getExtras();
        if (Extras != null) {
            String text = Extras.getString(KEY_TEXT);
            myTextView.setText(text);
        }

    }
}
