package Pages;

import HelperMethods.BrowserWindowsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowPage extends CommonPage{

    HomePage homePage;
    BrowserWindowsMethods browserWindowsMethods;

    public BrowserWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Browser Windows'] ")
    WebElement browserWindows;
    @FindBy(xpath = "tabButton")
    WebElement tabButton;
    @FindBy(id="windowButton")
    WebElement windowButton;

    public void setBrowserWindows()
    {
        homePage.clickOnAlerts();
        browserWindows.click();
        tabButton.click();
        browserWindowsMethods.newWindowHandle();
        windowButton.click();
        browserWindowsMethods.newTabHandle();

    }
}
