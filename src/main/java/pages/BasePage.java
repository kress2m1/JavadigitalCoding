package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by andredadalinux on 30/06/17.
 */
public class BasePage {

    protected WebDriver driver;
    protected String baseURL;
    protected By loginUsername = By.name("login");
    protected By anchorTag = By.tagName("a");

    /**
     * This constructor will initialise the driver
     * which will be used across all other required classed for calling the
     * browser.
     * Here, all the locators common to each page, like the headers, footers, will be placed here
     * @param driver
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {

    }

    public void openLandingPage(String browser) {
        //        launch the browser
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
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseURL = "https://bdonline.sqe.com/";
        driver.navigate().to(baseURL);
    }


    public HomePage logIntoAccount(String username, String password) {
        String userHomePageTitle = "B&D - Market News";
        for (WebElement loginTagText : driver.findElements(anchorTag)) {
            if (loginTagText.getText().equals("Login for existing users")) {
                loginTagText.click();
                break;
            }
        }
        WebElement loginUsername = driver.findElement(By.name("login"));
        loginUsername.sendKeys(username);
        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword.sendKeys(password);
        WebElement registeredLoginTab = driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[4]/table/tbody/tr[5]/td[2]/input"));
        registeredLoginTab.click();
        System.out.println(driver.getTitle());
        assert driver.getTitle().equals(userHomePageTitle);
        return new HomePage(driver);
    }

    public void closeBrowserSession() throws Exception {
        driver.quit();
    }
}
