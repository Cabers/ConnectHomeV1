package com.example.damien.connecthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by cabers on 01/02/2016.
 */
    public class CountDownTimer extends Activity
    {
        public final long DISCONNECT_TIMEOUT = 60000; //1*60*1000= 1 Minute

        public Handler disconnectHandler = new Handler();
        {

        }


        private Runnable disconnectCallback = new Runnable()
        {
            public void run()
            {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        };

        public void resetDisconnectTimer()
        {
            disconnectHandler.removeCallbacks(disconnectCallback);
            disconnectHandler.postDelayed(disconnectCallback, DISCONNECT_TIMEOUT);
        }

        public void stopDisconnectTimer()
        {
            disconnectHandler.removeCallbacks(disconnectCallback);
        }

        public void onUserInteraction()
        {
            resetDisconnectTimer();
        }

        public void onResume()
        {
            super.onResume();
            resetDisconnectTimer();
        }

        public void onStop()
        {
            super.onStop();
            stopDisconnectTimer();
        }
}
