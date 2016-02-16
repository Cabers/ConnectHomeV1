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
                startActivity(new Intent(CCMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
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
                    Immer2.setVisibility(View.VISIBLE);
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    Immer2.setVisibility(View.GONE);
                    finish();
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
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    finish();
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
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    finish();
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
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    finish();
                }
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(CCMenu.this, ErrorScreen.class));
            finish();
        }
    }
}

