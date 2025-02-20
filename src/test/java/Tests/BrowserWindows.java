package Tests;

import Pages.HomePage;
import ShareData.Hooks;
import ShareData.ShareDataBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class BrowserWindows extends Hooks {
    WebDriver driver;

    @Test
    public void metodaTest(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(this.getDriver());


        WebElement allertWindowFrameButton = driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][3]"));
        allertWindowFrameButton.click();

        WebElement browserWindowsButton = driver.findElement(By.xpath("//*[text()='Browser Windows']"));
        browserWindowsButton.click();

        // new tab
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        WebElement sampleText = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(sampleText.getText(), "This is a sample page");

        //atunci cand comentam linia 40-inchide tabul curent, tabul in care se afla,focusul ramand tot pe tabul deschis chiar daca l-am inchis, atunci cand las linia 38 si 40 le deschide bine
        driver.close();
        driver.switchTo().window(tabList.get(0));

        //new window
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.getLast());
        WebElement newSampleText = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(newSampleText.getText(), "This is a sample page");

        driver.close();
        driver.switchTo().window(windowList.getFirst());

        driver.close();
    }
}
