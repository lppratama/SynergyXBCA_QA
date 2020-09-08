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

    @Test(testName = "Sign In Wrong Email")
    public static void testSignInWrongEmail(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.signInWrongEmail();

        String element_text = authenticationPage.getText(locators.EMAIL_WRONG);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @Test(testName = "Sign In Wrong Password")
    public static void testSignInWrongPassword(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // memasukkan password salah
        authenticationPage.signInWrongPassword();

        // assertion
        String element_text = authenticationPage.getText(locators.PASSWORD_WRONG);
        Assert.assertEquals(element_text, "Invalid password.");
    }

    @Test(testName = "Registered Email")
    public static void testSignUpRegiteredEmail(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // memasukkan email ter registerd
        authenticationPage.RegisterFailedEmail();

        // assertion
        String element_text = authenticationPage.getText(locators.EMAIL_SALAH);
        Assert.assertEquals(element_text, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test(testName = "Register Success")
    public static void testSignUpSuccess(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.registerSuccess();

        // assert success
        String element_text = inputFormPage.getText(locators.SUCCESS_PAGE);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }

    @Test(testName = "Register Failed")
    public static void testSignUpSuccess(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        authenticationPage.RegisterFailed();

        // assert success
        String element_text = inputFormPage.getText(locators.EMAIL_GAGAL);
        Assert.assertEquals(element_text, "Invalid email address.");
    }

    @Test(testName = "Search Found")
    public static void testSearchFound(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // mencari barang
        SearchPage searchPage = new SearchPage(driver);

        SearchPage.searchFound();

        String element_text = searchPage.getText(locators.HASIL_SEARCH_ADA);
        Assert.assertEquals(element_text, "1 result has been found.");
    }

    @Test(testName = "Search Not Found")
    public static void testSearchNotFound(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // mencari barang
        SearchPage searchPage = new SearchPage(driver);

        SearchPage.searchNotFound();

        String element_text = searchPage.getText(locators.HASIL_SEARCH_TIDAK_ADA);
        Assert.assertEquals(element_text, "0 results have been found.");
    }

    @Test(testName = "CheckOut")
    public static void testCheckOut(){
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        //object kelas checkoutpage
        CheckOutPage checkOutPage = new CheckOutPage(driver);

        // checkout flow
        checkOutPage.checkOutSuccess();

        // assert
        String element_text = checkOutPage.getText(locators.COMPLETE);
        Assert.assertEquals(element_text, "Your order on My Store is complete.");


    }


    @AfterSuite
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}