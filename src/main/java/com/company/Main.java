package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by yemi.
 */
public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/media/andredadalinux/Andre Drive/Java2016/JavaCodingTutorials/digitalcoding/drivers/linux/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://live.guru99.com/index.php/");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.quit();

    }
}
