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
    Kelas ini akan menjadi parent untuk kelas lainnya
    kelas ini akan memuat elemen dan funsi yang dapat digunakan dikelas lain
     */
    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Fungsi mengeklik locator yang diberikan
    // void adalah metode tsb tidak akan mereturn sesuatu
    public static void click(By locator){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    // Fungsi enter teks
    public static void enterText(By locator, String text){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }
    // Fungsi untuk memperoleh teks dari suatu locator
    // karena butuh return suatu string
    public static String getText(By locator){
        String text = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        return text;
    }
    // Fungsi untuk mengecek visibility suatu element
    // return yang di inginkan berupa boolean
    public static boolean isVisible(By locator){
        try {
            WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator));
            boolean visibilityElement = element.isDisplayed();
            return visibilityElement;
        }
        catch (TimeoutException timeoutException){
            return false;
        }
    }
    // Fungsi untuk hover dan klik
    public static void hoverToClickElement(By locator1, By locator2){
        WebElement element = new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(locator1));
        new Actions(driver).moveToElement(element).perform();
        WebElement add = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator2));
        add.click();
    }
    // Fungsi untuk dropdown dan select



}
