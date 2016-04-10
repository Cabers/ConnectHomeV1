package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cabers on 04/01/2016.
 */
public class LogoutScreen extends Activity
{
    Button SignBackIn, Exit;
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
        setContentView(R.layout.logout_menu);
        timer.startCountDownTimer();

        SignBackIn = (Button) findViewById(R.id.button);
        SignBackIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.stopCountDownTimer();
                startActivity(new Intent(LogoutScreen.this, MainActivity.class));
                finish();
            }
        });

        Exit = (Button) findViewById(R.id.button1);
        Exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
                System.exit(0);
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(LogoutScreen.this, ErrorScreen.class));
            finish();
        }
    }

}