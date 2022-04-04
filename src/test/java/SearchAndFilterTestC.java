import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchAndFilterTestC extends BaseTestC{


    //SEARCH TEST
    @Test
    public void searchByItemTypeAndName() {
        ChromeDriver driver = openChromeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageC searchPage = new BasePageC(driver);
            print("Click on search icon");
            print("bat into search field");
            searchPage.searchItemTypeByKeyword("bat");
            print("Find and click Flaša za vodu WHO CARES IM A BATMAN");
            print("Verify that correct item page is displayed");
            searchPage.findItemByName(Strings.BECAUSE_IM_BATMAN);
        }
        finally {
            print("Test finished");
        }
    }

    //FAIL SEARCH TEST
    @Test
    public void kriminalnaDrzavaCicvuDerpe() {
        ChromeDriver driver = openChromeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageC searchPage = new BasePageC(driver);
            print("Click on search icon");
            searchPage.clickSearchIcon();
            print("Enter 'CicvuDerpe' into search field");
            searchPage.enterTextIntoSearchField("Kako ostati normalan u kriminalnoj drzavi");
            print("Verify that search URL is displayed");
            String actualUrl = driver.getCurrentUrl();
            assertUrl(actualUrl, Strings.SOME_RANDOM_SHIT);
            print("Verify that alert message is displayed");
            String currentMessage = driver.findElementByXPath(Strings.SEARCH_ALERT_MESSAGE_XPATH).getText();
            assert currentMessage.equals(Strings.SEARCH_ALERT_MESSAGE_TEXT) : "Error: Wrong message. Expected: " +
                    Strings.SEARCH_ALERT_MESSAGE_TEXT + ". Actual: " + currentMessage;

        }
        finally {
            print("Test finished");
        }
    }

    //FILTERING AND SORTING TEST
    @Test
    public void filteringAndSorting() {
        ChromeDriver driver = openChromeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageC homePage = new BasePageC(driver);
            print("Go to SVEEEE AAAAA with resetfilter");
            homePage.navigateToShowSve();
            homePage.resetFilters();
            print("Chose Strucna");
            homePage.selectStrucnaFromFilterList();
            print("Select Latinica");
            homePage.selectLatinicaFromFilterList();
            print("Select 1000-2000");
            homePage.selectCenaFromFilterList();
            String actualURL = driver.getCurrentUrl();
            assertUrl(actualURL, Strings.FILTER_1_2k_DINARA_ISTI_KAO_FULL);
            print("Select najeftinije from dropdown");
            homePage.selectDropDownFilter(homePage.sortingField, Strings.BAGATELA_DO_NAJSKUPLJE);

        }finally {
            print("Test finished");
        }
    }

    //OPEN PRODUCT AND TEST
    @Test
    public void openSpecProductAndTest() {
        ChromeDriver driver = openChromeDriver();
        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageC searchAndOpenPage = new BasePageC(driver);
            print("Login with valid");
            searchAndOpenPage.fastLogin();
            print("Open specific product");
            searchAndOpenPage.searchItemTypeByKeyword("Bogati otac");
            print("Brzi pregled");
            searchAndOpenPage.fastBrziPregled();
            print("Autor pregled");
            searchAndOpenPage.authorPregled();
            print("Full pregled");
            searchAndOpenPage.fullPregled();
        }finally {
            print("Test finished");
        }
    }

}
