package com.arahuul.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by a rahuul on 7/17/2016.
 */
public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        String joke=getIntent().getStringExtra("INTENT");

        TextView jokesTextView=(TextView)findViewById(R.id.jokes_text_box);
        jokesTextView.setText(joke);
    }
}
