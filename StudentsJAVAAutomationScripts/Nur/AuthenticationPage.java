import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AuthenticationPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public static void signInSuccess() {
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }

    public static void signInFailedEmail() {
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.WRONG_USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.WRONG_PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.WRONG_PASSWORD);
    }

    public static void signInFailedPassword() {
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.WRONG_USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.WRONG_PASSWORD);
    }

    public static void signUpSuccess() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.USERNAME_REGISTER);
        click(locators.REGISTER_SUBMIT);
        click(locators.TITLE_MR);
        enterText(locators.CUSTOMER_FIRST_NAME, testData.FIRST_NAME);
        enterText(locators.CUSTOMER_LAST_NAME, testData.LAST_NAME);
        enterText(locators.PASSWORD, testData.PASSWORD);
        Select dropdownHari = new Select(driver.findElement(By.id(locators.DAYS)));
        dropdownHari.selectByValue(testData.DAY);
        Select dropdownBulan = new Select(driver.findElement(By.id(locators.MONTH)));
        dropdownBulan.selectByValue(testData.MONTH);
        Select dropdownTahun = new Select(driver.findElement(By.id(locators.YEAR)));
        dropdownTahun.selectByValue(testData.YEAR);
        click(locators.NEWS);
        click(locators.OFFER);
        enterText(locators.COMPANY, testData.COMPANY);
        enterText(locators.ADDRESS_1, testData.ADDRESS_1);
        enterText(locators.ADDRESS_2, testData.ADDRESS_2);
        enterText(locators.CITY, testData.CITY);
        Select dropdownState = new Select(driver.findElement(By.id(locators.STATE)));
        dropdownState.selectByValue(testData.STATE);
        enterText(locators.POSTAL, testData.POSTAL_CODE);
        Select dropdownCountry = new Select(driver.findElement(By.id(locators.COUNTRY)));
        dropdownCountry.selectByValue(testData.COUNTRY);
        enterText(locators.ADDITIONAL, testData.ADDITIONAL_INFORMATION);
        enterText(locators.HOME_PHONE, testData.HOME_PHONE);
        enterText(locators.MOBILE_PHONE, testData.MOBILE_PHONE);
        enterText(locators.ADDRESS_ALIAS, testData.ADDRESS_ALIAS);
        click(locators.SUBMIT_ACCOUNT);
    }

    public static void signUpFailedMailRegistered() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.USERNAME);
        click(locators.REGISTER_SUBMIT);
        isVisible(locators.WRONG_EMAIL_REGISTER);
    }

    public static void signUpFailed() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.WRONG_USERNAME);
        click(locators.REGISTER_SUBMIT);
        isVisible(locators.WRONG_EMAIL_REGISTER);
    }
}