package com.xrq.aop;

/**
 * Created by liujm on 2017/11/25.
 */
//横切关注点
public class TimeHandler
{
    public void printTime()
    {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }
}