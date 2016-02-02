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
        setContentView(R.layout.logout_menu);

        SignBackIn = (Button) findViewById(R.id.button);

        SignBackIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogoutScreen.this, MainActivity.class));
            }
        });

        Exit = (Button) findViewById(R.id.button1);

        Exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
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
            startActivity(new Intent(LogoutScreen.this, ErrorScreen.class));
        }
    }

}
