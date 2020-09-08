import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public ProductPage(WebDriver driver){
        super(driver);
    }

    // Fungsi untuk mencari produk yang ada
    public static void searchFound(){
        enterText(locators.INPUT_SEARCH_KEY, testData.SEARCH_KEY);
        click(locators.INPUT_SEARCH_KEY_BUTTON);
        isVisible(locators.RESULT_FOUND);
    }

    // Fungsi untuk mencari produk yang tidak ada
    public static void searchNotFound(){
        enterText(locators.INPUT_SEARCH_KEY, testData.SEARCH_KEY_NOTFOUND);
        click(locators.INPUT_SEARCH_KEY_BUTTON);
        isVisible(locators.RESULT_FOUND);
    }

    // Fungsi untuk menambahkan produk ke cart
    public static void addToCart() {
        hoverToClickElement(locators.ITEM_CART, locators.ADD_ITEM_CART_BUTTON);
        click(locators.PROCEED_CHECKOUT_BUTTON);
    }

}
