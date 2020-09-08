import org.openqa.selenium.By;

public class Locators {
    // --- HOME PAGE LOCATORS ---
    By SIGN_IN_BUTTON = By.cssSelector("a.login");

    // --- SIGN IN PAGE LOCATORS ---
    By SIGN_IN_INPUT_EMAIL = By.id("email");
    By SIGN_IN_INPUT_PASSWORD = By.id("passwd");
    By SIGN_IN_SUBMIT = By.id("SubmitLogin");
    // --- PASSWORD SALAH ---
    By WRONG_PASSWORD = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
    // --- EMAIL SALAH ---
    By WRONG_EMAIL = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
    By MY_ACCOUNT_PAGE_HEADER = By.cssSelector(".page-heading");

    // --- REGISTER ---
    By REGISTER_INPUT_EMAIL = By.id("email_create");
    By REGISTER_SUBMIT = By.id("SubmitCreate");
    By WRONG_EMAIL_REGISTER = By.cssSelector("#create_account_error > ol > li");
    By TRUE_EMAIL = By.cssSelector("#account-creation_form > div:nth-child(1) > h3");

    // --- SEARCH ---
    By SEARCH_INPUT = By.id("search_query_top");
    By SEARCH_SUBMIT = By.cssSelector("#searchbox > button");
    By SEARCH_RESULT = By.cssSelector("#center_column > h1 > span.heading-counter");
    By SEARCH_RESULT_NOT_FOUND = By.cssSelector("#center_column > h1 > span");

    // --- YOUR PERSONAL INFORMATION ---
    By TITLE_MR = By.id("id_gender1");
    By CUSTOMER_FIRST_NAME = By.id("customer_firstname");
    By CUSTOMER_LAST_NAME = By.id("customer_lastname");
    By PASSWORD = By.id("passwd");
    String DAYS = "days";
    String  MONTH = "months";
    String YEAR = "years";
    By NEWS = By.id("uniform-newsletter");
    By OFFER = By.id("uniform-optin");

    // --- YOUR ADDRESS ---
    By COMPANY = By.id("company");
    By ADDRESS_1 = By.id("address1");
    By ADDRESS_2 = By.id("address2");
    By CITY = By.id("city");
    String STATE = "id_state";
    By POSTAL = By.id("postcode");
    String COUNTRY = "id_country";
    By ADDITIONAL = By.id("other");
    By HOME_PHONE = By.id("phone");
    By MOBILE_PHONE = By.id("phone_mobile");
    By ADDRESS_ALIAS = By.id("alias");
    By SUBMIT_ACCOUNT = By.id("submitAccount");
    By SUCCESS_PAGE = By.cssSelector("#center_column > h1");

    // --- CHECKOUT PAGE ---
    By CHECK_OUT = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    By CART_SUMMARY = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    By ADDRESSES = By.cssSelector("#center_column > form > p > button > span");
    By CHECKBOX_AGREE = By.id("uniform-cgv");
    By SHIPPING = By.cssSelector("#form > p > button > span");
    By PAY_BANK = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    By I_CONFIRM = By.cssSelector("#cart_navigation > button > span");
    By COMPLETE = By.cssSelector("#center_column > div > p > strong");
}
