package com.xrq.aop;

/**
 * Created by liujm on 2017/11/25.
 */
public class HelloWorldImpl1 implements HelloWorld
{
    @Override
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    @Override
    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl1.doPrint()");

    }
}