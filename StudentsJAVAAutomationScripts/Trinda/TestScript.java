import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScript {
    static Locators locators = new Locators(); // tidak udah dipakai jika di locator.java sudah memakai final static
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH); // untuk menyocokkan supaya menggunakan driver
        driver.get(TestData.BASE_URL); // untuk launch url nya
        driver.manage().window().maximize(); // untuk memaximumkan jendela browsernya

    }
    @AfterSuite //letaknya boleh dibawah boleh diatas ( diatas aja dijadikan satu ya sama before suite biar ga kangen)
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
    @Test(testName = "Sign in Success")
    public static void testSignInSuccessful(){
        /*
        Test Case untuk login Sukses
         */

        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - isi email dan password lalu klik tombol sign in
        authenticationPage.signInSuccess();
        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.MY_ACCOUNT_PAGE_HEADER);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }
    @Test(testName = "Sign in Failed Wrong Email")
    public static void testSignInFailedWrongEmail(){
        /*
        Test case untuk login gagal karena email salah
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        //Step 2 - isi wrong email dan password lalu klik tombol sign in
        authenticationPage.signInFailedEmailWrong();

        //Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.SIGN_IN_FAILED);
        Assert.assertEquals(element_text, "Invalid email address.");
    }
    @Test(testName = "Sign in Failed Wrong Password")
    public static void testSignInFailedWrongPassword(){
        /*
        Test case untuk login gagal karena password salah
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        //Step 2 - isi  email dan wrong password lalu klik tombol sign in
        authenticationPage.signInFailedPasswordWrong();

        //Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.SIGN_IN_FAILED);
        Assert.assertEquals(element_text, "Invalid password.");

    }
    @Test(testName = "Signup Success")
    public static void testSignUpSuccess(){
        /*
        Test case untuk register sukses
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - isi email dll
        authenticationPage.signUpSuccess();
        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.MY_ACCOUNT_PAGE_HEADER);
        Assert.assertEquals(element_text, "MY ACCOUNT");
    }
    @Test(testName = "SignUp Failed Email Registered")
    public static void testSignUpEmailRegistered(){
        /*
        Test Case untuk register failed karena email sudah terdaftar
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        //Step 2 - isi email dan klik submit
        authenticationPage.signUpEmailRegistered();
        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.CREATE_ACCOUNT_ERROR_ALERT);
        Assert.assertEquals(element_text, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }
    @Test(testName = "SignUp Failed Invalid Postcode")
    public static void testSignUpFailedInvalidPostcode(){
        /*
        Test case untuk register Failed karena format postcode salah
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - isi email dan form register
        authenticationPage.signUpFailedInvalidPostcode();

        // Step 3 - Assertion
        String element_text = authenticationPage.getText(locators.WARNING_ALERT_REGISTER);
        Assert.assertEquals(element_text,"The Zip/Postal code you've entered is invalid. It must follow this format: 00000");

    }
    @Test(testName = "Search Product Found")
    public static void testProductFound(){
        /*
        Test case untuk mencari produk yang ada
         */
        // Membuat objek kelas HomePage dan search page
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        // Step 1 - fill product yang ingin dicari dan klik tombol
        searchProductPage.productFound();

        // Step 2 - Assertion
        String element_text = searchProductPage.getText(locators.SEARCH_PRODUCT_RESULT);
        Assert.assertNotEquals(element_text, "0 results have been found.");

    }
    @Test(testName = "Search Product Not Found")
    public static void testProductNotFound(){
        /*
        Test case untuk mecari produk yang tidak ada
         */
        // Membuat objek kelas search page
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        // Step 1 - fill product yang ingin dicari dan klik tombol
        searchProductPage.productNotFound();

        // Step 2 - Assertion
        String element_text = searchProductPage.getText(locators.SEARCH_PRODUCT_RESULT);
        Assert.assertEquals(element_text, "0 results have been found.");
    }
    @Test(testName = "Checkout Product Success")
    public static void TestCheckoutProductSuccess(){
        /*
        Test Case untuk checkout Produk sukses
         */
        // Membuat objek kelas HomePage
        HomePage homePage = new HomePage(driver);

        // Step 1 - Click tombol sign in
        homePage.signIn();

        // Membuat objek kelas AuthenticationPage
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        // Step 2 - isi email dan password lalu klik tombol sign in
        authenticationPage.signInSuccess();

        //Membuat objek kelas productpage
        ProductPage productPage = new ProductPage(driver);

        // Step 3 - Klik klik
        productPage.addProductToCart();

        // Membuat Objek kalas CheckoutPRoductPage
        ProcessToCheckoutPage processToCheckoutPage = new ProcessToCheckoutPage(driver);

        // Step 4 - Klik klik
        processToCheckoutPage.checkoutProductSuccess();

        // Step 5 - Assertion
        String element_text = processToCheckoutPage.getText(locators.ORDER_CONFIRMATION);
        Assert.assertEquals(element_text, "Your order on My Store is complete.");

    }


}
