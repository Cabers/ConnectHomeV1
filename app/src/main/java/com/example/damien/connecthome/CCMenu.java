package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

/**
 * Created by cabers on 04/01/2016.
 */
public class CCMenu extends Activity
{
    Button Logout, Back;
    ToggleButton Immer1, Immer2, AC, Heating;
    CountDownTimer timer = new CountDownTimer(60000, new IIdleCallback()
    {
        @Override
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
        setContentView(R.layout.climate_control_menu);
        timer.startCountDownTimer();

        Logout = (Button) findViewById(R.id.buttonL);
        Back = (Button) findViewById(R.id.buttonB);
        Immer1 = (ToggleButton) findViewById(R.id.toggleButton);
        Immer2 = (ToggleButton) findViewById(R.id.toggleButton1);
        Immer2.setVisibility(View.GONE);
        AC = (ToggleButton) findViewById(R.id.toggleButton2);
        Heating = (ToggleButton) findViewById(R.id.toggleButton3);

        Logout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(CCMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(CCMenu.this, MainMenu.class));
                finish();
            }
        });

        Immer1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Immer1.isChecked())
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.ON;
                    System.out.println(state.getStateCode());
                    Immer2.setVisibility(View.VISIBLE);
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.OFF;
                    System.out.println(state.getStateCode());
                    Immer2.setVisibility(View.GONE);
                }
            }
        });

        Immer2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Immer2.isChecked())
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.SINK;
                    System.out.println(state.getStateCode());
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.BATH;
                    System.out.println(state.getStateCode());
                }
            }
        });

        AC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(AC.isChecked())
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

        Heating.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Heating.isChecked())
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

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(CCMenu.this, ErrorScreen.class));
            finish();
        }
    }
}

