package com.garnica.rainnoiseonly10mb;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        media = MediaPlayer.create(this, R.raw.rain);
        media.start();
        media.setLooping(true);


    }
}
