package com.example.trishachetani.wwcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

/**
 * Created by trishachetani on 11/2/18.
 */

public class SplashActivity extends Activity {


        //timer in miliseconds, 1000ms = 1s//
        private static int SPLASH_TIME_OUT = 2000;

        //create first screen showed when app is launched//
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.layout);

            new Handler().postDelayed(new Runnable() {
                //showing splashscreen with a timer //

                @Override
                public void run() {
                    //this is executed once the timer is over//

                    Intent i = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();


                }
            },SPLASH_TIME_OUT);

        }
    }