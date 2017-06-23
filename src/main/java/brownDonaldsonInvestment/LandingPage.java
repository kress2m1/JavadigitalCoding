package brownDonaldsonInvestment;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by andre on 24/05/17.
 *
 */
public class LandingPage {

    protected WebDriver driver;
    protected String baseURL;
    protected WebElement username;
    protected WebElement password;

    public void openLandingPage(String browser) {
        String dirPath = System.getProperty("user.dir");
        if (browser.equals("firefox")) {
            String firefoxPath = dirPath + "/drivers/linux/firefox/geckodriver";
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            String chromePath = dirPath + "/drivers/linux/chrome/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
        }

//        launch the browser
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseURL = "https://bdonline.sqe.com/";
        driver.navigate().to(baseURL);
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
        WebElement tickNewsletterBox = driver.findElement(By.name("newsletter"));
        if (!tickNewsletterBox.isSelected()) {
            tickNewsletterBox.click();
        }
        WebElement selectLoginTab = driver.findElement(By.name("login_button"));
        selectLoginTab.click();

        for (WebElement aTagName : driver.findElements(By.tagName("a"))) {
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
