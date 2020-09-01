import org.openqa.selenium.By;

public class Locators {
    // --- Home Page Locators ---
    By SIGN_IN_BUTTON = By.cssSelector("a.login");

    // --- Sign In Page Locators ---
    By SIGN_IN_INPUT_EMAIL = By.id("email");
    By SIGN_IN_INPUT_PASSWORD = By.id("passwd");
    By SIGN_IN_SUBMIT = By.id("SubmitLogin");
    By INPUT_EMAIL_CREATE = By.id("email_create");
    By SUBMIT_CREATE = By.id("SubmitCreate");
    By CREATE_ACCOUNT_ERROR_ALERT = By.cssSelector("#create_account_error > ol > li");

    // --- My Account Page Locators ---
    By MY_ACCOUNT_PAGE_HEADER = By.cssSelector(".page-heading");
}
