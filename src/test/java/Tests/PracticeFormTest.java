package Tests;

import ObjectData.PracticeFormObjectData;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import ShareDataBrowser.Hooks;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;


public class PracticeFormTest extends Hooks {


    CommonPage commonPage;
    HomePage homePage;
    PracticeFormPage practiceFormPage;
    private Map<String, PracticeFormObjectData> practiceFormObjectDataMap;


    @Test



    public void metodaTest(){
        practiceFormObjectDataMap = xmlReader.loadData("src/test/resources/PracticeFormData.xml",PracticeFormObjectData.class);
        PracticeFormObjectData data = practiceFormObjectDataMap.get("dataSet_1");
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());
        homePage.clickOnForms();
        commonPage.clickOnSubMenu("Practice Form");

        practiceFormPage.fillFirstRegion(data);
        //scroll
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,500)");


       /* //gender check
        String gender = "Female";
        WebElement genderMale = getDriver().findElement(By.xpath("//label[@for = 'gender-radio-1']"));
        WebElement genderFemale = getDriver().findElement(By.xpath("//label[@for = 'gender-radio-2']"));
        WebElement genderOther = getDriver().findElement(By.xpath("//label[@for = 'gender-radio-3']"));


        if (genderMale.getText().equals(gender))
        {
            genderMale.click();
        }
        else if(genderFemale.getText().equals("Female"))
        {
            genderFemale.click();
        }

        else if (genderOther.getText().equals(gender))
        {
            genderOther.click();
        }


        *//*switch (gender){

            case "Male":
                genderMale.click();

                break;

            case "Female":
                genderFemale.click();

                break;

            case "Other":
                genderOther.click();

            break;
        }*//*


        String firstNameLbl = "Roxana";
        String lastNameLbl = "Orz";
        String emailLbl = "tototo@gmail.com";
        String mobileNmbr = "00887733";
        String subjectLabel = "E";
        String currentAddr = "str c, bl g";
        String stateField = "NCR";
        String cityField = "d";


        //complete first name field
        WebElement firstNameField = getDriver().findElement(By.id("firstName"));
        firstNameField.sendKeys(firstNameLbl);

        //last name
        WebElement lastNameField = getDriver().findElement(By.id("lastName"));
        lastNameField.sendKeys(lastNameLbl);

        //email field
        WebElement emailField = getDriver().findElement(By.id("userEmail"));
        emailField.sendKeys(emailLbl);

        //mobile number
        WebElement mobileNr= getDriver().findElement(By.id("userNumber"));
        mobileNr.sendKeys(mobileNmbr);

        //calendar
        WebElement dateOfBirth = getDriver().findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();

        String month = "April";
        String year = "2015";
        String day = "20";


        WebElement selectMonthHelp = getDriver().findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selecta = new Select(selectMonthHelp);
        selecta.selectByVisibleText(month);

        WebElement selectYear = getDriver().findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select select = new Select(selectYear);
        select.selectByVisibleText(year);

        WebElement selectDay = getDriver().findElement(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--0" + day + "' and not(contains(@class,'react-datepicker__day--outside-month'))]"));
        selectDay.click();


        //click pe alt element pentru a putea continua testul

        WebElement nrMobil= getDriver().findElement(By.id("userNumber"));
        nrMobil.click();

        //current address
        WebElement currentAdd = getDriver().findElement(By.id("currentAddress"));
        currentAdd.sendKeys(currentAddr);

        //label subject
        WebElement subjectLbl = getDriver().findElement(By.id("subjectsInput"));
        subjectLbl.sendKeys(subjectLabel);
        subjectLbl.sendKeys(Keys.ARROW_DOWN);
        subjectLbl.sendKeys(Keys.ARROW_DOWN);
        subjectLbl.sendKeys(Keys.ARROW_DOWN);
        subjectLbl.sendKeys(Keys.ARROW_DOWN);
        subjectLbl.sendKeys(Keys.ENTER);

        //hobbies
        WebElement sportCheckbox = getDriver().findElement(By.xpath("//*[@for='hobbies-checkbox-1']"));
        WebElement readingCheckbox = getDriver().findElement(By.xpath("//*[@for='hobbies-checkbox-2']"));
        WebElement musicCheckbox = getDriver().findElement(By.xpath("//*[@for='hobbies-checkbox-3']"));

        javascriptExecutor.executeScript("window.scrollTo(0,500)");

        //lista hobbies

        List<WebElement> listaElemente = new ArrayList<>();
        listaElemente.add(sportCheckbox);
        listaElemente.add(readingCheckbox);
        listaElemente.add(musicCheckbox);

        String[] hobbies = {"Sports", "Reading", "Music"};
        for(String hobby : hobbies){

            if (hobby.equals(sportCheckbox.getText()))
            {
            sportCheckbox.click();
            }
            else if (hobby.equals(readingCheckbox.getText()))
            {
            readingCheckbox.click();
            } else if (hobby.equals(musicCheckbox.getText()))
            {
                musicCheckbox.click();
            }

        }*/


       /* //upload img
        WebElement chooseFile = driver.findElement(By.id("uploadPicture"));
        File poza = new File("src/test/resources/images.png");
        String path = poza.getAbsolutePath();
        chooseFile.sendKeys(path);

        javascriptExecutor.executeScript("window.scrollTo(0,500)");

       //state
        WebElement stateLbl = driver.findElement(By.id("react-select-3-input"));
        stateLbl.sendKeys(stateField);
       stateLbl.sendKeys(Keys.ENTER);

       //city
        WebElement cityLbl = driver.findElement(By.id("react-select-4-input"));
        cityLbl.sendKeys(cityField);
        cityLbl.sendKeys(Keys.ENTER);*/


      /* // un click
        WebElement stateLbl = driver.findElement(By.id("react-select-3-input"));
        javascriptExecutor.executeScript("arguments[0].click();",stateField);
        stateLbl.sendKeys(stateField);*/




    }

}








