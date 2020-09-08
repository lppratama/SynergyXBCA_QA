import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    /*
    Kelas ini akan jadi parent untuk kelas lain
    */
    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Fungsi mengklik locator yang diberikan
    public static void click(By locator){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Fungsi enter teks
    public static void enterText(By locator, String text){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    // Fungsi untuk memperoleh teks dari suatu locator
    public static String getText(By locator){
        String text = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).getText();
        return text;
    }

    // Fungsi untuk mengecek visibility suatu element
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

    // Fungsi hover suatu elemen lalu klik elemen lain di dalamnya
    public static void hoverToClickElement(By locator_1, By locator_2) {
        Actions action = new Actions(driver);
        WebElement element_1 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator_1));
        WebElement element_2 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator_2));
        action.moveToElement(element_1).click(element_2).perform();
    }
}
