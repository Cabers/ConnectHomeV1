package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by caber on 04/01/2016.
 */

public class SetConfirmation extends Activity
{
    Button Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_confirmation);

        Ok=(Button)findViewById(R.id.button);

        Ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(SetConfirmation.this, AlarmMenu.class));
            }
        });
    }

}