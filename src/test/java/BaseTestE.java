import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTestE {

    private EdgeDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:/Users/DekislashPc/IdeaProjects/QAVULKANDEJANJ/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver.silentOutput" , "true");
    }

    //EDGE DRIVERS @ OPTIONS
    public EdgeDriver getDriver() {
        return driver;
    }

    public EdgeDriver openEdgeDriver() {
        print("Opening Edge Driver");
        EdgeOptions options = new EdgeOptions();
        options.setCapability("dom.disable_beforeunload", true);
        options.setCapability("browser.privatebrowsing.autostart", true);
        options.setCapability("acceptInsecureCerts",true);
        options.setCapability("dom.webdriver.enabled", false);
        options.setCapability("useAutomationExtension", false);
        options.setCapability("devtools.jsonview.enabled", false);
        options.setCapability("browser.fullscreen.autohide",true);
        EdgeDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
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
    public static void login(EdgeDriver driver, String email, String pass) {
        LoginAndRegPageE loginPage = new LoginAndRegPageE(driver);
        loginPage.clickLoginModalButton();
        loginPage.enterTextIntoEmailField(email);
        loginPage.enterTextIntoPasswordField(pass);
        loginPage.clickLoginModalButton();}


    //PRINT SHORT
    public static void print(String s) {
        System.out.println(s);
    }
}
