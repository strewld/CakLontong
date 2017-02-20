package com.example.strewldengland.caklontong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    public static final String EXTRA_ANSWER_IS_TRUE =
            "com.bignerdranch.android.geoquiz.answer_is_true";

    private TextView mIsi;
    private Button mYa, mTidak;
    private int mClue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        mIsi = (Button)findViewById(R.id.isi);
        mYa = (Button)findViewById(R.id.ya);
        mTidak = (Button)findViewById(R.id.tidak);

        mClue = getIntent().getIntExtra(EXTRA_ANSWER_IS_TRUE, true);


    }
}
