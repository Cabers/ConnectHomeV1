package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by caber on 04/01/2016.
 */
public class DisarmConfirmation extends Activity
{
    Button Ok;
    CountDownTimer timer = new CountDownTimer(60000, new IIdleCallback()
    {
        @Override
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
        setContentView(R.layout.disarm_confirmation);
        timer.startCountDownTimer();

        Ok=(Button)findViewById(R.id.button);
        Ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(DisarmConfirmation.this, AlarmMenu.class));
                finish();
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(DisarmConfirmation.this, ErrorScreen.class));
            finish();
        }
    }

}
