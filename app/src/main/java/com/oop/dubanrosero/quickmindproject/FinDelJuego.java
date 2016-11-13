package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class FinDelJuego extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_del_juego);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
