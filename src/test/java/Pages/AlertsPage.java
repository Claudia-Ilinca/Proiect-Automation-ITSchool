package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends CommonPage {


    ElementsMethod elementsMethod;
    AlertMethods alertMethods;

    public AlertsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "alertButton")
    WebElement alertButton1;

    @FindBy(id = "timerAlertButton")
    WebElement alertButton2;

    @FindBy(id = "confirmButton")
    WebElement alertButton3;

    @FindBy(id = "promtButton")
    WebElement alertButton4;

    public void dealWithAlertOk()
    {
        elementsMethod.clickOnElement(alertButton1);
        alertMethods.alertOk();
    }
    public void dealWithAlertDelay()
    {
     elementsMethod.clickOnElement(alertButton2);
     alertMethods.alertDelay();
    }
    public void dealWithAlertConfirm()
    {
        elementsMethod.clickOnElement(alertButton3);
        alertMethods.alertConfirm();
    }
    public void dealWithAlertPrompt(String text)
    {
        elementsMethod.clickOnElement(alertButton4);
        alertMethods.alertPrompt(text);
    }


}
