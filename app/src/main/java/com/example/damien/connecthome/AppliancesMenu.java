package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by cabers on 01/01/2016.
 */

public class AppliancesMenu extends Activity
{
    Button Logout, Back;
    ToggleButton Kettle, WM, Oven, Blinds;

    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        CountDownTimer timer = new CountDownTimer();
        timer.onUserInteraction();
        setContentView(R.layout.appliances_menu);

        Logout = (Button) findViewById(R.id.buttonL);
        Back = (Button) findViewById(R.id.buttonB);
        Kettle = (ToggleButton) findViewById(R.id.toggleButton);
        WM = (ToggleButton) findViewById(R.id.toggleButton1);
        Oven = (ToggleButton) findViewById(R.id.toggleButton2);
        Blinds = (ToggleButton) findViewById(R.id.toggleButton3);

        Logout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AppliancesMenu.this, LogoutScreen.class));
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AppliancesMenu.this, MainMenu.class));
            }
        });

        Kettle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Kettle.isChecked())
                {

                }

                else
                {

                }
            }
        });

        WM.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(WM.isChecked())
                {

                }

                else
                {

                }
            }
        });

        Oven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Oven.isChecked())
                {

                }

                else
                {

                }
            }
        });

        Blinds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Blinds.isChecked())
                {

                }

                else
                {

                }
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(AppliancesMenu.this, ErrorScreen.class));
            finish();
        }
    }

}
