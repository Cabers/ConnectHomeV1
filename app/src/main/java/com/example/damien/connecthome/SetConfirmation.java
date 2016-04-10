package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cabers on 04/01/2016.
 */

public class SetConfirmation extends Activity
{
    Button Ok;
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
        setContentView(R.layout.set_confirmation);
        timer.startCountDownTimer();

        Ok=(Button)findViewById(R.id.button);
        Ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(SetConfirmation.this, AlarmMenu.class));
                finish();
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(SetConfirmation.this, ErrorScreen.class));
            finish();
        }
    }

}