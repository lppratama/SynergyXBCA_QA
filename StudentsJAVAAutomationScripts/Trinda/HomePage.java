import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    // ---Home Page---
    static TestData testData = new TestData(); // jika sudah pakai final static ga perlu pakai code ini
    static Locators locators = new Locators();

    public HomePage(WebDriver driver){
        super(driver);
    }

    // Fungsi clik tombol sign in di homepage
    public static void signIn(){
        click(locators.SIGN_IN_BUTTON);
        isVisible(locators.SIGN_IN_INPUT_EMAIL);
    }
}
