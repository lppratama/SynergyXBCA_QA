import org.openqa.selenium.By;

public class Locators {
    // --- Home Page Locators ---
    By SIGN_IN_BUTTON = By.cssSelector("a.login");

    // --- Sign In Page Locators ---
    By SIGN_IN_INPUT_EMAIL = By.id("email");
    By SIGN_IN_INPUT_PASSWORD = By.id("passwd");
    By SIGN_IN_SUBMIT = By.id("SubmitLogin");

    // -- Register Locators --
    By SIGN_UP_INPUT_EMAIL = By.id("email_create");
    By SIGN_UP_BUTTON = By.id("SubmitCreate");
    By REG_SUBMIT_BUTTON = By.id("submitAccount");
    By REG_INPUT_FIRST_NAME = By.id("customer_firstname");
    By REG_INPUT_LAST_NAME = By.id("customer_lastname");
    By REG_INPUT_PASSWD = By.id("passwd");
    By REG_INPUT_ADDRESS = By.id("address1");
    By REG_INPUT_CITY = By.id("city");
    By REG_INPUT_STATE = By.cssSelector("#id_state > option:nth-child(5)");
    By REG_INPUT_POSTCODE = By.id("postcode");
    By REG_INPUT_COUNTRY = By.cssSelector("#id_country > option:nth-child(2)");
    By REG_INPUT_PHONE = By.id("phone_mobile");

    // -- Search Page Locators --
    By INPUT_SEARCH_KEY = By.id("search_query_top");
    By INPUT_SEARCH_KEY_BUTTON = By.cssSelector("#searchbox > button");

    // -- AddToCart Locators --
    By ITEM_CART = By.cssSelector("#center_column > ul > li > div > div.right-block");
    By ADD_ITEM_CART_BUTTON = By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");

    // -- Checkout Locators --
    By PROCEED_CHECKOUT_BUTTON = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
    By SUM_CHECKOUT_BUTTON = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    By ADDRESS_CHECKOUT_BUTTON = By.cssSelector("#center_column > form > p > button");
    By SHIPPING_TERM_SERVICE = By.id("uniform-cgv");
    By SHIPPING_CHECKOUT_BUTTON = By.cssSelector("#form > p > button");
    By PAYMENT_METHOD_BUTTON = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    By CONFIRM_ORDER = By.cssSelector("#cart_navigation > button");


    // -- Assertion Locators --
    // Sign In success
    By MY_ACCOUNT_PAGE_HEADER = By.cssSelector(".page-heading");

    // Sign In failed alert
    By SIGN_IN_FAILED = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");

    // Sign Up failed alert because email has registered
    By REGISTERED_EMAIL = By.cssSelector("#create_account_error > ol > li");

    // Sign Up failed because some required input still error
    By ALERT_REGISTERED_FAILED = By.cssSelector("center_column > div");

    // Search result
    By RESULT_FOUND = By.cssSelector("#center_column > h1 > span.heading-counter") ;

    // Checkout success
    By ORDER_SUCCESS = By.cssSelector("#center_column > div > p");

}
