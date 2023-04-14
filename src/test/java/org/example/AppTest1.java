package org.example;

import org.testng.annotations.Test;

@Test(priority = 1)
public class AppTest1 {

    void clickLogin(){
        System.out.println("Opened login page");
    }
    @Test(priority = 2)
    void homePage(){
        System.out.println("Home page");
    }
    @Test(priority = 3)
    void contactPage(){
        System.out.println("Contact page");
    }
}
