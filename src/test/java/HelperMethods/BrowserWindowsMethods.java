package HelperMethods;

import ShareDataBrowser.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsMethods extends Hooks
{ WebDriver driver;

    public BrowserWindowsMethods(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id="sampleHeading")
    WebElement sampleHeading;

    public void newTabHandle ()
    {
        List<String> tabList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabList.get(1));
        WebElement sampleText = getDriver().findElement(By.id("sampleHeading"));
        Assert.assertEquals(sampleText.getText(),"This is a sample page");
        getDriver().close();
        getDriver().switchTo().window(tabList.get(0));
    }

    public void newWindowHandle()
    {
        List<String> windowList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowList.getLast());
        WebElement randomText = getDriver().findElement(By.id("sampleHeading"));
        Assert.assertEquals(randomText.getText(),"This is a sample page");
        getDriver().close();
        getDriver().switchTo().window(windowList.getFirst());
    }
}
