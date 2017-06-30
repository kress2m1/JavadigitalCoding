package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by andredadalinux on 30/06/17.
 */
public class HomePage extends BasePage {

//    this is a constructor from the superclass, BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean checkUserDetails(String username) {
        return driver.getPageSource().toLowerCase().contains(username.toLowerCase());
    }

    @Override
    public void searchMe() {
        super.searchMe();
    }
}
