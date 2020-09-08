import org.openqa.selenium.WebDriver;


public class SearchProductPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();
    public SearchProductPage(WebDriver driver){
        super(driver);
    }

    //fungsi product Found
    public static void productFound(){
        enterText(locators.SEARCH_PRODUCT_INPUT, testData.SEARCH_PRODUCT_FOUND);
        click(locators.SEARCH_PRODUCT_BUTTON);
        isVisible(locators.SEARCH_PRODUCT_RESULT);
    }
    // Product Not Found
    public static void  productNotFound(){
        enterText(locators.SEARCH_PRODUCT_INPUT, testData.SEARCH_PRODUCT_NOT_FOUND);
        click(locators.SEARCH_PRODUCT_BUTTON);
        isVisible(locators.SEARCH_PRODUCT_RESULT);
    }

}
