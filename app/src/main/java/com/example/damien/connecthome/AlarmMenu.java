package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cabers on 04/01/2016.
 */
public class AlarmMenu extends Activity
{
    Button Logout, Back, Set, Disarm;
    EditText ed1, ed2;
    TextView tx, tx1;
    int counter = 3;
    String passcode = "1234";
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
        setContentView(R.layout.alarm_menu);
        timer.startCountDownTimer();

        Logout = (Button) findViewById(R.id.buttonL);
        Back = (Button) findViewById(R.id.buttonB);
        Set = (Button) findViewById(R.id.buttonSet);
        ed1 = (EditText) findViewById(R.id.editText);
        Disarm = (Button) findViewById(R.id.buttonDisarm);
        ed2 = (EditText) findViewById(R.id.editText1);
        tx = (TextView)findViewById(R.id.textView10);
        tx1 = (TextView)findViewById(R.id.textView12);
        tx.setVisibility(View.GONE);
        tx1.setVisibility(View.GONE);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.stopCountDownTimer();
                startActivity(new Intent(AlarmMenu.this, LogoutScreen.class));
                finish();
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                timer.stopCountDownTimer();
                startActivity(new Intent(AlarmMenu.this, MainMenu.class));
                finish();
            }
        });

        Set.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (ed1.getText().toString().equals(passcode))
                {
                    timer.stopCountDownTimer();
                    PowerState state = PowerState.SET;
                    System.out.println(state.getStateCode());
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AlarmMenu.this, SetConfirmation.class));
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.DISARM;
                    System.out.println(state.getStateCode());
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                    tx.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 2)
                    {
                        Toast.makeText(getApplicationContext(), "2 Attempts Remaining", Toast.LENGTH_SHORT).show();
                    }

                    if (counter == 1)
                    {
                        Toast.makeText(getApplicationContext(), "Last Attempt", Toast.LENGTH_SHORT).show();
                    }

                    if (counter == 0)
                    {
                        Set.setEnabled(false);
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        Disarm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ed2.getText().toString().equals(passcode))
                {
                    timer.stopCountDownTimer();
                    PowerState state = PowerState.DISARM;
                    System.out.println(state.getStateCode());
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AlarmMenu.this, DisarmConfirmation.class));
                    finish();
                }

                else
                {
                    timer.restartCountDownTimer();
                    PowerState state = PowerState.SET;
                    System.out.println(state.getStateCode());
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                    tx.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 2)
                    {
                        Toast.makeText(getApplicationContext(), "2 Attempts Remaining", Toast.LENGTH_SHORT).show();
                    }

                    if (counter == 1)
                    {
                        Toast.makeText(getApplicationContext(), "Last Attempt", Toast.LENGTH_SHORT).show();
                    }

                    if (counter == 0)
                    {
                        Set.setEnabled(false);
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            timer.stopCountDownTimer();
            startActivity(new Intent(AlarmMenu.this, ErrorScreen.class));
            finish();
        }
    }

}

