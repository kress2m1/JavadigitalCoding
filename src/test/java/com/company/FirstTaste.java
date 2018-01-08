package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class FirstTaste {

    private WebDriver driver;

    String userEmail = "geoff.thompson@planittesting.com";
    String userPassword = "Wednesday1342";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oogunseyila\\Documents\\RadiusRepo\\VelocityFramework\\drivers\\windows\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://mobile.velocity.radius.solutions/accounts/login/");
    }

    @Test()
    public void testToValidateHomePage() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.equals("Login"));
    }

    @Test
    public void validLogin() {
        WebElement usernameField = driver.findElement(By.id("id_username"));
        WebElement passwordField = driver.findElement(By.id("id_password"));
        usernameField.sendKeys(userEmail);
        passwordField.sendKeys(userPassword);
        WebElement loginButton = driver.findElement(By.className("login-image-button"));
        loginButton.click();
        String loginPageTitle = driver.getTitle();
        Assert.assertTrue(loginPageTitle.contains("Company ABC - 10G: 20 UK Fuels"));
    }

    @Test
    public void checkVehicleCheckSubMenu() {
        validLogin();
        WebElement vehicleCheckMenu = driver.findElement(By.linkText("Vehicle Check"));
        Actions action = new Actions(driver);
        action.moveToElement(vehicleCheckMenu).build().perform();
        List<WebElement> vehicleMenu = driver.findElements(By.className("dropdown"));
    }

    @Test
    public void CheckVehicleTile() {
        validLogin();
        WebElement vehicleTile = driver.findElement(By.className("background_image"));
        vehicleTile.click();
        System.out.println(driver.getCurrentUrl());
       // WebElement ManageFleet = driver.findElement(By.id("vehicle-check-manage-fleet"));
        //WebElement ManageGroups = driver.findElement(By.className("vehicle-check-manage-groups"));
        //WebElement Reports = driver.findElement(By.className(""))
        //WebElement ManageQuestions
        //assertTrue(ManageFleet.isDisplayed());
       // assertTrue(ManageGroups.isDisplayed());

    }

    @Test
    public void testToValidateURL() {
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);
    }
    @Test
    public void SelectManageFleet() {
        CheckVehicleTile();
        WebElement ManageFleetTile = driver.findElement(By.id("vehicle-check-manage-fleet"));
        ManageFleetTile.click();
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}