import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CheckOutPage extends BasePage {
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public static void checkout() {
        enterText(locators.SIGN_IN_INPUT_EMAIL, testData.USERNAME);
        enterText(locators.SIGN_IN_INPUT_PASSWORD, testData.PASSWORD);
        click(locators.SIGN_IN_SUBMIT);
        enterText(locators.SEARCH_INPUT, testData.SEARCH);
        click(locators.SEARCH_SUBMIT);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"))).click().build().perform();
        click(locators.CHECK_OUT);
        click(locators.CART_SUMMARY);
        click(locators.ADDRESSES);
        click(locators.CHECKBOX_AGREE);
        click(locators.SHIPPING);
        click(locators.PAY_BANK);
        click(locators.I_CONFIRM);
    }
}