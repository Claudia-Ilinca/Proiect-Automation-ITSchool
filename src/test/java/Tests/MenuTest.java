package Tests;

import ShareDataBrowser.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MenuTest extends Hooks {  WebDriver driver;

    @Test

    public void metodaTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement widgets = driver.findElement(By.xpath("//h5[text() = 'Widgets']"));
        widgets.click();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,500)");

        //list
        List<WebElement> alertsList = driver.findElements(By.xpath("//*[ @class = 'element-list collapse show'] //*[@class = 'btn btn-light ']"));
        alertsList.get(7).click();

        WebElement mainItem2 = driver.findElement(By.xpath("//*[text() = 'Main Item 2' ]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainItem2)
                .build()
                .perform();

        WebElement sublist = driver.findElement(By.xpath("//*[text()='SUB SUB LIST »']"));
        actions.moveToElement(sublist).build().perform();

        WebElement subItem = driver.findElement(By.xpath("//*[text()='Sub Sub Item 1']"));
        actions.click(subItem).build().perform();
}}
