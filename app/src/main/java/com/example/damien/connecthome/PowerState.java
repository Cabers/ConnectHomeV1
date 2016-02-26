package com.example.damien.connecthome;

/**
 * Created by cabers on 25/02/2016.
 */
public enum PowerState
{
    ON(1),
    OFF(2),
    OPEN(3),
    SHUT(4),
    SET(5),
    DISARM(6),
    SINK(7),
    BATH(8);

    private final int stateCode;

    PowerState(int stateCode)
    {
        this.stateCode = stateCode;
    }

    public int getStateCode()
    {
        return this.stateCode;
    }

}
