import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public static void searchFound(){
        enterText(locators.SEARCH_INPUT, testData.SEARCH);
        click(locators.SEARCH_SUBMIT);
        isVisible(locators.SEARCH_RESULT);
    }

    public static void searchNotFound(){
        enterText(locators.SEARCH_INPUT, testData.SEARCH_NOT_FOUND);
        click(locators.SEARCH_SUBMIT);
        isVisible(locators.SEARCH_RESULT_NOT_FOUND);
    }
}