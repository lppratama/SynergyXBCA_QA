import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage{
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    // Fungsi untuk LogIn sukses
    public static void signInSuccess(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }

    // Fungsi untuk LogIn gagal dengan email salah
    public static void signInFailedWrongEMail(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.WRONG_USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.SIGN_IN_FAILED);
    }

    // Fungsi untuk LogIn gagal dengan password salah
    public static void signInFailedWrongPassword(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.WRONG_PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.SIGN_IN_FAILED);
    }

    // Fungsi untuk SignUp gagal karena email sudah teregistrasi
    public static void signUpEmailRegistered(){
        enterText(locators.SIGN_UP_INPUT_EMAIL, testData.USERNAME);
        click(locators.SIGN_UP_BUTTON);
        isVisible(locators.REGISTERED_EMAIL);
    }

    // Fungsi untuk SignUp gagal karena persyaratan belum lengkap atau masih error
    public static void signUpFailed(){
        enterText(locators.SIGN_UP_INPUT_EMAIL, testData.INPUT_REG_EMAIL);
        click(locators.SIGN_UP_BUTTON);
        enterText(locators.REG_INPUT_FIRST_NAME, testData.INPUT_REG_FNAME);
        click(locators.REG_SUBMIT_BUTTON);
        isVisible(locators.ALERT_REGISTERED_FAILED);
    }

    // Fungsi untuk SignUp sukses
    public static void signUpSuccess(){
        enterText(locators.SIGN_UP_INPUT_EMAIL, testData.INPUT_REG_EMAIL);
        click(locators.SIGN_UP_BUTTON);
        enterText(locators.REG_INPUT_FIRST_NAME, testData.INPUT_REG_FNAME);
        enterText(locators.REG_INPUT_LAST_NAME, testData.INPUT_REG_LNAME);
        enterText(locators.REG_INPUT_PASSWD, testData.INPUT_REG_PASSWORD);
        enterText(locators.REG_INPUT_ADDRESS, testData.INPUT_REG_ADDRESS);
        enterText(locators.REG_INPUT_CITY, testData.INPUT_REG_CITY);
        click(locators.REG_INPUT_STATE);
        enterText(locators.REG_INPUT_POSTCODE, testData.INPUT_REG_POSTCODE);
        enterText(locators.REG_INPUT_PHONE, testData.INPUT_REG_PHONE);
        click(locators.REG_SUBMIT_BUTTON);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }

}
