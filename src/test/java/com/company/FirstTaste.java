package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by andredadalinux on 20/07/17.
 */
public class FirstTaste {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/media/andredadalinux/Andre Drive/Java2016/JavaCodingTutorials/digitalcoding/drivers/linux/chrome/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://live.guru99.com/index.php/");
    }

    @Test()
    public void testToValidateHomePage() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.equals("Home page"));
    }

    @Test
    public void testToValidateURL() {
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}