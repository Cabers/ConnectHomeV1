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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        CountDownTimer timer = new CountDownTimer();
        timer.onUserInteraction();
        setContentView(R.layout.logout_menu);

        SignBackIn = (Button) findViewById(R.id.button);
        SignBackIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            startActivity(new Intent(LogoutScreen.this, ErrorScreen.class));
            finish();
        }
    }

}
