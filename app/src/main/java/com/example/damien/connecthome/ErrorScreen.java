package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cabers on 04/01/2016.
 */
public class ErrorScreen extends Activity
{
    Button Back;
    CountDownTimer timer = new CountDownTimer(60000, new IIdleCallback()
    {
        public void inactivityDetected()
        {
            finish();
            System.exit(0);
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.error_screen);
        timer.restartCountDownTimer();

        Back = (Button)findViewById(R.id.button);
        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(ErrorScreen.this, MainMenu.class));
                finish();
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(ErrorScreen.this, ErrorScreen.class));
            finish();
        }
    }

}
