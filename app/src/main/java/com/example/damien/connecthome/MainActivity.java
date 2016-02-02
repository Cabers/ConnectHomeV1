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

public class MainActivity extends Activity
{
    Button SignIn,Cancel;
    EditText ed1,ed2;
    TextView tx, tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignIn = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText1);
        Cancel = (Button)findViewById(R.id.button2);
        tx = (TextView)findViewById(R.id.textView4);
        tx1 = (TextView)findViewById(R.id.textView5);
        tx.setVisibility(View.GONE);
        tx1.setVisibility(View.GONE);

        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(), "Signing In",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, MainMenu.class));
                }

                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Router Name or Password",Toast.LENGTH_LONG).show();
                    tx.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0)
                    {
                        finish();
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(MainActivity.this, ErrorScreen.class));
        }
    }

}
