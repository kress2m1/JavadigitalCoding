package pages;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BasePage;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by andre on 24/05/17.
 *
 */
public class CreateAccountPage extends BasePage {

    protected WebElement username;
    protected WebElement password;
    protected By loginButton = By.name("login_button");

    public void goToCreateAccountPage() {
        for (WebElement createAccountTab: driver.findElements(By.tagName("a"))
             ) {
            if (createAccountTab.getText().equals("Create a new account")) {
                createAccountTab.click();
                break;
            }
        }
    }

    public void verifyLandingPage() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
//        Assert.assertTrue(pageTitle.toLowerCase().equals("The Web Testing Handbook".toLowerCase()));
    }

    public void goToNewSSLAccountCreationPage() throws Exception {
        WebElement sslNewAccountTab = driver.findElement(By.linkText("Create a new account"));
        sslNewAccountTab.click();
    }

    public void createNewSSLAccount() throws Exception {
        WebElement authCode = driver.findElement(By.name("authcode"));
        authCode.sendKeys("11111111");
        username = driver.findElement(By.name("username"));
        username.sendKeys("WaleJamesMeMe");
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Wale");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("James");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("kress2m1@gmail.com");
        password = driver.findElement(By.name("password"));
        password.sendKeys("Skr2ll8mings");
        WebElement verifyPassword = driver.findElement(By.name("password2"));
        verifyPassword.sendKeys("Skr2ll8mings");
        WebElement balanceTransfer = driver.findElement(By.name("transferamount"));
        balanceTransfer.sendKeys("1000000");
        WebElement tickRememberMeBox = driver.findElement(By.name("rememberme"));
        if (!tickRememberMeBox.isSelected()) {
            tickRememberMeBox.click();
        }
        /**
         * Another way of writing the select statement above is as follows (using the boolean keyword
         * WebElement tickNewsletterBox = driver.findElement(By.name("newsletter"));
         * boolean newsletterBoxDefaultStatus = tickNewsletterBox.isSelected;
         * if(newsletterBoxDefaultStatus != true) {
         *  driver.findElement(By.name("newsletter")).click();
         * }
         */
        WebElement tickNewsletterBox = driver.findElement(By.name("newsletter"));
        if (!tickNewsletterBox.isSelected()) {
            tickNewsletterBox.click();
        }

        WebElement selectLoginTab = driver.findElement(By.name("login_button"));
        selectLoginTab.click();

        for (WebElement aTagName : driver.findElements(anchorTag)) {
            if (aTagName.getText().equals("Something")) {
                aTagName.click();
                break;
            }
        }
    }

    public void closeBrower() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
