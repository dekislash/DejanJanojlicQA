import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BaseTestC {

    private ChromeDriver driver;

    //CHROME DRIVERS @ OPTIONS
    public ChromeDriver getDriver() {
        return driver;
    }

    public ChromeDriver openChromeDriver() {
        print("Opening Chrome Driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
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

    //PRINT METHOD
    public static void print(String s) {
        System.out.println(s);
        Reporter.log(s);
    }

    //ASSERTURL
    public void assertUrl(String actualUrl, String expectedUrl) {
        print("assertUrl (" + actualUrl + ", " + expectedUrl + ")");
        assert actualUrl.equals(expectedUrl) : "Wrong URL. Expected: " + expectedUrl + ". Actual: " + actualUrl;}

    //FAST LOGIN
    public static void login(ChromeDriver driver, String email, String pass) {
        LoginAndRegPageC loginPage = new LoginAndRegPageC(driver);
        loginPage.clickLoginModalButton();
        loginPage.enterTextIntoEmailField(email);
        loginPage.enterTextIntoPasswordField(pass);
        loginPage.clickLoginModalButton();}

}










