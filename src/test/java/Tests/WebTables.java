package Tests;

import Pages.HomePage;
import ShareDataBrowser.ShareData;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class webTables extends ShareData {

    HomePage homePage;


    //demoQaTests
    @Test
    //openSite


    public void metodaTest() {

        homePage = new HomePage(getDriver());

        //variabile
        String firstName = "First";
        String lastName = "Last";
        String valEmail = "valid@email.com";
        String valAge = "26";
        String valSalary = "2000";
        String chooseDep = "Whatever";


        //scroll method
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,500)");


        WebElement elementsButton = getDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementsButton.click();

        //user clicks on webTables button
        WebElement webTablesButton = getDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesButton.click();

        //user deletes an entry from the table
        /*WebElement webDelBtn = driver.findElement(By.id("delete-record-1"));
        webDelBtn.click();*/

        List<WebElement> listaTabel = getDriver().findElements(By.xpath("//*[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int numarElementeLista = listaTabel.size();







        //user clicks on add btn
        WebElement addButton = getDriver().findElement(By.xpath("//* [@id='addNewRecordButton']"));
        addButton.click();

        //user enters valid first name
        WebElement firstNameField = getDriver().findElement(By.id("firstName"));
        firstNameField.sendKeys(firstName);

        //user enters valid first name
        WebElement lastNameField = getDriver().findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);

        //user enters valid email
        WebElement emailField = getDriver().findElement(By.id("userEmail"));
        emailField.sendKeys(valEmail);

        //user enters age
        WebElement ageField = getDriver().findElement(By.id("age"));
        ageField.sendKeys(valAge);

        //user enters salary
        WebElement salaryField = getDriver().findElement(By.id("salary"));
        salaryField.sendKeys(valSalary);

        //user enters department
        WebElement depField = getDriver().findElement(By.id("department"));
        depField.sendKeys(chooseDep);

        //user clicks submit
        WebElement submitBtn = getDriver().findElement(By.id("submit"));
        submitBtn.click();

        List<WebElement> listaTabelUpdated = getDriver().findElements(By.xpath("//*[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int randNou = numarElementeLista + 1;
        Assert.assertEquals(listaTabelUpdated.size(), randNou);




       /* javascriptExecutor.executeScript("window.scrollTo(0,500)");


        WebElement firstNameOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][1]"));
        WebElement secondNameOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][2]"));
        WebElement emailOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][4]"));
        WebElement ageOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][3]"));
        WebElement salaryOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][5]"));
        WebElement departamentOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group'][4]//*[@class='rt-td'][6]"));

        //var
        String firstOuputString = firstNameOutput.getText();
        String lastOutputString = secondNameOutput.getText();
        String emailOutputString = emailOutput.getText();
        String ageOutputString = ageOutput.getText();
        String salaryOutputString = salaryOutput.getText();
        String departamentOutputString = departamentOutput.getText();

        //asserts
        Assert.assertTrue(firstOuputString.contains(firstName));
        Assert.assertTrue(lastOutputString.contains(lastName));
        Assert.assertTrue(emailOutputString.contains(valEmail));
        Assert.assertTrue(ageOutputString.contains(valAge));
        Assert.assertTrue(salaryOutputString.contains(valSalary));
        Assert.assertTrue(departamentOutputString.contains(chooseDep));
*/



    }
}