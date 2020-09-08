import org.openqa.selenium.By;

public class Locators {
    // --- Home Page Locators ---
    By SIGN_IN_BUTTON = By.cssSelector("a.login");

    // --- Sign In Page Locators ---
    By SIGN_IN_INPUT_EMAIL = By.id("email");
    By SIGN_IN_INPUT_PASSWORD = By.id("passwd");
    By SIGN_IN_SUBMIT = By.id("SubmitLogin");
    By INPUT_EMAIL_CREATE = By.id("email_create");
    By SUBMIT_CREATE = By.id("SubmitCreate");
    By CREATE_ACCOUNT_ERROR_ALERT = By.cssSelector("#create_account_error > ol > li");
    By EMAIL_WRONG = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
    By PASSWORD_WRONG = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");

    // --- My Account Page Locators ---
    By MY_ACCOUNT_PAGE_HEADER = By.cssSelector(".page-heading");

    // --- Register Page Locators ---
    By REGISTER_INPUT_EMAIL = By.id("email_create");
    By REGISTER_SUBMIT = By.id("SubmitCreate");
    By EMAIL_BENAR = By.cssSelector("#account-creation_form > div:nth-child(1) > h3");
    By EMAIL_SALAH = By.cssSelector("#create_account_error > ol > li");
    By EMAIL_GAGAL = By.cssSelector("#create_account_error > ol > li");

    // --- Your Personal Information ---
    By TITLE = By.id("id_gender1");
    By CUSTOMER_FIRST_NAME = By.id("customer_firstname");
    By CUSTOMER_LAST_NAME = By.id("customer_lastname");
    By PASSWORD = By.id("passwd");
    By HARI = "days";
    By BULAN = "months";
    By TAHUN = "years";
    By NEWS = By.id("uniform-newsletter");
    By OFFER = By.id("uniform-optin");

    // --- Your Address ---
    By COMPANY = By.id("company");
    By ADDRESS_1 = By.id("address1");
    By ADDRESS_2 = By.id("address2");
    By CITY = By.id("city");
    By STATE = By.id("id_state");
    By POSTAL = By.id("postcode");
    By COUNTRY = By.id("id_country");
    By ADDITIONAL = By.id("other");
    By HOME_PHONE = By.id("phone");
    By MOBILE_PHONE = By.id("phone_mobile");

    // --- Assign an address alias for future reference. ---
    By ALIAS = By.id("alias");
    By SUBMIT_REGISTER = By.id("submitAccount");
    By SUCCESS_PAGE = By.cssSelector("#center_column > h1");

    // --- Search ---
    By SEARCH_INPUT = By.id("search_query_top");
    By SEARCH_SUBMIT = By.cssSelector("#searchbox > button");
    By HASIL_SEARCH_ADA = By.cssSelector("#center_column > h1 > span.heading-counter");
    By HASIL_SEARCH_TIDAK_ADA = By.cssSelector("#center_column > h1 > span");

    // --- Cart ---
    By CHECK_OUT = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    By CART_SUMMARY = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    By ADDRESSES = By.cssSelector("#center_column > form > p > button > span");
    By CHECKBOX_AGREE = By.id("uniform-cgv");
    By SHIPPING = By.cssSelector("#form > p > button > span");
    By PAY_BANK = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    By I_CONFIRM = By.cssSelector("#cart_navigation > button > span");
    By COMPLETE = By.cssSelector("#center_column > div > p > strong");
}