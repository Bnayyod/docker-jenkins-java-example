package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @org.junit.jupiter.api.Test
    public void testConstructor(){
        Hello hello = new Hello();
        Hello hello2 = new Hello();
        assertEquals(hello.getHelloMessage(),hello2.getHelloMessage());
    }

    @Test
    public void testGetMessage(){
        Hello hello = new Hello();
        assertEquals("Hello.", hello.getHelloMessage());
        assertEquals("Thank you from Jenkins.", hello.getJenkinsMessage());
    }
}