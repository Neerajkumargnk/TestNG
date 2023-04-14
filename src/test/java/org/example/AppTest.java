package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
@Test(priority = 2)
public class AppTest{
    public void openBrowser(){
        System.out.println("open browser");
        Assert.assertEquals(1,2);
    }
    @Test(priority = 1)
    public void clickUMS(){
        System.out.println("opened website");
    }
    @Test
    public void openHomePage(){
        System.out.println("opened homepage");
    }
    @Test
    public void openUMS(){
        System.out.println("opened ums");
    }
    @Test
    public void closeUMS(){
        System.out.println("closed ums");
    }

}
