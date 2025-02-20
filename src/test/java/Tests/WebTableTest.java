package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest {
    WebDriver driver;

    @Test
    public void metodaTest(){

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

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

        adaugareRand("Adina", "Ionescu", "adina@email.com", "23", "7898", "Financiar");
        adaugareRand("Ioana", "Popescu", "Ioabna@email.com", "34", "12333", "Logistica");

   }

   public void adaugareRand( String firstNameForm, String lastName, String emailForm, String age, String salary, String department)
   {

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
       int nrRand = listaTabelUpdated.size();

       WebElement firstNameOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][1]"));
       WebElement secondNameOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][2]"));
       WebElement emailOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][4]"));
       WebElement ageOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][3]"));
       WebElement salaryOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][5]"));
       WebElement departmentOutput = driver.findElement(By.xpath("//*[@class='rt-tr-group']["+nrRand+"]//*[@class='rt-td'][6]"));

        Assert.assertTrue(firstNameOutput.getText().contains(firstNameForm));
        Assert.assertTrue(secondNameOutput.getText().contains(lastName));
        Assert.assertTrue(emailOutput.getText().contains(emailForm));
        Assert.assertTrue(ageOutput.getText().contains(age));
        Assert.assertTrue(salaryOutput.getText().contains(salary));
        Assert.assertTrue(departmentOutput.getText().contains(department));
   }


}
