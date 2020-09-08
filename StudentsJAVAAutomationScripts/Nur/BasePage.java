import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void click(By locator){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void enterText(By locator, String text){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public static String getText(By locator){
        String text = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).getText();
        return text;
    }

    public static boolean isVisible(By locator){
        try {
            WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator));
            boolean visibilityElement = element.isDisplayed();
            return visibilityElement;
        }
        catch(TimeoutException timeoutException){
            return false;
        }
    }
}