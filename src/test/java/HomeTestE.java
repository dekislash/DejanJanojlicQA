import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HomeTestE extends BaseTestE{

    //NAV BAR TESTS
    @Test
    public void selectCategoryPageFromNavbar() {
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE homePage = new BasePageE(driver);

            print("click on 'KATEGORIJE' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_CATEGORY_TITLE, Strings.NAV_CATEGORY_URL);

            print("Verify the correct page title");
            String currentPageTitle = driver.findElement(By.xpath(Strings.NAV_1)).getText();
            assert currentPageTitle.equals(Strings.NAV_CATEGORY_TITLE) : "Error: Wrong page title. Expected: " +
                    Strings.NAV_CATEGORY_TITLE + ". Actual: " + currentPageTitle;

            print("click on 'AKCIJE' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_SALES_TITLE, Strings.NAV_SALES_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_2)).getText();
            assert currentPageTitle.equals(Strings.NAV_SALES_TITLE) : "Error: Wrong page title. Expected: " +
                    Strings.NAV_SALES_TITLE + ". Actual: " + currentPageTitle;


            print("click on 'NOVA IZDANJA' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_NEWBOOKS_TITLE, Strings.NAV_NEWBOOKS_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_3)).getText();
            assert currentPageTitle.equals(Strings.NAV_NEWBOOKS_TITLE) : "Error: Wrong page title. Expected: " +
                    Strings.NAV_NEWBOOKS_TITLE + ". Actual: " + currentPageTitle;

            print("click on 'USKORO' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_COOMINGSOON_TITLE, Strings.NAV_COOMINGSOON_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_4)).getText();
            assert currentPageTitle.equals(Strings.NAV_COOMINGSOON_TITLE) : "Error: Wrong title. Expected: " +
                    Strings.NAV_COOMINGSOON_TITLE + ". Actual: " + currentPageTitle;

            print("click on 'GIFT KARTICE' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_GIFTCARDS_TITLE, Strings.NAV_GIFTCARDS_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_5)).getText();
            assert currentPageTitle.equals(Strings.NAV_GIFTCARDS_TITLE) : "Error: Wrong title. Expected: " +
                    Strings.NAV_GIFTCARDS_TITLE + ". Actual: " + currentPageTitle;

            print("click on 'KNJIZARE' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_BOOKSTORES_TITLE, Strings.NAV_BOOKSTORES_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_7)).getText();
            assert currentPageTitle.equals(Strings.NAV_BOOKSTORES_TITLE) : "Error: Wrong title. Expected: " +
                    Strings.NAV_BOOKSTORES_TITLE + ". Actual: " + currentPageTitle;

            print("click on 'NOVOSTI' category and verify that the correct URL is displayed");
            homePage.openNavBarCategory(Strings.NAV_NEWS_TITLE, Strings.NAV_NEWS_URL);

            print("Verify the correct page title");
            currentPageTitle = driver.findElement(By.xpath(Strings.NAV_8)).getText();
            assert currentPageTitle.equals(Strings.NAV_NEWS_TITLE) : "Error: Wrong title. Expected: " +
                    Strings.NAV_NEWS_TITLE + ". Actual: " + currentPageTitle;

        }
        finally {
            print("Test finished");
        }
    }

    //QUESTIONS AND ANSWERS TEST
    @Test
    public void qaTests() {
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/' and go to QA");
            BasePageE qaPage = new BasePageE(driver);
            print("Open all fields in qa");
            qaPage.selectAllQa();

        }finally {
            print("Test finished");
        }
    }

    //CHAT TEST
    @Test
    public void chatTests() {
        EdgeDriver driver = openEdgeDriver();
        try {
            BasePageE chatPage = new BasePageE(driver);
            print("go to 'https://www.knjizare-vulkan.rs/ and try to start chat");
            chatPage.chatField();

        }finally {
            print("Test finished");
        }
    }

    //NEWSLETTER TEST
    @Test
    public void newsLetTest() {
        EdgeDriver driver = openEdgeDriver();
        try {
            BasePageE newsPage = new BasePageE(driver);
            print("go to 'https://www.knjizare-vulkan.rs/ and sub");
            newsPage.newsLetter();
        } finally {
            print("Test finished");
        }
    }

    //FOOT LINKS TESTS
    @Test
    public void linksTestsHomeFoot() {
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageE basePage = new BasePageE(driver);
            basePage.selectFooterLink(Strings.FOOT_ABOUT_US_TITLE, Strings.FOOT_ABOUT_US);
            basePage.selectFooterLink(Strings.FOOT_CONTACT_US_TITLE, Strings.FOOT_CONTACT_US);
            basePage.selectFooterLink(Strings.FOOT_VULCAN_CLUB_CARD_TITLE, Strings.FOOT_VULCAN_CLUB_CARD);
            basePage.selectFooterLink(Strings.FOOT_TERMS_OF_USE_TITLE, Strings.FOOT_TERMS_OF_USE);
            basePage.selectFooterLink(Strings.FOOT_PRIVACY_POLICY_TITLE, Strings.FOOT_PRIVACY_POLICY);
            basePage.selectFooterLink(Strings.FOOT_PAYMENT_METHODS_TITLE, Strings.FOOT_PAYMENT_METHODS);
            basePage.selectFooterLink(Strings.FOOT_DELIVERY_TITLE, Strings.FOOT_DELIVERY);
            basePage.selectFooterLink(Strings.FOOT_COMPLAINTS_TITLE, Strings.FOOT_COMPLAINTS);
            basePage.selectFooterLink(Strings.FOOT_HOW_TO_BUY_TITLE, Strings.FOOT_HOW_TO_BUY);
            basePage.selectFooterLink(Strings.FOOT_CANCEL_POLICY_TITLE, Strings.FOOT_CANCEL_POLICY);
            basePage.selectFooterLink(Strings.FOOT_COPYRIGHT_TITLE, Strings.FOOT_COPYRIGHT);

            print("Go to Home page by clicking header logo ");
            BasePageE homePage = new BasePageE(driver);
            homePage.clickHeaderLogo();

            print("Verify that Home page is displayed");
            String actualUrl = driver.getCurrentUrl();
            assertUrl(actualUrl, Strings.HOME_PAGE_URL);
        } finally {
            print("Test finished");
        }
    }

    //SOCIAL NET TESTS
    @Test
    public void connectToSocialNetworks() {
        EdgeDriver driver = openEdgeDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/.");
            BasePageE socialPage = new BasePageE(driver);
            //switch to FB, VERIFY URL AND GO HOME
            socialPage.openAndCloseFacebookPage();

            //switch to TW, VERIFY URL AND GO HOME
            socialPage.openAndCloseTwitterPage();

            //switch to INSTA, VERIFY URL AND GO HOME
            socialPage.openAndCloseInstagramPage();

            //switch to TT, VERIFY URL AND GO HOME
            socialPage.openAndCloseTikTokPage();

        }
        finally {
            print("Test finished");
        }
    }

}
