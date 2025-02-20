package Tests;

import Pages.HomePage;
import ShareDataBrowser.ShareData;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class textBoxTest extends ShareData {


    HomePage homePage;


    //demoQaTests
    @Test
    //openSite


    public void metodaTest()
    {
        homePage = new HomePage(getDriver());

        //variabile
        String name = "Roxana";
        String emailVal = "rorxana@gmail.com";
        String currentAddr = "Str. ddd, nr. 0";
        String permanentAddr = "Str. ddd, nr. 0";


        //scroll method
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,500)");


        //User clicks on the elements button
        WebElement elementsButton = getDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementsButton.click();

        //user clicks on the text box button
        WebElement txtBoxButton = getDriver().findElement(By.xpath("//span [text()='Text Box']"));
        txtBoxButton.click();

        //user enters credentials in the full name field
        WebElement fullNameField = getDriver().findElement(By.id("userName"));
        fullNameField.sendKeys(name);

        //user enters valid credentials in the email field
        WebElement userEmailField = getDriver().findElement(By.id("userEmail"));
        userEmailField.sendKeys(emailVal); //no space between

        //user enters credentials in the current address field
        WebElement currentAddressField = getDriver().findElement(By.id("currentAddress"));
        currentAddressField.sendKeys(currentAddr);

        //user enters credentials in the permanent address field
        WebElement permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        permanentAddressField.sendKeys(permanentAddr);

        //scroll
        javascriptExecutor.executeScript("window.scrollTo(0,500)");

        //user clicks on the submit button
        WebElement submitBtn = getDriver().findElement(By.id("submit"));
        submitBtn.click();

        WebElement nameOutput = getDriver().findElement(By.id("name"));
        WebElement emailOutput = getDriver().findElement(By.id("email"));
        WebElement currentAddress = getDriver().findElement(By.xpath("//p[@class='mb-1'][3]")); //dupa clasa de care e nevoie
        WebElement permanentAddress = getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));


        String outputNameString = nameOutput.getText();
        String outputCurrentAddress = currentAddress.getText();


        Assert.assertTrue(outputNameString.contains(name));
        Assert.assertTrue(emailOutput.getText().contains(emailVal));
        Assert.assertTrue(outputCurrentAddress.contains(currentAddr));
        Assert.assertTrue(permanentAddress.getText().contains(permanentAddr));

    }
}
