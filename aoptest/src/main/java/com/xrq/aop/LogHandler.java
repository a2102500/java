package com.xrq.aop;

/**
 * Created by liujm on 2017/11/26.
 */
public class LogHandler
{
    public void LogBefore()
    {
        System.out.println("Log before method");
    }

    public void LogAfter()
    {
        System.out.println("Log after method");
    }
}