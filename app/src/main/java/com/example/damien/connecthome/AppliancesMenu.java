package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

/**
 * Created by cabers on 01/01/2016.
 */

public class AppliancesMenu extends Activity
{
    Button Logout, Back;
    ToggleButton Kettle, WM, Oven, Blinds;
    CountDownTimer timer = new CountDownTimer(60000, new IIdleCallback()
    {
        public void inactivityDetected()
        {
            finish();
            System.exit(0);
        }
    });

    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appliances_menu);
        timer.startCountDownTimer();

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
                timer.stopCountDownTimer();
                startActivity(new Intent(AppliancesMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(AppliancesMenu.this, MainMenu.class));
                finish();
            }
        });

        Kettle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Kettle.isChecked())
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.ON;
                    System.out.println(state.getStateCode());
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.OFF;
                    System.out.println(state.getStateCode());
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
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.ON;
                    System.out.println(state.getStateCode());
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.OFF;
                    System.out.println(state.getStateCode());
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
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.ON;
                    System.out.println(state.getStateCode());
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.OFF;
                    System.out.println(state.getStateCode());
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
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.OPEN;
                    System.out.println(state.getStateCode());
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.SHUT;
                    System.out.println(state.getStateCode());
                }
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(AppliancesMenu.this, ErrorScreen.class));
            finish();
        }
    }

}
