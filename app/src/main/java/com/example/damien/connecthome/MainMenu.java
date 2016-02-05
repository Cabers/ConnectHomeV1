package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cabers on 29/12/2015.
 */
public class MainMenu extends Activity
{
    Button Logout, Lights, Appliances, Alarm, CC;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        CountDownTimer timer = new CountDownTimer();
        timer.onUserInteraction();
        setContentView(R.layout.menu);

        Logout = (Button) findViewById(R.id.buttonL);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Lights = (Button) findViewById(R.id.button);
        Lights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, LightsMenu.class));
                finish();
            }
        });

        Appliances = (Button) findViewById(R.id.button1);
        Appliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, AppliancesMenu.class));
                finish();
            }
        });

        Alarm = (Button) findViewById(R.id.button2);
        Alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, AlarmMenu.class));
                finish();
            }
        });

        CC = (Button) findViewById(R.id.button3);
        CC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, CCMenu.class));
                finish();
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(MainMenu.this, ErrorScreen.class));
            finish();
        }

    }
}