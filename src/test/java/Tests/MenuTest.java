package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MenuTest {
    WebDriver driver;

    @Test
    public void MetodaTest() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement Widgets = driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][4]"));
        Widgets.click();

        /*List<WebElement> MenuList = driver.findElements(By.xpath("//*[@class='element-list collapse show']//*[@class='btn btn-light']"));
        MenuList.get(7).click();*/

        WebElement menuButtonList = driver.findElement(By.xpath("//*[text()='Menu']"));
        menuButtonList.click();

        /*WebElement mainitem2 = driver.findElement(By.xpath("//*[text()='Main item 2']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainitem2)
                .build()
                .perform();*/

        /*WebElement sublist = driver.findElement(By.xpath("//*[text()='SUB SUB LIST>>']"));
        actions.moveToElement(sublist)
                .build()
                .perform();

        WebElement sublist1 = driver.findElement(By.xpath("//*[text()='Sub Sub Item 1']"));
        actions.click(sublist1)
                .build()
                .perform();*/



    }
}
