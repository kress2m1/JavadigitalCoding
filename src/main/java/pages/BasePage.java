package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by andredadalinux on 30/06/17.
 */
public class BasePage {

    protected WebDriver driver;

    /**
     * This constructor will initialise the driver
     * which will be used across all other required classed for calling the
     * browser.
     * @param driver
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchMe() {

    }
}
