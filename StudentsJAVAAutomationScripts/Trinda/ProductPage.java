import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();
    public ProductPage(WebDriver driver){
        super(driver);
    }

    // Fungsi Add to Cart
    public static void addProductToCart(){
        click(locators.TSHIRTS_PRODUCT);
        hoverToClickElement(locators.SELECT_PRODUCT, locators.ADD_TO_CHART_BUTTON);
        isVisible(locators.SUCCESSFULLY_ADDED_PRODUCT);
        click(locators.PROCCESS_TO_CHECKOUT_BUTTON);
    }
}
