package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by andredadalinux on 30/06/17.
 */
public class HomePage extends BasePage {

    BasePage newBasePage = new BasePage();

//    this is a constructor from the superclass, BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage() {

    }

    public void gotoLandingPage() {
        newBasePage.openLandingPage("firefox");
    }

    public void selectSomething() {
        WebElement carOptions = driver.findElement(By.id("lemme"));
        Select selectCar = new Select(carOptions);
        selectCar.selectByIndex(2);
    }
}
