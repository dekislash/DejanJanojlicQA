import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProfileFavAndCartTestF extends BaseTestF{

    //PROFILE SECTOR TEST
    @Test
    public void profileLinkTests() {
        FirefoxDriver driver = openFirefoxDriver();

        try {
            print("Go to: 'https://www.knjizare-vulkan.rs/'");
            BasePageF uiPage = new BasePageF(driver);
            uiPage.testUIfields();
        } finally {
            print("Test finished");
        }
    }








    //FAVOURITE SECTOR TEST
//    @Test
//    public void favoriteAddRemoveTest() {
//        FirefoxDriver driver = openFirefoxDriver();
//        try {
//            BasePageF favPage = new BasePageF(driver);
//            favPage.fastLogin();
//            favPage.clickSearchIcon();
//            favPage.enterTextIntoSearchField("mreze");
//            favPage.addtoFavMreze();
//            favPage.clickSearchIcon();
//            favPage.enterTextIntoSearchField("strategije ratovanja");
//            favPage.addToFavRat();
//            Integer currentNumber = favPage.favouriteNumber();
//            print("Get shopping cart badge number");
//            favPage.watchFavNUmb(currentNumber, 0);
//            currentNumber = favPage.favouriteNumber();
//            print("Verify that number '2' is displayed on shopping cart badge");
//            assert currentNumber == 2 : "Error: Wrong number of favorite items. Expected: 2. Actual: " + currentNumber;
//            favPage.removeFav();
//        } finally {
//            print("Test finished");
//        }
//    }

    //SHOPING CART TESTS
//    @Test
//    public void cartAddRemoveFromFavTest() {
//        FirefoxDriver driver = openFirefoxDriver();
//        try {
//            BasePageF cartPage = new BasePageF(driver);
//            cartPage.fastLogin();
//            cartPage.clickSearchIcon();
//            cartPage.enterTextIntoSearchField("mreze");
//            cartPage.addtoFavMreze();
//            cartPage.clickSearchIcon();
//            cartPage.enterTextIntoSearchField("strategije ratovanja");
//            cartPage.addToFavRat();
//            cartPage.addFromFavToCart();
//            Integer currentNumber = cartPage.cartNumber();
//            print("Get shopping cart badge number");
//            cartPage.watchCartNUmb(currentNumber, 0);
//            currentNumber = cartPage.cartNumber();
//            print("Verify that number '2' is displayed on cart");
//            assert currentNumber == 2 : "Error: Wrong number of items in cart. Expected: 2. Actual: " + currentNumber;
//            cartPage.removeFromCart();
//            driver.navigate().to("https://www.knjizare-vulkan.rs/omiljeno/product");
//            cartPage.removeFav();
//            driver.navigate().to("https://www.knjizare-vulkan.rs/kupovina");
//        }finally {
//            print("Test finished");
//        }
//    }
}
