package org.androidtown.offerproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.Timer;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }

    public void init(){

    }


    public void btn_bluetooth(View view) {
        Intent intent = new Intent(Menu.this, Bluetooth.class);
        startActivity(intent);
    }
}