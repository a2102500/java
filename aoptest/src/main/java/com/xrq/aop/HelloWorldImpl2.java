package com.xrq.aop;

/**
 * Created by liujm on 2017/11/25.
 */
public class HelloWorldImpl2 implements HelloWorld
{
    @Override
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    @Override
    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");

    }
}