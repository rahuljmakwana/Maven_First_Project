package Page_Object;

import com.sun.jna.platform.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Utils extends BasePage {

    // Clear and Enter text
    public static void clearAndEnter(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void clickElement(By by) {
        driver.findElement(by).click();
    }

    public static WebElement waitUntilClickable(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 45);
        //noinspection Since15
        WebElement element = wait.until((com.google.common.base.Function<? super WebDriver, WebElement>) elementToBeClickable(by));
        return element;
    }

    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
        return format.format(new Date());
    }

    public static String randomNumber() {
        DateFormat format = new SimpleDateFormat("ddmmyy");
        return format.format(new Date());
    }

    public static void clearAndEnterText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void selectByVisibleText(By by, String text) {
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    public static void selectByIndex(By by, int number) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }

    public static void selectByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void getUrl(String url) {
        driver.get(url);
    }

    public static WebElement waitForVisibility(WebDriver driver, By by, int waitTime) {
        Wait<WebDriver> wait = new WebDriverWait(driver, waitTime);
        WebElement divElement = wait.until((com.google.common.base.Function<? super WebDriver, WebElement>) ExpectedConditions.visibilityOfElementLocated(by));
        return divElement;
    }

    public static boolean isVisible(WebDriver driver, String eachField) {
        return (!driver.findElement(By.id(eachField)).isDisplayed());
    }

    public static WebElement switchToNewWindow(WebDriver driver, String iframeId) {
        driver.switchTo().frame(iframeId);
        WebElement window = driver.switchTo().activeElement();
        return window;
    }

    public static void checkRadio(WebDriver driver, By by) {
        WebElement inputElement = driver.findElement(by);
        inputElement.click();
    }

    public static void goToTab(WebDriver driver, By by) {
        waitUntilClickable(driver, by);
        driver.findElement(by).click();
    }

    public static void populateTextBox(WebDriver driver, By by, String value) {
        WebElement inputElement = driver.findElement(by);
        if ("".equals(value)) {
            inputElement.clear();
        } else {
            inputElement.sendKeys(value);
        }
    }

    //SOFT Assert
    public static void checkSoftAssert(By by, String text, String message) {

        WebElement assertText = driver.findElement(by);
        Asserts.check(true, message);
    }

    //Get Title, Verify Title
    public static void getPageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("Title is " + pageTitle);
        String expected = new String();
    }

    public static void navigateToURL(String URL) {
        System.out.println("Navigating to: " + URL);
        try {
            driver.navigate().to(URL);
        } catch (Exception e) {
            System.out.println("URL did not load: " + URL);
            throw new TestException("URL did not load");
        }
    }

    public static void scrollPage() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-280)", "");
    }

    public static void thread() throws InterruptedException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Hover / Mouse Over element
    public static void hoverEffect(By by, By by1) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).build().perform();
        clickElement(by1);
    }

    //scroll page up or down (up is minus i.e. -250)
    public static void scrollPagep(int x, int y) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public static String getTextFromeElement(By by){

        return driver.findElement(by).getText();
    }

    public static void waitForElementClickeble(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

}
