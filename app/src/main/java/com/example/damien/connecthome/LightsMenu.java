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

    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lights_menu);

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
                startActivity(new Intent(LightsMenu.this, LogoutScreen.class));
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(LightsMenu.this, MainMenu.class));
            }
        });

        Kitchen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Kitchen.isChecked())
                {

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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

                }

                else
                {

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
            startActivity(new Intent(LightsMenu.this, ErrorScreen.class));
        }
    }

}

