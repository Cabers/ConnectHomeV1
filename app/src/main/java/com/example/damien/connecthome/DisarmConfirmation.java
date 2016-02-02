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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disarm_confirmation);

        Ok=(Button)findViewById(R.id.button);

        Ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(DisarmConfirmation.this, AlarmMenu.class));
            }
        });

        try
        {

        }

        catch(Exception e)
        {
            startActivity(new Intent(DisarmConfirmation.this, ErrorScreen.class));
        }
    }

}
