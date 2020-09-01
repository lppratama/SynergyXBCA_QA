import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage{
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    public static void signInSuccess(){
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        isVisible(locators.MY_ACCOUNT_PAGE_HEADER);
    }
}
