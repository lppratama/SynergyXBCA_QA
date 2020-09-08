import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage{
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public CheckOutPage(WebDriver driver){
        super(driver);
    }

    // Fungsi untuk check out berhasil
    public static void checkOut(){
        click(locators.SUM_CHECKOUT_BUTTON);
        click(locators.ADDRESS_CHECKOUT_BUTTON);
        click(locators.SHIPPING_TERM_SERVICE);
        click(locators.SHIPPING_CHECKOUT_BUTTON);
        click(locators.PAYMENT_METHOD_BUTTON);
        click(locators.CONFIRM_ORDER);
        isVisible(locators.ORDER_SUCCESS);
    }

}
