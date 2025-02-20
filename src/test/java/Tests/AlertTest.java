package Tests;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class AlertTest  extends Hooks {

        /*WebDriver driver;*/
        HomePage homePage;
        CommonPage commonPage;
        AlertsPage alertsPage;

        @Test
        public void metodaTest() {

            /*driver = new ChromeDriver();
            driver.get("https://demoqa.com/");
            driver.manage().window().maximize();*/

            homePage = new HomePage(getDriver());
            commonPage = new CommonPage(getDriver());
            alertsPage = new AlertsPage(getDriver());

            this.getDriver().manage().window().maximize();
            homePage.clickOnAlert();
            commonPage.clickOnSubMenu("Alerts");
            alertsPage.dealWithAlertDelay();
            alertsPage.dealWithAlertPrompt("OK");
            alertsPage.dealWithAlertOk();
            alertsPage.dealWithAlertConfirm();



            /*WebElement allertsFrameWindows = driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
            allertsFrameWindows.click();

            //1 varianta
            WebElement allertsButtonList = driver.findElement(By.xpath("//*[text()='Alerts']"));
            allertsButtonList.click();*/

            //a 2 varianta
            /*List<WebElement> windowList = driver.findElements(By.xpath("//*[@class='element-list collapse show']//*[@class='btn btn-light']"));
            windowList.get(1).click();*/

            //click Button
            /*WebElement clickButton1 = driver.findElement(By.id("alertButton"));
            clickButton1.click();

            //se da click pe buton de click me si ok
            Alert alert = driver.switchTo().alert();
            alert.accept();

            //un wait global care e valabil ptr toate interactiunile cu elementele din cod, asteapta n secunde sa gaseasca find elementul -
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Gasim butonul pentru alerta cu intarziere (5 secunde
            WebElement clickButton2 = driver.findElement(By.id("timerAlertButton"));
            clickButton2.click();

            //timer
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            /*Alert alert1 = driver.switchTo().alert();*/
            /*driver.switchTo().alert().accept();
            /*alert1.accept();*/

            /*WebElement clickButton3 = driver.findElement(By.id("confirmButton"));
            clickButton3.click();

            driver.switchTo().alert().dismiss();

            WebElement clickButton4 = driver.findElement(By.id("promtButton"));
            clickButton4.click();

            driver.switchTo().alert().sendKeys("Claudia");
            driver.switchTo().alert().accept();*/


        }

}
