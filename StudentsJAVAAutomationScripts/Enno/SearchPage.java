import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public static void searchFound(){
        enterText(locators.SEARCH_INPUT, testData.SEARCH);
        click(locators.SEARCH_SUBMIT);
        isVisible(locators.HASIL_SEARCH_ADA);
    }

    public static void searchNotFound(){
        enterText(locators.SEARCH_INPUT, testData.SEARCH_NOT_FOUND);
        click(locators.SEARCH_SUBMIT);
        isVisible(locators.HASIL_SEARCH_TIDAK_ADA);
    }
}