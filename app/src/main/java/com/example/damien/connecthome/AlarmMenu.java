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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        CountDownTimer timer = new CountDownTimer();
        timer.onUserInteraction();
        setContentView(R.layout.alarm_menu);

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
                startActivity(new Intent(AlarmMenu.this, LogoutScreen.class));
            }
        });

        Back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AlarmMenu.this, MainMenu.class));
            }
        });

        Set.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (ed1.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                }

                else
                {
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
                    }
                }
            }
        });

        Disarm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ed1.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Password",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0)
                    {
                        Disarm.setEnabled(false);
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(AlarmMenu.this, ErrorScreen.class));
        }
    }
}

