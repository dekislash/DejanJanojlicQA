import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SearchAndFilterTestE extends BaseTestE{


    //SEARCH TEST
    @Test
    public void searchByItemTypeAndName() {
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE searchPage = new BasePageE(driver);
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
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE searchPage = new BasePageE(driver);
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
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE homePage = new BasePageE(driver);
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
        EdgeDriver driver = openEdgeDriver();
        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE searchAndOpenPage = new BasePageE(driver);
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
