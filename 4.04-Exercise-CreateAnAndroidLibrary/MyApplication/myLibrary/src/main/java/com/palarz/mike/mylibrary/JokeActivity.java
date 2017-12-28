package com.palarz.mike.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_JOKE = "com.palarz.mike.joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = (TextView) findViewById(R.id.activity_joke_text_view);
        Bundle receivedBundle = getIntent().getExtras();
        String receivedString = receivedBundle.getString(EXTRA_KEY_JOKE,
                "No joke was found :/");
        jokeTextView.setText(receivedString);
    }
}
