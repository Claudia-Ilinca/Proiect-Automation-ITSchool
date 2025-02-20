package Pages;

import HelperMethods.ElementsMethod;
import ShareDataBrowser.ShareData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ShareData
{


    ElementsMethod elementsMethod;

    public HomePage(WebDriver driver)
    {
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h5[text() = 'Forms']")
    WebElement formsButton;

    @FindBy(xpath = "//*[@class='card mt-4 top-card'] [3]")
    WebElement alerts;

    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement elementsButton;

    @FindBy(xpath = "//h5[text() = 'Widgets']")
    WebElement widgets;

    public void clickOnForms()
    {
        elementsMethod.clickOnElement(formsButton);
    }

    public void clickOnAlerts()
    {
        elementsMethod.clickOnElement(alerts);
    }

    public void clickOnElementsButton()
    {
        elementsMethod.clickOnElement(elementsButton);
    }

    public void clickOnWidgets()
    {
        elementsMethod.clickOnElement(widgets);
    }

}
