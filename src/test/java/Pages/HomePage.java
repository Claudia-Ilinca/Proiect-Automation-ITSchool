package Pages;

import HelperMethods.ElementsMethods;
import ShareData.ShareDataBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ShareDataBrowser
{

    WebDriver driver;

    ElementsMethods elementsMethods;

    //constructorul parametrizat
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement formsButton;

    @FindBy(xpath = "(//*[contains(@class, 'card mt-4 top-card')])[3]")
    WebElement allertWindowFrameButton;

    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement ElementsButton;

    @FindBy(xpath = "//*[text()='Widgets']")
    WebElement widgetsButton;

    public void clickOnForms()
    {
        elementsMethods.clickOnElement(formsButton);
    }

    public void clickOnAlert()
    {
        elementsMethods.clickOnElement(allertWindowFrameButton);
    }

//    public void clickOnElementButton()
//    {
//        elementsMethods.clickOnElement(elementsMethods);
//    }

    public void clickOnWidgets()
    {
        elementsMethods.clickOnElement(widgetsButton);
    }


}
