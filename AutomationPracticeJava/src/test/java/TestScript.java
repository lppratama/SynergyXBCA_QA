import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScript {
    static Locators locators = new Locators();
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH);
        driver.get(TestData.BASE_URL);
        driver.manage().window().maximize();
    }

    @Test(testName = "Sign In Success")
    public static void testSignInSuccessful(){
        /*
        Test Case untuk login sukses
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signInSuccess();

        String element_text = authenticationPage.getText(locators.MY_ACCOUNT_PAGE_HEADER);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }

    @AfterSuite
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

