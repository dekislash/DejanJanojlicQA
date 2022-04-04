import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTestF {

    private FirefoxDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/DekislashPc/IdeaProjects/QAVULKANDEJANJ/geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
    }

    //FIREFOX DRIVERS @ OPTIONS
    public FirefoxDriver getDriver() {
        return driver;
    }

    public FirefoxDriver openFirefoxDriver() {
        print("Opening Firefox Driver");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("dom.disable_beforeunload", true);
        options.setCapability("acceptInsecureCerts",true);
        options.setCapability("dom.webdriver.enabled", false);
        options.setCapability("browser.fullscreen.autohide",true);
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get(Strings.HOME_PAGE_URL);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Ova web-stranica koristi kolačiće']")));
        driver.findElement(By.xpath("//button[@data-dismiss='alert']//span[1]")).click();

        this.driver = driver;
        return driver;
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }


    //ASSERTURL
    public void assertUrl(String actualUrl, String expectedUrl) {
        print("assertUrl (" + actualUrl + ", " + expectedUrl + ")");
        assert actualUrl.equals(expectedUrl) : "Wrong URL. Expected: " + expectedUrl + ". Actual: " + actualUrl;}

    //FAST LOGIN
    public static void login(FirefoxDriver driver, String email, String pass) {
        LoginAndRegPageF loginPage = new LoginAndRegPageF(driver);
        loginPage.clickLoginModalButton();
        loginPage.enterTextIntoEmailField(email);
        loginPage.enterTextIntoPasswordField(pass);
        loginPage.clickLoginModalButton();}

    //PRINT SHORT
    public static void print(String s) {
        System.out.println(s);
    }
}