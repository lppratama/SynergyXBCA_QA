import org.openqa.selenium.By;

public class Locators {
    // ---Home Page Locators ---
    final static By SIGN_IN_BUTTON = By.cssSelector("a.login");
    final static By SEARCH_PRODUCT_INPUT = By.id("search_query_top");
    final static By SEARCH_PRODUCT_BUTTON = By.name("submit_search");
    // ---Sign In Page Locators ---
    final static By SIGN_IN_INPUT_EMAIL = By.id("email");
    final static By SIGN_IN_INPUT_PASSWORD = By.id("passwd");
    final static By SIGN_IN_SUBMIT = By.id("SubmitLogin");
    final static By INPUT_EMAIL_CREATE = By.id("email_create");
    final static By SUBMIT_CREATE = By.id("SubmitCreate");

    final static By SIGN_IN_FAILED = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
    final static By CREATE_ACCOUNT_ERROR_ALERT = By.cssSelector("#create_account_error > ol > li");

    // --Sign Up Form
    final static By CREATE_ACCOUNT_HEADING_PAGE = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1");
    final static By REG_INPUT_FIRST_NAME = By.id("customer_firstname");
    final static By REG_INPUT_LAST_NAME = By.id("customer_lastname");
    final static By REG_INPUT_PASSWORD = By.id("passwd");
    final static By REG_INPUT_ADDRESS = By.id("address1");
    final static By REG_INPUT_CITY = By.id("city");
    final static By REG_INPUT_STATE = By.cssSelector("#id_state > option:nth-child(5)");
    final static By REG_INPUT_POSTCODE = By.id("postcode");
    final static By REG_INPUT_COUNTRY = By.cssSelector("#id_country > option:nth-child(2)");
    final static By REG_INPUT_PHONE = By.id("phone_mobile");
    final static By WARNING_ALERT_REGISTER = By.cssSelector(".alert > ol:nth-child(2) > li:nth-child(1)");
    final static By REG_SUBMIT_BUTTON = By.id("submitAccount");

    // --- Search PRoduct Result Page Locators ---
    final static By SEARCH_PRODUCT_RESULT = By.cssSelector(".heading-counter");

    // ---Product Page Locators ---
    final static By TSHIRTS_PRODUCT = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");
    final static By SELECT_PRODUCT = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a");
    final static By ADD_TO_CHART_BUTTON = By.cssSelector(".ajax_add_to_cart_button > span:nth-child(1)");
    final static By SUCCESSFULLY_ADDED_PRODUCT = By.cssSelector(".layer_cart_product > h2:nth-child(2)");
    final static By PROCCESS_TO_CHECKOUT_BUTTON = By.cssSelector(".button-medium:nth-child(2) > span");

    // ---Shopping Cart Summary Page Locator ---
    final static By SUMMARY_PROCCESS_TO_CHECKOUT_BUTTON = By.cssSelector(".standard-checkout > span");

    // ---Shopping Cart Address Page Locator---
    final static By ADDRESS_PROCCESS_TO_CHECKOUT_BUTTON = By.cssSelector(".button:nth-child(4) > span");

    // ---Shopping Cart Shipping Page Locators ---
    final static By CHECKlIST_TERMS_OF_SERVICE = By.id("uniform-cgv");
    final static By SHIPPING_PROCCESS_TO_CHECKOUT_BUTTON = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button");

    // ---Shopping Cart Payment Method Page Locators ---
    final static By OPSI_PAY_BY_BANK_WIRE_METHOD = By.linkText("Pay by bank wire (order processing will be longer)");
    final static By CONFIRM_MY_ORDER_BUTTON = By.cssSelector("#cart_navigation span");

    // ---Order Confirmation Locators ---
    final static By ORDER_CONFIRMATION = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong");

    // ---My Account Page Locators ---
    By MY_ACCOUNT_PAGE_HEADER = By.cssSelector(".page-heading");
}
