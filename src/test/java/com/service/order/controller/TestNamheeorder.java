package com.service.order.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestNamheeorder {

        NamheeorderDelegate namheeorderDelegate = new NamheeorderDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = namheeorderDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}