import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePageE {

    EdgeDriver driver;


    //LOGIN ELEMENTS
    @FindBy(xpath = "//img[@class='img-responsive lozad']")
    WebElement headerLogo;
    @FindBy(xpath = "//span[text()='Prijavite se']")
    WebElement loginHeadButt;
    @FindBy(className = "register-btn")
    WebElement registerHeadButt;
    @FindBy(id = "login_modal")
    WebElement loginModal;
    @FindBy(id = "login_email")
    WebElement loginEmailField;
    @FindBy(id = "login_password")
    WebElement loginPassField;
    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    WebElement prijavaButton;

    //QA ELEMENTS
    @FindBy(xpath = "//div[text()='Pomoć i najčešća pitanja']")
    WebElement questionsAndAnswers;

    //NAV SEARCH ELEMENTS
    @FindBy(xpath = "//div[contains(@class,'block autocomplete-button')]")
    WebElement searchIcon;
    @FindBy(id = "search-text")
    WebElement searchTextField;
    @FindBy(className = "icon-caret-right")
    WebElement nextPageButton;

    //FILTER ELEMENTS
    @FindBy(xpath = "//span[text()='KATEGORIJE']")
    WebElement categoryNav;
    @FindBy(xpath = "//span[text()='KNJIGE']")
    WebElement svePrvo;
    @FindBy(xpath = "//span[text()='Novo']")
    WebElement sveDrugo;
    @FindBy(xpath = "//div[contains(@class,'icheckbox_flat icheck-item')]")
    WebElement stopAuto;
    @FindBy(xpath = "//div[text()='Resetujte filtere ']")
    WebElement resetFilter;
    @FindBy(xpath = "(//a[@title='STRUČNA LITERATURA'])[2]")
    WebElement strucnaFilter;
    @FindBy(xpath = "//div[@id='nb_f-pismo']/ul[1]/li[2]")
    WebElement latinicaFilter;
    @FindBy(xpath = "//label[@for='f_pricelist_2000']")
    WebElement cena1do2kFilter;


    //SORTING ELEMENTS
    @FindBy(id = "sort")
    WebElement sortingField;

    //SOCIAL NET ELEMENTS
    @FindBy(xpath = "//img[@alt='Facebook']")
    WebElement facebookLink;
    @FindBy(xpath = "//img[@alt='Twitter']")
    WebElement twitterLink;
    @FindBy(xpath = "//img[@alt='Instagram']")
    WebElement instagramLink;
    @FindBy(xpath = "//img[@alt='Tiktok']")
    WebElement tiktokLink;

    //USER PANEL ELEMENTS
    @FindBy(xpath = "//span[text()='dejan jan']")
    WebElement goToUserProf;
    @FindBy(linkText = "Korisnički podaci")
    WebElement korisnickiPodaci;
    @FindBy(linkText = "Izmena podataka")
    WebElement izmenaPodataka;
    @FindBy(linkText = "Izmena lozinke")
    WebElement izmenaLozinke;
    @FindBy(linkText = "Izmena email-a")
    WebElement izmenaEmaila;
    @FindBy(linkText = "Moj izbor")
    WebElement mojIzbor;
    @FindBy(linkText = "Status pošiljki")
    WebElement statusPosiljki;
    @FindBy(linkText = "Omiljeni proizvodi")
    WebElement favouriteProizvodi;
    @FindBy(linkText = "Preporuke")
    WebElement preporuke;
    @FindBy(linkText = "Gledali ste")
    WebElement pregledaniProizvodi;
    @FindBy(linkText = "Dostupnost proizvoda")
    WebElement dostupnostProizvoda;

    //NEWSLETTER ELEMENTS
    @FindBy(name = "newsletter_email")
    WebElement unetiEmailNews;
    @FindBy(xpath = "//button[@class='btn confirm-loader']")
    WebElement newsButt;
    @FindBy(xpath = "//div[contains(@class,'icheckbox_flat icheck-item')]")
    WebElement slazemSeNewsBox;

    //OB BOOK ELEMENTS
    @FindBy(xpath = "//a[@class='quick-view showProductDetailsQuickViewOnModal']")
    WebElement bookBrziPregledButt;
    @FindBy(xpath = "(//button[@class='close'])[2]")
    WebElement bookCloseBrzi;
    @FindBy(className = "product-link")
    WebElement bookSveeAAAA;
    @FindBy(linkText = "Robert Kiosaki")
    WebElement bookAuthor;
    @FindBy(xpath = "(//li[contains(@class,'item tab-items')])[2]")
    WebElement bookSpecIzSVEE;
    @FindBy(xpath = "(//li[contains(@class,'item tab-items')])[3]")
    WebElement bookKomIzSVEE;
    @FindBy(xpath = "//li[@class='item item-product-check-xml ']")
    WebElement bookDostIzSVEE;
    @FindBy(xpath = "(//table[@class='table product-attrbite-table']//td)[2]")
    WebElement bookIztabeleSpec;
    @FindBy(xpath = "//div[@id='accordion']/div[21]/div[1]")
    WebElement bookDaLiIma;

    //CHAT ELEMENTS
    @FindBy(className = "zopim")
    WebElement chatButt;

    //FAVOURITE ELEMENTS
    @FindBy(xpath = "//div[@data-content='Dodaj u listu omiljenih proizvoda']//i")
    WebElement addToFavMreze;
    @FindBy(xpath = "(//div[@data-content='Dodaj u listu omiljenih proizvoda']//i)[3]")
    WebElement addToFavRat;
    @FindBy(xpath = "//div[@class='header-carthor-total favorite-header-total']")
    WebElement favNumber;
    @FindBy(id = "miniFavContent")
    WebElement favSve;
    @FindBy(linkText = "Obrišite proizvode")
    WebElement removeFavBut;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement removePotvrdiBut;

    //CART ELEMENTS
    @FindBy(className = "header-carthor-total")
    WebElement shoppingCartIcon;
    @FindBy(xpath = "//button[@data-btn-text-addtocart='Dodajte u korpu']")
    WebElement shoppingAddRat;
    @FindBy(xpath = "//div[@class='img-overlay']")
    WebElement selectRat;
    @FindBy(xpath = "(//button[@data-btn-text-addtocart='Dodajte u korpu'])[2]")
    WebElement shoppingAddLin;
    @FindBy(xpath = "(//div[@class='img-overlay'])[2]")
    WebElement selectLin;
    @FindBy(xpath = "//td[@class='text-center cart-action']//div")
    WebElement deleteFromDropCart1;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement potvrdiDeleteCart;

    //METHODS AND REST


    //BASE PAGE CHROME
    public BasePageE(EdgeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //CART

    //ADD TO CART FROM FAV
    public void addFromFavToCart() {
        Actions actions = new Actions(driver);
        actions.moveToElement(selectRat).perform();
        shoppingAddRat.click();
        actions.moveToElement(selectLin).perform();
        shoppingAddLin.click();
        waitForElementToBeClickable(shoppingCartIcon);
        shoppingCartIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    //GET NUMBER ABOVE CART ICON
    public Integer cartNumber() {
        waitForElement(shoppingCartIcon);
        String number = shoppingCartIcon.getText();
        return Integer.valueOf(number);
    }
    //CART NUMBER ICON
    public void watchCartNUmb(Integer currentNumber, Integer x) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        currentNumber += x;
        String number = "" + currentNumber;
        wait.until(ExpectedConditions.textToBe(By.xpath("(//div[contains(@class,'block mini-cart')]//div)[2]"), number));
    }
    //REMOVE FROM CART
    public void removeFromCart() {
        deleteFromDropCart1.click();
        waitForElement(potvrdiDeleteCart);
        potvrdiDeleteCart.click();
    }

    //FAVOURITE

    //ADD TO FAV SPECIFIC BOOKS
    public void addtoFavMreze() {
        addToFavMreze.click();
    }

    public void addToFavRat() {
        addToFavRat.click();
        waitForElement(favSve);
        favSve.click();
    }
    //REMOVE FROM FAV
    public void removeFav() {
        removeFavBut.click();
        waitForElement(removePotvrdiBut);
        removePotvrdiBut.click();
    }
    //FAVORITE BOOKS NUMBER
    public Integer favouriteNumber() {
        waitForElement(favNumber);
        String number = favNumber.getText();
        return Integer.valueOf(number);
    }
    //FAVOURITE ICON NUMBER FAV
    public void watchFavNUmb(Integer currentNumber, Integer x) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        currentNumber += x;
        String number = "" + currentNumber;
        wait.until(ExpectedConditions.textToBe(By.xpath("(//div[@id='miniFavContent']//div)[2]"), number));
    }

    //BOOK PREVIEW AND DETAILS

    //METH FAST PREVIEW
    public void fastBrziPregled() {
        bookBrziPregledButt.click();
        waitForElementToBeClickable(bookCloseBrzi);
        bookCloseBrzi.click();
    }
    //AUTHOR PREVIEW
    public void authorPregled() {
        bookAuthor.click();
        String current = driver.getCurrentUrl();
        assertUrl(current, Strings.BOOK_AUTH_URL);
        driver.navigate().to(Strings.BOOK_AFTERSEARCH_URL);
    }
    //FULL PREVIEW
    public void fullPregled() {
        bookSveeAAAA.click();
        String current = driver.getCurrentUrl();
        assertUrl(current, Strings.BOOK_URL_BOSO);
        bookSpecIzSVEE.click();
        waitForElement(bookIztabeleSpec);

        if (bookIztabeleSpec.getText().equals(Strings.BOOK_KATEGORIJA_TEXT)) {
            print("SAMO PSIHOLOGIJA");
        } else {
            print("Ne svidja mi se ostatak ako nije psihologija");}

        waitForElementToBeClickable(bookKomIzSVEE);
        bookKomIzSVEE.click();
        waitForElementToBeClickable(bookDostIzSVEE);
        bookDostIzSVEE.click();
        waitForElement(bookDaLiIma);
        if (driver.findElementByXPath("//div[@id='accordion']/div[21]/div[1]").getText().equals(Strings.BOOK_NIS)) {
            print("Knjiga je dostupna u Nisu");}
        else {
            print("Knjiga nije dostupna u Nisu");
        }

    }

    //NEWSLATER

    //NEWSLATER BUTT AND FUNCT
    public void newsLetter() {
        unetiEmailNews.click();
        unetiEmailNews.sendKeys("somerandombldfablabla@idemo.rs");
        waitForElement(slazemSeNewsBox);
        slazemSeNewsBox.click();
        newsButt.click();
    }

    //CHAT

    //CHAT CLICK AND FUNCT
    public void chatField() {
        waitForElement(chatButt);
        chatButt.click();
        print("send IME");
        Keys.chord(Keys.TAB,Keys.chord("ZDRAVKO PONOS"));
        print("Send Email");
        Keys.chord(Keys.TAB ,Keys.chord("canispeaktoyourmanager@karen.com"));
        print("send message");
        Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB , Keys.chord("CAN I SPEAK TO YOUR MAAGER"));
    }

    //USER INTERFACE

    //USER PANEL LINKS
    public void testUIfields() {
        fastLogin();
        waitForElement(korisnickiPodaci);
        korisnickiPodaci.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/view/");
        waitForElement(izmenaPodataka);
        izmenaPodataka.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/edit/");
        waitForElement(izmenaLozinke);
        izmenaLozinke.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/edit-password/");
        waitForElement(izmenaEmaila);
        izmenaEmaila.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/edit-email/");
        waitForElement(mojIzbor);
        mojIzbor.click();
        beforeAsert("https://www.knjizare-vulkan.rs/moj-izbor/settings");
        waitForElement(statusPosiljki);
        statusPosiljki.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/orders/");
        waitForElement(favouriteProizvodi);
        favouriteProizvodi.click();
        beforeAsert("https://www.knjizare-vulkan.rs/omiljeno/product");
        waitForElement(preporuke);
        preporuke.click();
        beforeAsert("https://www.knjizare-vulkan.rs/moj-izbor");
        waitForElement(pregledaniProizvodi);
        pregledaniProizvodi.click();
        beforeAsert("https://www.knjizare-vulkan.rs/gledali-ste");
        waitForElement(dostupnostProizvoda);
        dostupnostProizvoda.click();
        beforeAsert("https://www.knjizare-vulkan.rs/profil/size-available");

    }

    //QUESTIONS AND ANSWERS

    //QA SELECTIONS
    public void clickQAField() {
        questionsAndAnswers.click();
    }
    //QA LINKS
    public void selectAllQa(){
        clickQAField();
        driver.findElement(By.xpath(Strings.QUESTION_1)).click();
        driver.findElement(By.xpath(Strings.QUESTION_2)).click();
        driver.findElement(By.xpath(Strings.QUESTION_3)).click();
        driver.findElement(By.xpath(Strings.QUESTION_4)).click();
        driver.findElement(By.xpath(Strings.QUESTION_5)).click();
        driver.findElement(By.xpath(Strings.QUESTION_6)).click();
        driver.findElement(By.xpath(Strings.QUESTION_7)).click();
        driver.findElement(By.xpath(Strings.QUESTION_8)).click();
        driver.findElement(By.xpath(Strings.QUESTION_9)).click();
        driver.findElement(By.xpath(Strings.QUESTION_10)).click();
        driver.findElement(By.xpath(Strings.QUESTION_11)).click();
    }

    //FILTER

    //WHAIT!!!!
    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //FILTERING

    //NAVIGATE TO SVEEE AAAAA SVEEE
    public void navigateToShowSve() {
        waitForElementToBeClickable(categoryNav);
        categoryNav.click();
        waitForElement(driver.findElementByXPath("//span[text()='KNJIGE']"));
        svePrvo.click();
        waitForElement(driver.findElementByXPath("//span[text()='Novo']"));
        sveDrugo.click(); }
    //RESET FILTER
    public void resetFilters() {
        stopAuto.click();
        waitForElement(driver.findElementByXPath("//div[text()='Resetujte filtere ']"));
        resetFilter.click(); }

    //SELECT SPECIFIC FILTER
    public void selectStrucnaFromFilterList() {
        waitForElement(driver.findElementByXPath("//div[@id='nb_f-pismo']/ul[1]/li[2]/div[1]"));
        strucnaFilter.click();  }

    //SELECT SPECIFIC FILTER
    public void selectLatinicaFromFilterList() {
        waitForElement(driver.findElementByXPath("//div[@id='nb_f-pismo']/ul[1]/li[2]"));
        latinicaFilter.click();
        driver.navigate().to("https://www.knjizare-vulkan.rs/strucna-literatura-domace-knjige/latinica/?prices=1001-2000"); }

    //SELECT SPECIFIC FILTER
    public void selectCenaFromFilterList() {
        waitForElement(driver.findElementByXPath("//label[@for='f_pricelist_2000']"));
        cena1do2kFilter.click();
        driver.navigate().refresh(); }

    //SORTING

    //SELECT DROPDOWN FILTER
    public void selectDropDownFilter(WebElement sortirajField, String dropDownText) {
        waitForElement(sortirajField);
        waitForElementToBeClickable(sortirajField);
        sortingField.click();
        Select dropdown = new Select(sortirajField);
        dropdown.selectByVisibleText(dropDownText);
        waitForItemListToReload();
    }

    //SEARCH

    //SEARCH BUTTON CLICK
    public void clickSearchIcon(){
        searchIcon.click();
    }
    //SEND TEXT TO FIELD
    public void enterTextIntoSearchField(String text) {
        searchTextField.sendKeys(text);
        searchTextField.sendKeys(Keys.ENTER);
    }
    //GET ALL ITEMS
    public List<WebElement> getAllItems() {
        return driver.findElementsByXPath(Strings.ALL_ITEM_LIST_XPATH);
    }
    //SEARCH BASED ON KEYWORD
    public void searchItemTypeByKeyword(String keyword) {
        clickSearchIcon();
        enterTextIntoSearchField(keyword);
        List<WebElement> searchResults = getAllItems();

        assert searchResults.size() != 0 : "No results found";
    }
    //SEARCH BASED ON NAME
    public void findItemByName(String itemName) {
        while (true){
            List<WebElement> itemsList = getAllItems();
            // Going through all items on current page
            for(WebElement item : itemsList) {
                if(item.getAttribute("title").trim().equals(itemName)) {
                    item.click();
                    String pageTitle = driver.findElement(By.xpath(Strings.ALL_PAGES_TITLE_XPATH)).getText().trim();
                    assert pageTitle.equals(itemName.trim()) : "Error: wrong product";
                    return;
                }
            }
            // CONTINUE TO SPAM NEXT UNTIL ITEM FOUND
            if(isElementPresent(nextPageButton)) {
                nextPageButton.click();
                waitForItemListToReload();
            }
            // IF THERE IS NOT ITEM BRAKE
            else{
                break;
            }
        }
        throw  new AssertionError("There is no product with such name");
    }

    //LOG REG SOCIAL AND REST METHODS

    //HOME BUTT
    public void clickHeaderLogo() {
        headerLogo.click();
    }

    //LOGIN BUTT
    public void clickLoginButton() {loginHeadButt.click(); }

    //REGISTER BUTT
    public void clickHeaderRegisterButton() {
        registerHeadButt.click();
    }

    //WHAIT ELEMENT
    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //IS THERE ELEMENT
    public boolean isElementPresent(WebElement element){
        try {
            boolean isPresent = element.isDisplayed();
            return true;
        }catch (Exception e) {
            print(e.getMessage());
            print("Element is not present");
            return false;
        }
    }

    //ASSERT URL
    public void assertUrl(String actualUrl, String expectedUrl) {
        print("assertUrl (" + actualUrl + ", " + expectedUrl + ")");
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        assert actualUrl.equals(expectedUrl) : "Wrong URL. Expected: " + expectedUrl + ". Actual: " + actualUrl; }


    //NAV LINKS
    public void openNavBarCategory(String categoryTitle, String categoryUrl) {
        List<WebElement> allCategories = driver.findElements(By.xpath(Strings.NAVBAR_CATEGORY_LIST_XPATH));
        for(WebElement category : allCategories) {
            if(category.getAttribute("title").equals(categoryTitle)){
                print("Click on: " + categoryTitle);
                category.click();
                print("Verify that " + categoryUrl + " URL is displayed.");
                String actualUrl = driver.getCurrentUrl();
                assertUrl(actualUrl, categoryUrl);
                print("Selected category: " + categoryTitle + ".");
                return;
            }
        }
        throw new AssertionError("Error: Navbar category " + categoryTitle + " not found");
    }

    //HOLD BEFORE RELOAD
    public void waitForItemListToReload(){
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Wait for item list to disappear from the page
        wait.until(ExpectedConditions.stalenessOf(driver.findElementByXPath(Strings.ALL_ITEM_LIST_XPATH)));

        // Wait for item list to appear again
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(Strings.ALL_ITEM_LIST_XPATH)));
    }

    //FOOT LINKS
    public void selectFooterLink(String footerLinkTitle, String footerLinkUrl) {
        List<WebElement> footerLinks = driver.findElements(By.xpath(Strings.FOOTER_LINKS_LIST_XPATH));
        for(WebElement linkTitle : footerLinks) {
            if(linkTitle.getAttribute("title").equals(footerLinkTitle)) {
                print("Click on: " + footerLinkTitle);
                linkTitle.click();
                print("Verify that " + footerLinkTitle + " URL is displayed.");
                String actualUrl = driver.getCurrentUrl();
                assertUrl(actualUrl, footerLinkUrl);
                return;
            }
        }
        throw new AssertionError("Error: Footer page " + footerLinkTitle + " not found");
    }

    //SCROL TO
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    //BEFORE ASERT
    public void beforeAsert(String urlUi) {
        String actualUrl = driver.getCurrentUrl();
        assertUrl(actualUrl, String.valueOf(urlUi));
    }
    //FAST LOGIN USEFULL
    public void fastLogin() {
        clickLoginButton();
        waitForElement(loginModal);
        waitForElement(loginEmailField);
        loginEmailField.sendKeys(Strings.EMAIL_VALID);
        loginPassField.sendKeys(Strings.PASSWORD_VALID);
        prijavaButton.click();
        waitForElement(goToUserProf);
        goToUserProf.click();

    }



    //SOCIAL NETWORKS
    //1) FB

    //CLICK FB
    public void clickOnFacebookLinkButton() {
        assert isElementPresent(facebookLink) : "Error. Facebook button is not displayed.";
        scrollToElement(facebookLink);
        facebookLink.click(); }

    //OPEN/CLOSE FB
    public void openAndCloseFacebookPage() {
        waitForElement(facebookLink);
        print("Click on FB Butt.");
        clickOnFacebookLinkButton();
        print("Switch to FB tab.");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        print("Verify that FB URL is displayed.");
        String actualUrl = driver.getCurrentUrl();
        assertUrl(actualUrl, Strings.FB_URL);
        print("Close Facebook tab.");
        driver.close();
        print("Switch to Home page tab.");
        driver.switchTo().window(tabs.get(0));
    }

    //2)TW
    //CLICK TW
    public void clickOnTwitterLinkButton() {
        assert isElementPresent(twitterLink) : "Error. Twitter button is not displayed.";
        scrollToElement(twitterLink);
        twitterLink.click();
    }

    //OPEN/CLOSE TW
    public void openAndCloseTwitterPage() {
        waitForElement(twitterLink);
        print("Click on TW Butt.");
        clickOnTwitterLinkButton();
        print("Switch to TW tab.");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        print("Verify that TW URL is displayed.");
        String actualUrl = driver.getCurrentUrl();
        assertUrl(actualUrl, Strings.TWITTER_URL);
        print("Close Twitter tab.");
        driver.close();
        print("Switch to Home page tab.");
        driver.switchTo().window(tabs.get(0));
    }

    //3)INSTA
    //CLICK INSTA
    public void clickOnInstagramLinkButton() {
        assert isElementPresent(instagramLink) : "Error. Instagram button is not displayed.";
        scrollToElement(instagramLink);
        instagramLink.click();
    }

    //OPEN/CLOSE INSTA
    public void openAndCloseInstagramPage() {
        waitForElement(instagramLink);
        print("Click on Insta button.");
        clickOnInstagramLinkButton();
        print("Switch to Instagram tab.");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        print("Verify that Instagram URL is displayed.");
        String actualUrl =driver.getCurrentUrl();
        assertUrl(actualUrl, Strings.INSTA_URL);
        print("Close Instagram tab.");
        driver.close();
        print("Switch to Home page tab.");
        driver.switchTo().window(tabs.get(0));
    }
    //4)TikTok
    //CLICK TT
    public void clickOnTikTokLinkButton() {
        assert isElementPresent(tiktokLink);
        scrollToElement(tiktokLink);
        tiktokLink.click();
    }
    //OPEN/CLOSE TT
    public void openAndCloseTikTokPage() {
        waitForElement(tiktokLink);
        print("Click on TT button.");
        clickOnTikTokLinkButton();
        print("Verify that TikTok URL is displayed.");
        String actualUrl = driver.getCurrentUrl();
        assertUrl(actualUrl, Strings.TIK_TOK_URL);
        print("Close TikTok tab.");
        driver.close();
    }

    //PRINT F
    public static void print(String s) {
        System.out.println(s);
    }

}
