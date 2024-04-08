package com.easydemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasyDemoTest {

    @Test
    public void divideTwoNumbersTest1() {
        int num1 = 2;
        int num2 = 2;
        assertEquals (EasyDemo.divideTwoNumbers(num1, num2), 1);
    }

    @Test
    public void divideTwoNumbersTest2() {
        int num1 = 0;
        int num2 = 2;
        assertEquals (EasyDemo.divideTwoNumbers(num1, num2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideTwoNumbersTest3() {
        int num1 = 2;
        int num2 = 0;
        EasyDemo.divideTwoNumbers(num1, num2);
    }
}