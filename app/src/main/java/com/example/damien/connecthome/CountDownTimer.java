package com.example.damien.connecthome;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cabers on 01/02/2016.
 */

public class CountDownTimer extends Activity
{
    private Boolean isTimerRunning;
    private IIdleCallback idleCallback;
    private int maxIdleTime;
    private Timer timer;

    public CountDownTimer(int maxInactivityTime, IIdleCallback callback)
    {
        maxIdleTime = maxInactivityTime;
        idleCallback = callback;
    }

    /*
     *  creates new timer with CountDownTimer parameters and schedules a task
     */
    public void startCountDownTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                idleCallback.inactivityDetected();
            }
        }, maxIdleTime);
        isTimerRunning = true;
    }

    /*
     *  schedules new timer, call this to reset timer
     */
    public void restartCountDownTimer() {
        stopCountDownTimer();
        startCountDownTimer();
    }

    /*
     *  stops CountDownTimer, cancelling all scheduled tasks in it
     */
    public void stopCountDownTimer() {
        timer.cancel();
        isTimerRunning = false;
    }

    /*
     *  check current state of timer
     *  @return boolean isTimerRunning
     */
    public boolean checkIsTimerRunning() {
        return isTimerRunning;
    }

    public void onResume()
    {
        super.onResume();
        CountDownTimer timer = new CountDownTimer(60000, new IIdleCallback()
        {
            public void inactivityDetected()
            {
                finish();
                System.exit(0);
            }
        });
        timer.startCountDownTimer();
    }

}

abstract class IIdleCallback
{
    public abstract void inactivityDetected();
}