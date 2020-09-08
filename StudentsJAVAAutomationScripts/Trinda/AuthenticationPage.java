import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage{
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    // Fungsi untuk sign in di Authentication page
    public static void signInSuccess(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.EMAIL);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }
    //
    public static void signInFailedEmailWrong(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.WRONG_EMAIL);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.SIGN_IN_FAILED);
    }
    public static void signInFailedPasswordWrong() {
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.EMAIL);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.WRONG_PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.SIGN_IN_FAILED);
    }
    // Fungsi untuk sign up di Authentication page
    public static void signUpSuccess(){
        enterText(locators.INPUT_EMAIL_CREATE, testData.EMAIL_CREATE);
        click(locators.SUBMIT_CREATE);
        isVisible(locators.CREATE_ACCOUNT_HEADING_PAGE);
        enterText(locators.REG_INPUT_FIRST_NAME, testData.FIRSTNAME);
        enterText(locators.REG_INPUT_LAST_NAME, testData.LASTNAME);
        enterText(locators.REG_INPUT_PASSWORD, testData.PASSWORD_CREATE);
        enterText(locators.REG_INPUT_ADDRESS, testData.ADDRESS);
        enterText(locators.REG_INPUT_CITY, testData.CITY);
        click(locators.REG_INPUT_STATE);
        enterText(locators.REG_INPUT_POSTCODE, testData.POSTCODE);
        enterText(locators.REG_INPUT_PHONE, testData.PHONE_MOBILE);
        click(locators.REG_SUBMIT_BUTTON);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }
    //
    public static void signUpEmailRegistered(){
        enterText(locators.INPUT_EMAIL_CREATE, testData.EMAIL_REGISTERED);
        click(locators.SUBMIT_CREATE);
        isVisible(locators.CREATE_ACCOUNT_ERROR_ALERT);
    }
    //
    public static void signUpFailedInvalidPostcode(){
        enterText(locators.INPUT_EMAIL_CREATE, testData.EMAIL_CREATE);
        click(locators.SUBMIT_CREATE);
        isVisible(locators.CREATE_ACCOUNT_HEADING_PAGE);
        enterText(locators.REG_INPUT_FIRST_NAME, testData.FIRSTNAME);
        enterText(locators.REG_INPUT_LAST_NAME, testData.LASTNAME);
        enterText(locators.REG_INPUT_PASSWORD, testData.PASSWORD_CREATE);
        enterText(locators.REG_INPUT_ADDRESS, testData.ADDRESS);
        enterText(locators.REG_INPUT_CITY, testData.CITY);
        click(locators.REG_INPUT_STATE);
        enterText(locators.REG_INPUT_POSTCODE, testData.WRONG_POSTCODE);
        enterText(locators.REG_INPUT_PHONE, testData.PHONE_MOBILE);
        click(locators.REG_SUBMIT_BUTTON);
        isVisible(locators.WARNING_ALERT_REGISTER);
    }
}