package com.blogspot.syntaxcandy;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
 
public abstract class BaseClass {
    
    @BeforeTest
    public void beforeTest() {
        System.out.println();
    }
    
    @BeforeClass
    public void beforeClass() {
        System.out.println("BaseClass::@BeforeClass");
    }
}
