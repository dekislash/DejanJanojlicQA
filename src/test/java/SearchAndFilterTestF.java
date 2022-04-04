import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchAndFilterTestF extends BaseTestF{


    //SEARCH TEST
    @Test
    public void searchByItemTypeAndName() {
        FirefoxDriver driver = openFirefoxDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageF searchPage = new BasePageF(driver);
            print("Click on search icon");
            print("bat into search field");
            searchPage.searchItemTypeByKeyword("bat");
            print("Find and click Flaša za vodu WHO CARES IM A BATMAN");
            print("Verify that correct item page is displayed");
        }
        finally {
            print("Test finished");
        }
    }

    //FAIL SEARCH TEST
    @Test
    public void kriminalnaDrzavaCicvuDerpe() {
        FirefoxDriver driver = openFirefoxDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageF searchPage = new BasePageF(driver);
            print("Click on search icon");
            searchPage.clickSearchIcon();
            print("Enter 'CicvuDerpe' into search field");
            searchPage.enterTextIntoSearchField("Kako ostati normalan u kriminalnoj drzavi");
            print("Verify that search URL is displayed");
            String actualUrl = driver.getCurrentUrl();
        }
        finally {
            print("Test finished");
        }
    }

    //FILTERING AND SORTING TEST
    @Test
    public void filteringAndSorting() {
        FirefoxDriver driver = openFirefoxDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageF homePage = new BasePageF(driver);
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
        FirefoxDriver driver = openFirefoxDriver();
        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageF searchAndOpenPage = new BasePageF(driver);
            print("Login with valid");
            searchAndOpenPage.fastLogin();
            print("Open specific product");
            driver.navigate().to("https://www.knjizare-vulkan.rs/proizvodi?search=bogati+otac");
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
