package com.example.strewldengland.caklontong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {
    private Button mYa, mTidak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        mYa = (Button)findViewById(R.id.ya);
        mTidak = (Button)findViewById(R.id.tidak);
    }
}
