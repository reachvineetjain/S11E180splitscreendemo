package com.nehvin.s11e180splitscreendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        // multi mode changed

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isInMultiWindowMode())
        {
            // we are are in multi more
        }

        if(isInPictureInPictureMode())
        {
            //we are in Pic in Pic mode
        }
    }
}
