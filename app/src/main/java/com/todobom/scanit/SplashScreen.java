package com.todobom.scanit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.facebook.ads.*;


public class SplashScreen extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        adView = new AdView(this, "667071786993462_667072533660054", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }

    public static Intent makeIntent (Context context)
    {
        return new Intent(context, SplashScreen.class);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 3000);
    }
}
