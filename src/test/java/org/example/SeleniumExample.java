package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SeleniumExample {
//    public void googletest() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//
//        driver.manage().window().maximize();
//
//        driver.findElement(By.name("q")).sendKeys("phone");
//        Thread.sleep(1000);
//
//        driver.findElement(By.name("btnK")).click();
//        Thread.sleep(1000);
//        Assert.assertEquals(driver.getTitle(), "phone - Google Search");
//
//        driver.close();
//    }
        ChromeDriver driver;
        @BeforeClass
    void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.jiosaavn.com/login?redirect=/");

        driver.manage().window().maximize();
    }
    @Test
    void getTitleFromPage() throws InterruptedException {
            driver.findElement(By.name("email")).sendKeys("neerajkumarsmarty12345@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.id("password")).sendKeys("Neeraj.#12");
            Thread.sleep(60000);
            //driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[2]/div/div/div/div/div/section/form/fieldset/div[4]/button")).click();
            Thread.sleep(1000);
    }
//        driver.findElement(By.name("q")).sendKeys("phone");
//        Thread.sleep(1000);
//
//        driver.findElement(By.name("btnK")).click();
//        Thread.sleep(1000);
//        Assert.assertEquals(driver.getTitle(), "phone - Google Search");
//    }
//    @AfterClass
//    void closeDriver(){
//
//            driver.close();
//    }

}

