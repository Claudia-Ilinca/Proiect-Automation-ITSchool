package ShareData;

import ShareData.Browser.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class ShareDataBrowser {
    private WebDriver driver;

    /*@BeforeMethod*/
    public void initializeBrowser(){
        driver = new BrowserFactory().getBrowserFactory();
        driver.get("http://demoqa.com/");
    }

    /*@AfterMethod*/
    public void clearBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    //este la fel
    /*
    @BeforeMethod
    public void InitializeBrowser()
    {
        this.driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void clearBrowser()
    {
        driver.quit();
        *//*driver.close();*//* //inchide tab-ul

    }

    public WebDriver getDriver() {
        return driver;
    }*/
}
