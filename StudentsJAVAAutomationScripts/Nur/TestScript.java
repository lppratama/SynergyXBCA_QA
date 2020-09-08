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

    @Test(testName = "Sign In Failed Email")
    public static void testSignInFailedEmail(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signInFailedEmail();


        String element_text = authenticationPage.getText(locators.WRONG_EMAIL);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @Test(testName = "Sign In Failed Password")
    public static void testSignInFailedPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signInFailedPassword();


        String element_text = authenticationPage.getText(locators.WRONG_EMAIL);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @Test(testName = "Sign UP Success")
    public static void testsignUpSuccess(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signUpSuccess();


        String element_text = authenticationPage.getText(locators.SUCCESS_PAGE);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }

    @Test(testName = "Sign UP Failed Mail Registered")
    public static void testsignUpFailedMailRegistered(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signUpFailedMailRegistered();


        String element_text = authenticationPage.getText(locators.WRONG_EMAIL_REGISTER);
        Assert.assertEquals(element_text, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test(testName = "Sign UP Failed Mail ")
    public static void testsignUpFailed(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signUpFailed();


        String element_text = authenticationPage.getText(locators.WRONG_EMAIL_REGISTER);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @Test(testName = "Search Found")
    public static void testsignUpFailed(){
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signUpFailed();


        String element_text = authenticationPage.getText(locators.WRONG_EMAIL_REGISTER);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @AfterSuite
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}