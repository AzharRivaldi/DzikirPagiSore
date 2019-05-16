package com.azhar.doapagisore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    CardView pagi_activity;

    CardView sore_activity;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.pagi_activity)
    public void onCrpagiClicked() {
        startActivity(new Intent(MainActivity.this, PagiActivity.class));

    }

    @OnClick(R.id.sore_activity)
    public void onCrpetangClicked() {
        startActivity(new Intent(MainActivity.this, SoreActivity.class));
    }
}