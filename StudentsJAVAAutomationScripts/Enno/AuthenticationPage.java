import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

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

    public static void signInWrongEmail(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.WRONG_USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.EMAIL_WRONG);
    }

    public static void signInWrongPassword(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.WRONG_PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.PASSWORD_WRONG);
    }

    public static void registerSuccess() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.USERNAME_REGISTER);
        click(locators.REGISTER_SUBMIT);
        click(locators.TITLE_MR);
        enterText(locators.CUSTOMER_FIRST_NAME, testData.First_name);
        enterText(locators.CUSTOMER_LAST_NAME, testData.TestData.Last_name);
        enterText(locators.PASSWORD, testData.Password);
        Select dropdownHari = new Select(driver.findElement(By.id(locators.HARI)));
        dropdownHari.selectByValue(testData.Hari);
        Select dropdownBulan = new Select(driver.findElement(By.id(locators.BULAN)));
        dropdownBulan.selectByValue(testData.Bulan);
        Select dropdownTahun = new Select(driver.findElement(By.id(locators.TAHUN)));
        dropdownTahun.selectByValue(testData.Tahun);
        click(locators.NEWS);
        click(locators.OFFER);
        enterText(locators.COMPANY, testData.Company);
        enterText(locators.ADDRESS_1, testData.Address);
        enterText(locators.ADDRESS_2, testData.Address_2);
        enterText(locators.CITY, testData.City);
        Select dropdownState = new Select(driver.findElement(By.id(locators.STATE)));
        dropdownState.selectByValue(testData.State);
        enterText(locators.POSTAL, testData.Postal_code);
        Select dropdownCountry = new Select(driver.findElement(By.id(locators.COUNTRY)));
        dropdownCountry.selectByValue(testData.Country);
        enterText(locators.ADDITIONAL, testData.Additional_information);
        enterText(locators.HOME_PHONE, testData.Home_phone);
        enterText(locators.MOBILE_PHONE, testData.Mobile_phone);
        enterText(locators.ALIAS, testData.Assign_an_address_alias_for_future_reference);
        click(locators.SUBMIT_REGISTER);
    }

    public static void RegisterFailedEmail() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.USERNAME);
        click(locators.REGISTER_SUBMIT);
        isVisible(locators.EMAIL_SALAH);
    }

    public static void RegisterFailed() {
        enterText(locators.REGISTER_INPUT_EMAIL, testData.WRONG_USERNAME);
        click(locators.REGISTER_SUBMIT);
        isVisible(locators.EMAIL_GAGAL);
    }
}