package Tests;

import Pages.HomePage;
import ShareDataBrowser.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends ShareData {


    HomePage homePage;

    @Test
    public void metodaTest(){

        homePage = new HomePage(getDriver());

        WebElement elements = getDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elements.click();

        String firstName = "First";
        String lastName = "Last";
        String valEmail = "valid@email.com";
        String valAge = "26";
        String valSalary = "2000";
        String chooseDep = "Whatever";


        //scroll method
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,500)");


        //user clicks on webTables button
        WebElement webTablesButton = getDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesButton.click();

        adaugareRand("Roxana", "Orz", "rrrr@gmail.com", "26", "2000", "ddd");
        adaugareRand("fdsa", "fdgg", "rrrr@gmail.com", "30", "1000", "ddd");

    }

    public void adaugareRand(String firstName, String lastName, String valEmail, String valAge, String valSalary, String chooseDep)
    {
        WebElement addButton = getDriver().findElement(By.xpath("//*[@id='addNewRecordButton']"));
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
        int nrRand = listaTabelUpdated.size();



        //javascriptExecutor.executeScript("window.scrollTo(0,500)");


        WebElement firstNameOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"] //*[@class='rt-td'][1]"));
        WebElement secondNameOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][2]"));
        WebElement emailOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][4]"));
        WebElement ageOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][3]"));
        WebElement salaryOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][5]"));
        WebElement departmentOutput = getDriver().findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][6]"));


        Assert.assertTrue(firstNameOutput.getText().contains(firstName));
        Assert.assertTrue(secondNameOutput.getText().contains(lastName));
        Assert.assertTrue(emailOutput.getText().contains(valEmail));
        Assert.assertTrue(ageOutput.getText().contains(valAge));
        Assert.assertTrue(salaryOutput.getText().contains(valSalary));
        Assert.assertTrue(departmentOutput.getText().contains(chooseDep));

    }


    }




