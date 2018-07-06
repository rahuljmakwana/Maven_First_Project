package Page_Objects;

import Page_Object.Utils;
import org.openqa.selenium.By;

public class Electronic_Page extends Utils {

    public void userShouldAbleToAddToCartItem(){
        clickElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/h2/a"));
        clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]"));
        clickElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
    }
}
