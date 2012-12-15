package com.blogspot.syntaxcandy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A extends BaseClass {
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("A::@BeforeMethod");
        throw new RuntimeException();
    }
    
    @Test
    public void testA() {
        System.out.println("A::@Test");
    }
}
