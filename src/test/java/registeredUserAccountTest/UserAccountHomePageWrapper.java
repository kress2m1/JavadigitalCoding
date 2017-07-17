package registeredUserAccountTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.HomePage;

/**
 * Created by andre on 15/06/17.
 *
 */
public class UserAccountHomePageWrapper {

    BasePage basePage = new BasePage();
    String username = "WaleJamesMeMe";
    String password = "Skr2ll8mings";

    @Before
    public void setUp() throws Exception {
        basePage.openLandingPage("chrome");

    }

    @Test
    public void logIntoSSLAccount() {
        basePage.logIntoAccount(username, password);
    }

    @After
    public void tearDown() throws Exception {
        basePage.closeBrowserSession();
    }
}
