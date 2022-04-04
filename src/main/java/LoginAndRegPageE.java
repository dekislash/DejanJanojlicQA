import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginAndRegPageE extends BasePageE{

    //LOG WE
    @FindBy(id = "login_modal")
    WebElement loginModal;
    @FindBy(id = "login_email")
    WebElement loginEmailField;
    @FindBy(id = "login_password")
    WebElement loginPassField;
    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    WebElement prijavaButton;
    @FindBy(xpath = "//button[@class='close']")
    WebElement closePrijavaModal;
    @FindBy(xpath = "//span[text()='dejan jan']")
    WebElement headUser;
    @FindBy(linkText = "Odjava")
    WebElement odjavaButton;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    WebElement errorLoginField;

    //REG WE
    @FindBy(xpath = "(//div[@class='modal-content'])[2]")
    WebElement registrationForm;
    @FindBy(id = "reg_firstname")
    WebElement registrationName;
    @FindBy(id = "reg_lastname")
    WebElement registrationLastName;
    @FindBy(id = "reg_email")
    WebElement registrationEmail;
    @FindBy(id = "reg_phone")
    WebElement registrationPhone;
    @FindBy(id = "reg_country_geo")
    WebElement registrationCountry;
    @FindBy(id = "reg_city")
    WebElement registrationCity;
    @FindBy(id = "reg_address")
    WebElement registrationAddress;
    @FindBy(id = "reg_street_no")
    WebElement registrationStreetNumber;
    @FindBy(id = "reg_postcode")
    WebElement registrationPostCode;
    @FindBy(id = "reg_password")
    WebElement registrationPassword;
    @FindBy(id = "reg_password_repeat")
    WebElement registrationRepeatPassword;
    @FindBy(xpath = "(//div[contains(@class,'icheckbox_flat icheck-item')])[2]")
    WebElement registrationOlderThan15Box;
    @FindBy(xpath = "//div[contains(@class,'iradio_flat icheck-item')]")
    WebElement registrationMaleSex;
    @FindBy(xpath = "(//div[contains(@class,'icheckbox_flat icheck-item')])[3]")
    WebElement registrationIAgreeBox;
    @FindBy(xpath = "(//div[@class='g-recaptcha']//div)[2]")
    WebElement registrationCaptcha;
    @FindBy(xpath = "(//button[contains(@class,'btn btn-success')])[2]")
    WebElement registrationButt;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    WebElement registrationAlert;
    @FindBy(xpath = "(//button[@class='close'])[2]")
    WebElement closeRegistrationForm;

    //CONSTRUCTOR E
    public LoginAndRegPageE(EdgeDriver driver) {
        super(driver);
    }

    //LOGIN SECTOR
    //OPEN LOGIN SCRIPT FORM
    public void openLoginModal(){
        clickLoginButton();
        waitForElement(loginModal);
        new LoginAndRegPageE(driver);
    }

    //SEND EMAIL TO FIELD
    public void enterTextIntoEmailFieldlog(String email) {
        waitForElement(loginEmailField);
        loginEmailField.sendKeys(email);
    }

    //SEND PASS TO FIELD
    public void enterTextIntoPassField(String password) {
        loginPassField.sendKeys(password);
    }

    //CLICK LOGIN BUTT
    public void clickLoginModalButton() {
        prijavaButton.click();
    }

    //VERIFY ALERT
    public void verifyAlertMessage() {
        waitForElement(errorLoginField);
        String currentMessage = driver.findElement(By.xpath(Strings.LOGIN_ALERT_MESSAGE_XPATH)).getText();
        assert currentMessage.equals(Strings.LOGIN_ALERT_MESSAGE_TEXT) : "Error: Wrong message. Expected: "
                + Strings.LOGIN_ALERT_MESSAGE_TEXT + ". Actual: " + currentMessage;
    }

    public void closeLoginModal() {
        closePrijavaModal.click();
    }

    //REGISTER SECTION
    //SEND KEYS

    public void enterTextIntoNameField(String ime){registrationName.sendKeys(ime);}
    public void enterTextIntoSurnameField(String prezime) {
        registrationLastName.sendKeys(prezime);
    }
    public void enterTextIntoEmailField(String mail) {registrationEmail.sendKeys(mail); }
    public void enterNumberIntoPhoneNumberField(String telefon) {
        registrationPhone.sendKeys(telefon);
    }
    public void enterTextIntoCountryField(String drzava) {registrationCountry.sendKeys(drzava);}
    public void enterTextIntoCityField(String grad) {
        registrationCity.sendKeys(grad);
    }
    public void enterTextIntoStreetField(String ulica) {
        registrationAddress.sendKeys(ulica);
    }
    public void enterNumberIntoStreetNumberField(String brojUlice) {
        registrationStreetNumber.sendKeys(brojUlice);
    }
    public void enterNumberIntoPostalCodeField(String postanskiBroj) {registrationPostCode.sendKeys(postanskiBroj); }
    public void enterTextIntoPasswordField(String lozinka) {
        registrationPassword.sendKeys(lozinka);
    }
    public void enterTextIntoRepeatPasswordField(String lozinka) {registrationRepeatPassword.sendKeys(lozinka); }
    public void clickMoreThan15Y() {registrationOlderThan15Box.click(); }
    public void clickOnMaleRadioButton() { registrationMaleSex.click();}
    public void clickIagreeBox() {registrationIAgreeBox.click();}
    public void clickRegisterButton() {registrationButt.click();}

    //WHAT TO SEND
    public void fillRegisterForm() {
        print("Enter first name.");
        enterTextIntoNameField(Strings.NEW_NAME);
        print("Enter last name.");
        enterTextIntoSurnameField(Strings.NEW_SURNAME);
        print("Enter Email");
        enterTextIntoEmailField(Strings.NEW_EMAIL);
        print("Enter phone number.");
        enterNumberIntoPhoneNumberField(Strings.NEW_NUMBER);
        print("Enter country.");
        enterTextIntoCountryField(Strings.NEW_COUNTRY);
        print("Enter city.");
        enterTextIntoCityField(Strings.NEW_CITY);
        print("Enter street.");
        enterTextIntoStreetField(Strings.NEW_ADRESS);
        print("Enter street number.");
        enterNumberIntoStreetNumberField(Strings.NEW_STREET_NUMBER);
        print("Enter zip code.");
        enterNumberIntoPostalCodeField(Strings.NEW_POSTCODE);
        print("Enter password.");
        enterTextIntoPasswordField(Strings.NEW_PASSWORD);
        print("Repeat password.");
        enterTextIntoRepeatPasswordField(Strings.NEW_PASSWORD);
        print("I have more than 15y");
        clickMoreThan15Y();
        print("Click on male sex.");
        clickOnMaleRadioButton();
        print("I agree with terms");
        clickIagreeBox();
        print("Click registruj se");
        clickRegisterButton();
    }

    //END REG
    public void finishRegTest() {
        closeRegistrationForm.click();
    }


}
