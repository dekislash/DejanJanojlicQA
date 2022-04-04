import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginAndRegTestE extends BaseTestE{

    //LOGIN VALID TEST
    @Test
    public void loginWithValidCredentials() {
        EdgeDriver driver = openEdgeDriver();
        try {
            print("1. Go to: https://www.knjizare-vulkan.rs/");
            LoginAndRegPageE loginPage = new LoginAndRegPageE(driver);

            print("2. Click on Prijavi se button to open login modal");
            loginPage.openLoginModal();

            print("3. Enter valid email");
            loginPage.enterTextIntoEmailFieldlog(Strings.EMAIL_VALID);

            print("4. Enter valid password");
            loginPage.enterTextIntoPassField(Strings.PASSWORD_VALID);

            print("5. Click PRIJAVA login button");
            loginPage.clickLoginModalButton();

            loginPage.waitForElement(loginPage.headUser);
            print("6. Verify that Prijavi se has changed into username");
            assert loginPage.isElementPresent(loginPage.headUser) : "Error: Wrong link. Expected: " +
                    loginPage.headUser + ". Actual: " + loginPage.prijavaButton;

            print("7. Verify that Registrujte se has changed into Odjava ");
            assert loginPage.isElementPresent(loginPage.odjavaButton) : "Error: Wrong header link. Expected: " +
                    loginPage.odjavaButton + ". Actual: " + loginPage.registerHeadButt;

        }
        finally {
            print("Test finished");
        }

    }

    //LOGIN INVALID TEST
    @Test
    public void loginWithInvalidCredentials() {
        EdgeDriver driver = openEdgeDriver();
        try {
            print("Go to: https://www.knjizare-vulkan.rs/");
            LoginAndRegPageE loginPage = new LoginAndRegPageE(driver);
            print("Click on Prijavi se button to open login modal");
            loginPage.openLoginModal();
            print("Enter invalid email");
            loginPage.enterTextIntoEmailFieldlog(Strings.EMAIL_INVALLID);
            print("Enter invalid password");
            loginPage.enterTextIntoPassField(Strings.PASSWORD_INVALID);
            print("Click PRIJAVA login button");
            loginPage.clickLoginModalButton();
            print("Verify that alert message is showed");
            loginPage.verifyAlertMessage();
            print("Click close button");
            loginPage.closeLoginModal();
            print("Verify that Prijavi se has NOT changed into user-name");
            assert !loginPage.isElementPresent(loginPage.headUser) : "Error: Wrong header link. Expected: " +
                    loginPage.prijavaButton + ". Actual: " + loginPage.headUser;

            print("Verify that Registrujte se link hasn`t changed into 'Odjava' link");
            assert !loginPage.isElementPresent(loginPage.odjavaButton) : "Error: Wrong header link. Expected: " +
                    loginPage.registerHeadButt + ". Actual: " + loginPage.odjavaButton;

        }
        finally {
            print("Test finished");
        }
    }

    //REGISTER TEST
    @Test
    public void registerWithValidCredentials() {
        print("Go to: 'https://www.knjizare-vulkan.rs/'");
        EdgeDriver driver = openEdgeDriver();

        try {
            LoginAndRegPageE registerPage = new LoginAndRegPageE(driver);
            registerPage.clickHeaderRegisterButton();
            registerPage.waitForElement(registerPage.registrationForm);
            registerPage.fillRegisterForm();
            registerPage.waitForElement(registerPage.registrationAlert);
            String actualMessage = driver.findElement(By.xpath(Strings.REGISTRATION_ALERT_MESSAGE)).getText();
            print("assertAlertMessage (" + actualMessage + ", " + Strings.REGISTER_ALERT_MESSAGGE_TEXT + ")");
            assert actualMessage.equals(Strings.REGISTER_ALERT_MESSAGGE_TEXT) : "Wrong message. Expected: " + Strings.REGISTER_ALERT_MESSAGGE_TEXT + ". Actual: " + actualMessage;
            registerPage.finishRegTest();
            print("Verify that Home page is displayed.");
            String actualUrl = driver.getCurrentUrl();
            assertUrl(actualUrl, Strings.HOME_PAGE_URL);

        }
        finally {
            print("Test finished");
        }
    }

}
