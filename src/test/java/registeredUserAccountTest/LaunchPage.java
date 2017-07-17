package registeredUserAccountTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

/**
 * Created by andredadalinux on 14/07/17.
 */
public class LaunchPage {

    HomePage homePage = new HomePage();

    @Before
    public void openBrowser() {
        homePage.gotoLandingPage();
    }

    @After
    public void closeBrowser() {

    }
}
