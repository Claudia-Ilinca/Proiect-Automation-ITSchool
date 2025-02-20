package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage
{
    WebDriver driver;
    ElementsMethods elementsMethods;
    AlertMethods alertMethods;

    public AlertsPage(WebDriver driver)
    {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.alertMethods = new AlertMethods(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "alertButton")
    WebElement alertButton1;

    @FindBy(id = "timerAlert")
    WebElement alertButton2;

    @FindBy(id = "confirmButton")
    WebElement alertButton3;

    @FindBy(id = "promtButton")
    WebElement alertButton4;

    public void dealWithAlertOk()
    {
        elementsMethods.clickOnElement(alertButton1);
        alertMethods.alertOk();
    }

    public void dealWithAlertDelay()
    {
        elementsMethods.clickOnElement(alertButton2);
        alertMethods.alertDelay();
    }

    public void dealWithAlertConfirm()
    {
        elementsMethods.clickOnElement(alertButton3);
        alertMethods.alertConfirm();

    }

    public void dealWithAlertPrompt(String text)
    {
        elementsMethods.clickOnElement(alertButton4);
        alertMethods.alertPrompt(text);
    }

}
