package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void login(){
        System.out.println("UMS website");
        Assert.fail();
    }
    @Test(dependsOnMethods = "login")
    void dashboard(){
        System.out.println("dashboard accessed");
//        Assert.fail();
    }
    @Test(dependsOnMethods = {"dashboard","login"},alwaysRun = true)
    void message(){

        System.out.println("message view");
    }
}
