package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// defineste o clasa publica, este punctul de plecare ptr codul de testare
public class TextBoxText {
    // declara o variabila driver de tip WebDriver care va fi folosita ptr a interactiona cu browserul
    WebDriver driver;
    // definirea metodei de test
    @Test
    //metoda principala care contine codul de test
    public void metodaTest() {
        //initializarea browserului si navigarea
        //creeaza o instanta a driverului ptr browserul Chrome
        driver = new ChromeDriver();
        //deschide site-ul in browser
        driver.get("https://demoqa.com/");
        //miximizeaza fereastra browserului
        driver.manage().window().maximize();

        //definirea datelor ptr test-variabile
        String nameValue = "Claudia Ilinca";
        String emailValue = "claudia_bacanaru@yahoo.com";
        String adressValue = "Strada Liliacului, nr 11, bl 2, ap 3, sc A, localitatea Deva, judet Hunedoara";
        String permanentAdressValue = "Strada Mihai Eminescu, nr 130, bl 5, ap 2, sc C, localitatea Deva, judet Hunedoara";

        //navigarea in aplicatie
        //face click pe sectiunea elemennts, gaseste un element pe pagina folosind un selector XPath
        WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsButton.click();

        //face click pe optiunea ,,text box,, din meniul Elements
        WebElement textBoxButton = driver.findElement(By.xpath("//span[text()='Text Box']"));
        textBoxButton.click();

        //completarea formularului- introduce text in campurile corespunzatoare-sendkeys(value)
        WebElement firstName = driver.findElement(By.id("userName"));
        firstName.sendKeys(nameValue);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(emailValue);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(adressValue);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(permanentAdressValue);

        //foloseste java script ptr a derula pagina(in cazul in care butonul ,,Submit,, nu este vizibil, deruleaza pagina pe verticala cu 500 pixeli
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,500)");
        //face click pe butonul ,,Submit,,
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //validarea rezultatelor- foloseste findElement ptr a captura valorile afisate dupa completarea formularului
        WebElement outputName = driver.findElement(By.id("name"));
        WebElement outputEmail = driver.findElement(By.id("email"));
        WebElement outputCurrentAddress = driver.findElement(By.xpath("//*[@class='mb-1'][3]"));
        WebElement outputPermanentAddress = driver.findElement(By.xpath("//*[@class='mb-1'][4]"));

        //getText()- preia textul din elementele respective
        String outputNameString = outputName.getText();

        String outputCaString = outputCurrentAddress.getText();
        //verifica daca textul predat contine valorile introduse anterior
        Assert.assertTrue(outputNameString.contains(nameValue));
        Assert.assertTrue(outputEmail.getText().contains(emailValue));
        Assert.assertTrue(outputCurrentAddress.getText().contains(adressValue));
        Assert.assertTrue(outputPermanentAddress.getText().contains(permanentAdressValue));


    }


}
