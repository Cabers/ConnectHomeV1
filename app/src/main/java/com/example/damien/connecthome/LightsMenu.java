package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

/**
 * Created by cabers on 31/12/2015.
 */

public class LightsMenu extends Activity
{
    Button Logout, Back;
    ToggleButton Kitchen, Dining, Living, Hall, Bath, B1, B2, B3, FDoor, BDoor;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lights_menu);
        timer.startCountDownTimer();

        Logout = (Button) findViewById(R.id.buttonL);
        Back = (Button) findViewById(R.id.buttonB);
        Kitchen = (ToggleButton) findViewById(R.id.toggleButton);
        Dining = (ToggleButton) findViewById(R.id.toggleButton1);
        Living = (ToggleButton) findViewById(R.id.toggleButton2);
        Hall = (ToggleButton) findViewById(R.id.toggleButton3);
        Bath = (ToggleButton) findViewById(R.id.toggleButton4);
        B1 = (ToggleButton) findViewById(R.id.toggleButton5);
        B2 = (ToggleButton) findViewById(R.id.toggleButton6);
        B3 = (ToggleButton) findViewById(R.id.toggleButton7);
        FDoor = (ToggleButton) findViewById(R.id.toggleButton8);
        BDoor = (ToggleButton) findViewById(R.id.toggleButton9);

        Logout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(LightsMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(LightsMenu.this, MainMenu.class));
                finish();
            }
        });

        Kitchen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Kitchen.isChecked())
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

        Dining.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Dining.isChecked())
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

        Living.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Living.isChecked())
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

        Hall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Hall.isChecked())
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

        Bath.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Bath.isChecked())
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

        B1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(B1.isChecked())
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

        B2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(B2.isChecked())
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

        B3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(B3.isChecked())
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

        FDoor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(FDoor.isChecked())
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

        BDoor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(BDoor.isChecked())
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
            startActivity(new Intent(LightsMenu.this, ErrorScreen.class));
            finish();
        }
    }

}