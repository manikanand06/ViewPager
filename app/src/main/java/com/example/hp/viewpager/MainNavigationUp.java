package com.example.hp.viewpager;

/**
 * Created by hp on 26-04-2018.
 */

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainNavigationUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationup);

        //one way for navigation up,if using this,then set parentactivity name in manifest
        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //other way for navigation up,In this parentactivity name not needed
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainNavigationUp.this, SampleViewPager.class));
            }
        });
    }*/


        /*@Override
        public void onBackPressed() {    //navigation back
        super.onBackPressed();
    }*/
}}
