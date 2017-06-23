package registeredUserAccount;

import brownDonaldsonInvestment.LandingPage;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by andre on 14/06/17.
 * This page is to validate and verify elements on a current user account homepage
 */
public class UserAccountHomePage {

    private String HomeMenuTab;
    private String YouraccountMenuTab;
    private String ResearchMenuTab;
    private String SupportMenuTab;
    private String CorporateInfomMnuTab;
    protected WebDriver driver;
    protected String baseURL;


    public void startBrowserSession(String browser) throws Exception {
        String systemPath = System.getProperty("user.dir");
        if (browser.equals("firefox")) {
            String firefoxPath = systemPath + "/drivers/linux/firefox/geckodriver";
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            String chromePath = systemPath + "/drivers/linux/chrome/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
        }

//        launch the browser
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseURL = "https://bdonline.sqe.com/login.asp";
        driver.navigate().to(baseURL);
    }

    public void logIntoAccount(String username, String password) {
        String userHomePageTitle = "B&D - Market News";
        WebElement loginUsername = driver.findElement(By.name("login"));
        loginUsername.sendKeys(username);
        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword.sendKeys(password);
        WebElement registeredLoginTab = driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[4]/table/tbody/tr[5]/td[2]/input"));
        registeredLoginTab.click();
        System.out.println(driver.getTitle());
        assert driver.getTitle().equals(userHomePageTitle);
    }

    public void closeBrowserSession() throws Exception {
        driver.quit();
    }
}
