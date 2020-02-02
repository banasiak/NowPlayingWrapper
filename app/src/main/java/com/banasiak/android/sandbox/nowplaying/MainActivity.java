package com.banasiak.android.sandbox.nowplaying;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static String PACKAGE = "com.google.intelligence.sense";
    private static String ACTIVITY = "com.google.intelligence.sense.ambientmusic.history.HistoryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity();
        finish();
    }

    private void startActivity() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setComponent(new ComponentName(PACKAGE, ACTIVITY));
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}
