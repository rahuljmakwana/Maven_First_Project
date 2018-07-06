package Page_Object;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class BaseTest extends Utils{

    @BeforeMethod
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver","src\\Resources\\java\\Driver_Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

    @AfterMethod
    public void closeBrowser(){

       // driver.quit();
    }





}