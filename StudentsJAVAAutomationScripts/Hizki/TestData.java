import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class TestData {
    // Fungsi untuk membuat email random
    public String randomestring()
    {
        String generatedstring = RandomStringUtils.randomAlphabetic(8);
        return(generatedstring);
    }
    // Membuat variable untuk email random
    String email_random = randomestring()+"@mail.co";

    // Membuat variable untuk fake input registrasi
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();

    // Driver Path
    final static String CHROME_PATH = "chromedriver";

    // URL & Credentials
    final static String BASE_URL = "http://automationpractice.com/index.php?";
    final static String USERNAME = "extract1234@yopmail.com";
    final static String WRONG_USERNAME = "extract123@yopmail.com";
    final static String PASSWORD = "12345";
    final static String WRONG_PASSWORD = "1234";

    // Input Registration
    String INPUT_REG_EMAIL = email_random;
    String INPUT_REG_FNAME = firstName;
    String INPUT_REG_LNAME = lastName;
    final static String INPUT_REG_PASSWORD = "12345";
    final static String INPUT_REG_ADDRESS = "Sesame Street";
    final static String INPUT_REG_CITY = "Oklahoma";
    final static String INPUT_REG_POSTCODE = "55555";
    final static String INPUT_REG_PHONE = "08121212121";

    // Alert Text
    final static String CREATE_ACCOUNT_ERROR_TEXT = "An account using this email address has already been registered. Please enter a valid password or request a new one.";

    // Search Key
    final static String SEARCH_KEY = "blouse";
    final static String SEARCH_KEY_NOTFOUND = "jumpsuit";
}

