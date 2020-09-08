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

        // Step 2 - Masukkan email dan password benar
        authenticationPage.signInSuccess();

        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.MY_ACCOUNT_PAGE_HEADER);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }

    @Test(testName = "Sign In Failed with Wrong Email")
    public static void testSignInWrongEmail(){
        /*
        Test Case untuk login gagal karena input email salah
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Masukkan email salah
        authenticationPage.signInFailedWrongEMail();

        // STep 3 - Assertion
        String element_text = authenticationPage.getText(locators.SIGN_IN_FAILED);
        Assert.assertEquals(element_text, "Authentication failed.");
    }

    @Test(testName = "Sign In Failed with Wrong Password")
    public static void testSignInWrongPassword(){
        /*
        Test Case untuk login gagal karena input password salah
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Masukkan password salah
        authenticationPage.signInFailedWrongPassword();

        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.SIGN_IN_FAILED);
        Assert.assertEquals(element_text, "Invalid password.");
    }


    @Test(testName = "Sign Up Failed Email has been registered")
    public static void testsignUpEmailRegistered(){
        /*
        Test Case untuk Registrasi gagal karena email sudah terdaftar
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Registrasi dengan email yang sudah terdaftar
        authenticationPage.signUpEmailRegistered();

        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.REGISTERED_EMAIL);
        Assert.assertEquals(element_text, TestData.CREATE_ACCOUNT_ERROR_TEXT);
    }

    @Test(testName = "Sign Up Failed Email input invalid")
    public static void testsignUpFailed(){
        /*
        Test Case untuk Registrasi gagal karena inputan masih ada error
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Registrasi dengan inputan yang masih salah
        authenticationPage.signUpFailed();

        // Step 3 - Assertion : Error box is displayed
        authenticationPage.isVisible(locators.ALERT_REGISTERED_FAILED);
    }

    @Test(testName = "Sign Up Success")
    public static void testSignUpSuccessful(){
        /*
        Test Case untuk Registrasi sukses
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Registrasi dengan inputan lengkap dan benar
        authenticationPage.signUpSuccess();

        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.MY_ACCOUNT_PAGE_HEADER);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }

    @Test(testName = "Search product found")
    public static void testSearchProductFound(){
        /*
        Test Case untuk search product ada
         */

        // Membuat objek kelas SearchPage
        ProductPage productPage = new ProductPage(driver);

        // Step 1 - Masukkan kata kunci produk yang ada
        productPage.searchFound();

        // Step 2 - Assertion
        String element_text = productPage.getText(locators.RESULT_FOUND);
        Assert.assertNotEquals(element_text, "0 results have been found.");
    }

    @Test(testName = "Search product not found")
    public static void testSearchProductNotFound(){
        /*
        Test Case untuk search product tidak ada
         */

        // Membuat objek kelas SearchPage
        ProductPage productPage = new ProductPage(driver);

        // Step 1 - Masukkan kata kunci produk yang tidak ada
        productPage.searchNotFound();

        // Step 2 - Assertion
        String element_text = productPage.getText(locators.RESULT_FOUND);
        Assert.assertEquals(element_text, "0 results have been found.");
    }

    @Test(testName = "Checkout Success")
    public static void testCheckOutSuccess(){
        /*
        Test Case untuk checkout sukses
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Klik tombol Sign In
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - Login dengan email yang terdaftar
        authenticationPage.signInSuccess();

        // Membuat objek kelas ProductPage
        ProductPage productPage = new ProductPage(driver);

        // Step 3 - Mencari produk yang ada
        productPage.searchFound();


        // Step 4 - Masukkan produk ke cart
        productPage.addToCart();

        // Membuat objek kelas CheckOutPage
        CheckOutPage checkOutPage = new CheckOutPage(driver);

        // Step 5 - Checkout
        checkOutPage.checkOut();

        // Step 6 - Assertion
        String element_text = checkOutPage.getText(locators.ORDER_SUCCESS);
        Assert.assertEquals(element_text, "Your order on My Store is complete.");

    }

    @AfterSuite
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

