package com.avinsharma.displayjokeandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke-key";
    private TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        mJokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        String joke = intent.getExtras().getString(JOKE_KEY);

        mJokeTextView.setText(joke);
    }
}