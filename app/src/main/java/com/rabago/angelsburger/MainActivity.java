package com.rabago.angelsburger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this,DisplayMessageActivity.class);
        RadioGroup rg = findViewById(R.id.RadGroupBurgers);
       final RadioButton radchicken = (RadioButton) findViewById(R.id.RadChicken);
        final  RadioButton radbeef = (RadioButton) findViewById(R.id.RadBeef);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.RadChicken){
                    intent.putExtra("burger","Chicken");
                }
                else if (i == R.id.RadBeef){
                    intent.putExtra("burger","Beef");
                }
            }
        });

    }




}
