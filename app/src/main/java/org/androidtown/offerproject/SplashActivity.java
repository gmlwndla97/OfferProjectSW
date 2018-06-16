package org.androidtown.offerproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by ok3651004 on 2018-06-17.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        try {
            Thread.sleep(2000); //2초동안 보여줌
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();
    }
}
