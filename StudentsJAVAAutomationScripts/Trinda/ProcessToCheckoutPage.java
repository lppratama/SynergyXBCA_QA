import org.openqa.selenium.WebDriver;

public class ProcessToCheckoutPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();
    public ProcessToCheckoutPage(WebDriver driver){
        super(driver);
    }

    // Fungsi Checkout PRoduct Berhasil
    public static void checkoutProductSuccess(){
        click(locators.SUMMARY_PROCCESS_TO_CHECKOUT_BUTTON);
        click(locators.ADDRESS_PROCCESS_TO_CHECKOUT_BUTTON);
        click(locators.CHECKlIST_TERMS_OF_SERVICE);
        click(locators.SHIPPING_PROCCESS_TO_CHECKOUT_BUTTON);
        click(locators.OPSI_PAY_BY_BANK_WIRE_METHOD);
        click(locators.CONFIRM_MY_ORDER_BUTTON);
        isVisible(locators.ORDER_CONFIRMATION);
    }
}
