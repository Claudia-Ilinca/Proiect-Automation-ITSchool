package Tests;


import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareDataBrowser.Hooks;

import org.testng.annotations.Test;


public class AlertsTest extends Hooks {

    CommonPage commonPage;
    HomePage homePage;
    AlertsPage alertsPage;

    @Test

    public void metodaTest() throws InterruptedException {


        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());
        homePage.clickOnAlerts();
        commonPage.clickOnSubMenu("Alerts");
        alertsPage.dealWithAlertPrompt("Koko");
        alertsPage.dealWithAlertDelay();
        alertsPage.dealWithAlertConfirm();
        alertsPage.dealWithAlertOk();









       /* WebElement clickButton1 = driver.findElement(By.id("alertButton"));
        clickButton1.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement clickButton2 = driver.findElement(By.id("timerAlertButton"));
        clickButton2.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement clickButton3 = driver.findElement(By.id("confirmButton"));
        clickButton3.click();
        driver.switchTo().alert().dismiss();

        WebElement clickButton4 = driver.findElement(By.id("promtButton"));
        clickButton4.click();
        driver.switchTo().alert().sendKeys("Koko");
        driver.switchTo().alert().accept();
        driver.close();
*/

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Un wait global valabil pt toate interactiunile cu elementele din cod, asteapta N secunde sa gaseasca find element-ul

       // WebElement clickButton3 = driver.findElement(By.id(""));

    }
}
