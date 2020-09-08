import com.github.javafaker.Faker;
import java.util.Random;


public class TestData {
    // ---Driver Path ---
    final static String CHROME_PATH = "chromedriver";

    // --- URL & Credentials ---
    final static String BASE_URL = "http://automationpractice.com/index.php?";
    final static String EMAIL = "email-sesi40@yopmail.com";
    final static String WRONG_EMAIL = "emailsesi40";
    final static String PASSWORD = "12345";
    final static String WRONG_PASSWORD = "1234";

    // --- Credential Register Form ---
    Faker faker = new Faker();
    Random random = new Random();
//    String EMAIL_REGIS = mock.emails().val();
    String EMAIL_CREATE = "evosluminairee@yopmail.com";
    String EMAIL_REGISTERED = "abc@yopmail.com";
    String FIRSTNAME = faker.name().firstName();
    String LASTNAME = faker.name().lastName();
    String PASSWORD_CREATE = "12354";
    String ADDRESS = faker.address().streetAddress();
    String CITY = faker.address().city();
    String POSTCODE = faker.address().zipCode();
    String WRONG_POSTCODE = "123455";
    String PHONE_MOBILE = "081242167002";

    // --- Credential Search Page ---
    final static String SEARCH_PRODUCT_FOUND = "dress";
    final static String SEARCH_PRODUCT_NOT_FOUND = "qwertyuiop";
    
    //Alert Text
//    final static String CREATE_ACCOUNT_ERROR_TEXT = "An account using this email address has already been registered. Please enter a valid password or request a new one.";

    // --- Credential

}

