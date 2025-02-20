package Tests;

import ObjectData.PracticeFormObjectData;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.sql.DriverManager.getDriver;

public class PracticeFormTest
{
    WebDriver driver;
    CommonPage commonPage;
    HomePage homePage;
    PracticeFormPage practiceFormPage;
    private Map<String, PracticeFormObjectData> practiceFormObjectDataMap;

    @Test

    public void metodaTest()
    {
        practiceFormObjectDataMap = xmlReader.loadData("src/test/resources/practiceFormData.xml", PracticeFormObjectData.class);
        PracticeFormObjectData data = practiceFormObjectDataMap.get("dataSet_1");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        practiceFormPage = new PracticeFormPage(driver);

        homePage.clickOnForms();
        commonPage.clickOnSubMenu("Practice Form");
        practiceFormPage.fillFirstRegion(data);




        /*WebElement formsButton = driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][2]"));
        formsButton.click();*/

        WebElement practiceButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceButton.click();

        String gender = "Female";
        WebElement genderMale = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement genderFemale = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement genderOther = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        if (genderMale.getText().equals(gender))
        {
            genderMale.click();
        }
        else if (genderFemale.getText().equals(gender))
        {
            genderFemale.click();
        }
        else if (genderOther.getText().equals(gender))
        {
            genderOther.click();
        }


       /* switch (gender)
        {
            case "Male":
                genderMale.click();
                break;
            case  "Female":
                genderFemale.click();
                break;
            case  "Other":
                genderOther.click();
                break;


        }*/

        String firstNameLabel = "Claudia";
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys(firstNameLabel);

        String lastNameLabel = "Ilinca";
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastNameLabel);

        String emailLabel = "Claudia_Ilinca@vv.com";
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(emailLabel);

        String numberLabel = "0234567898";
        WebElement numberField = driver.findElement(By.id("userNumber"));
        numberField.sendKeys(numberLabel);

        WebElement calendar = driver.findElement(By.id("dateOfBirthInput"));
        calendar.click();

        String month = "April";
        String year = "2015";
        String day = "20";


        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selectMonthHelp = new Select(selectMonth);
        selectMonthHelp.selectByVisibleText(month);

        WebElement selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select selectYearHelp = new Select(selectYear);
        selectYearHelp.selectByVisibleText(year);

        WebElement selectDay = driver.findElement(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--0" + day + "' and not(contains(@class,'react-datepicker__day--outside-month'))]"));
        selectDay.click();
        


        /*String subjectLabel = "E";
        WebElement subjectField = driver.findElement(By.id("subjectsInput"));
        subjectField.sendKeys(subjectLabel);
        subjectField.sendKeys(Keys.ARROW_DOWN);
        subjectField.sendKeys(Keys.ARROW_DOWN);
        subjectField.sendKeys(Keys.ARROW_DOWN);
        subjectField.sendKeys(Keys.ARROW_DOWN);
        subjectField.sendKeys(Keys.ENTER);


        String addressLabel = "address";
        WebElement addressField = driver.findElement(By.id("currentAddress"));
        addressField.sendKeys(addressLabel);*/
        //hobbies
        WebElement sportsCheckbox = driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']"));
        WebElement readingCheckbox = driver.findElement(By.xpath("//*[@for='hobbies-checkbox-2']"));
        WebElement musicCheckbox = driver.findElement(By.xpath("//*[@for='hobbies-checkbox-3']"));
        //lista hobbies
        List<WebElement> listaElemente = new ArrayList<>();
        listaElemente.add(sportsCheckbox);
        listaElemente.add(readingCheckbox);
        listaElemente.add(musicCheckbox);

        /*//Varianta 1
        String[] numeHobby = new String [3];
        numeHobby [0] = "Sports";
        numeHobby [1] = "Reading";
        numeHobby [2] = "Music";*/

        //Varianta 2
        String[] hobbies = {"Sports", "Reading", "Music"};
        for (String hobby : hobbies){
            if(hobby.equals(sportsCheckbox.getText())){
                sportsCheckbox.click();
            }
            else if(hobby.equals(readingCheckbox.getText())){
                readingCheckbox.click();
            }
            else if(hobby.equals(musicCheckbox.getText())){
                musicCheckbox.click();
            }
        }


        /*musicCheckbox.click();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollTo(0,500)");
        //upload img
        WebElement uploadButton = driver.findElement(By.id("uploadPicture"));
        File poza = new File("src/test/resources/British-Shorthair-2.jpg");
        String absPath = poza.getAbsolutePath();
        uploadButton.sendKeys(absPath);

        String stateLabel = "NCR";
        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
        stateField.sendKeys(stateLabel);
        stateField.sendKeys(Keys.ENTER);

        String cityLabel = "Delhi";
        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
        cityField.sendKeys(cityLabel);
        cityField.sendKeys(Keys.ENTER);

        /*String stateLabel = "NCR";
        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
        javascriptExecutor.executeScript("arguments[0].click();",stateField); // ar fi trebuit sa functioneze
        stateField.sendKeys(stateLabel);


        String cityLabel = "Delhi";
        WebElement cityField = driver.findElement(By.id("react-select-4-input"));*/





    }
}
