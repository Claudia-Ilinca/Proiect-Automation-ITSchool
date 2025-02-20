package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {

    public WebDriver driver;

    @Test
    public void metodaTest() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //variabile
        String firstNameForm = "First";
        String lastName = "Last";
        String emailForm = "kierra@examplefff.com";
        String age = "66";
        String salary = "2009";
        String department = "HR";

        WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsButton.click();

        //user clicks on webTables button
        WebElement webTablesButton = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesButton.click();

        List<WebElement> listaTabel = driver.findElements(By.xpath("//*[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int numarElementeLista = listaTabel.size();

        //user clicks on add button
        WebElement addButton = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
        addButton.click();

        //user enters valid first name
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys(firstNameForm);

        //user enters valid last name
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);

        //user enters valid email
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(emailForm);

        //user enters age
        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys(age);

        //user enters salary
        WebElement salaryField = driver.findElement(By.id("salary"));
        salaryField.sendKeys(salary);

        //user enters department
        WebElement depField = driver.findElement(By.id("department"));
        depField.sendKeys(department);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        List<WebElement> listaTabelUpdated = driver.findElements(By.xpath("//*[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int randNou = numarElementeLista + 1;
        Assert.assertEquals(listaTabelUpdated.size(), randNou);

        /*WebElement outputfName = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][1]"));
        WebElement outputlName = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][2]"));
        WebElement outputuEmail = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][4]"));
        WebElement outputuAge = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][3]"));
        WebElement outputuSalary = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][5]"));
        WebElement outputuDepartment = driver.findElement(By.xpath("//*[@class='rt-tr-group'][3]//*[@class='rt-td'][6]"));

        Assert.assertTrue(outputfName.getText().contains(firstNameForm));
        Assert.assertTrue(outputlName.getText().contains(lastName));
        Assert.assertTrue(outputuEmail.getText().contains(emailForm));
        Assert.assertTrue(outputuAge.getText().contains(age));
        Assert.assertTrue(outputuSalary.getText().contains(salary));
        Assert.assertTrue(outputuDepartment.getText().contains(department));*/


    }

}
