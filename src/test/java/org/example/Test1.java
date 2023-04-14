package org.example;
import org.testng.annotations.*;

public class Test1{
    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will run before suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("This will run after suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("This will run before test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will run after test");
    }
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
    void fun1(){
        System.out.println("this is fun1");
    }
    @Test
    void fun2(){
        System.out.println("this is fun2");
    }
    @Test
    void fun3(){
        System.out.println("this is fun3");
    }


}
