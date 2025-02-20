package Tests;

import Pages.BrowserWindowPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareDataBrowser.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTest extends Hooks {

    CommonPage commonPage;
    HomePage homePage;
    BrowserWindowPage browserWindowPage;



    @Test

    public void metodaTest(){

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        homePage.clickOnAlerts();
        commonPage.clickOnSubMenu("Browser Windows");
        browserWindowPage.setBrowserWindows();





        WebElement alerts = getDriver().findElement(By.xpath("//*[@class='card mt-4 top-card'] [3]"));
        alerts.click();
        WebElement browserWindows = getDriver().findElement(By.xpath("//*[text()='Browser Windows'] "));
        browserWindows.click();

        //new tab button
        WebElement tabButton = getDriver().findElement(By.id("tabButton"));
        tabButton.click();

        //switch intre taburi
        List<String> tabList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabList.get(1));
        WebElement sampleText = getDriver().findElement(By.id("sampleHeading"));
        Assert.assertEquals(sampleText.getText(),"This is a sample page");
        getDriver().close();
        getDriver().switchTo().window(tabList.get(0));


        WebElement newWindow = getDriver().findElement(By.id("windowButton"));
        newWindow.click();
        
        List<String> windowList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowList.getLast());
        WebElement randomText = getDriver().findElement(By.id("sampleHeading"));
        Assert.assertEquals(randomText.getText(),"This is a sample page");
        getDriver().close();
        getDriver().switchTo().window(windowList.getFirst());
        //driver.close();


    }
}
