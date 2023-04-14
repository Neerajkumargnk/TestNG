package org.example;

import org.testng.annotations.*;

public class Test2 {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will run before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This will run after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This is after method");
    }

    @Test
    void fun4(){
        System.out.println("this is fun4");
    }
    @Test
    void fun5(){
        System.out.println("this is fun5");
    }
    @Test
    void fun6(){
        System.out.println("this is fun6");
    }


}
