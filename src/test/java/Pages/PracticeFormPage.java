package Pages;

import HelperMethods.ElementsMethod;
import ObjectData.PracticeFormObjectData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends CommonPage
{


    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement emailField;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement maleElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement otherElement;

    @FindBy(id = "userNumber")
    WebElement numberField;

    @FindBy(id = "dateOfBirthInput")
    WebElement calendar;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement selectMonth;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement selectYear;

    @FindBy(id = "subjectsInput")
    WebElement subjectField;

    @FindBy(xpath = "//*[@for='hobbies-checkbox-1']")
    WebElement sportsCheckbox;

    @FindBy(xpath = "//*[@for='hobbies-checkbox-2']")
    WebElement readingCheckbox;

    @FindBy(id = "uploadPicture")
    WebElement uploadButton;

    @FindBy(id = "currentAddress")
    WebElement addressField;

    @FindBy(id = "react-select-3-input")
    WebElement stateField;

    @FindBy(id = "react-select-4-input")
    WebElement cityField;

    public PracticeFormPage(WebDriver driver)
    {
        super(driver);
    }


    public void fillFirstRegion(PracticeFormObjectData data)
    {
        elementsMethod.fillElement(firstNameField, data.getFirstName());
        elementsMethod.fillElement(lastNameField, data.getLastName());
        elementsMethod.fillElement(emailField, data.getEmail());
        elementsMethod.fillElement(numberField,data.getMobile());
    }


}
