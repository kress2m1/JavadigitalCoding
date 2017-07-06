package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by andredadalinux on 30/06/17.
 */
public class HomePage extends BasePage {

    BasePage newBasePage = new BasePage();

//    this is a constructor from the superclass, BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

}
