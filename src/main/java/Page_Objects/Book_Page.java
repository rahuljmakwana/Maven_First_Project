package Page_Objects;

import Page_Object.Utils;
import org.openqa.selenium.By;

public class Book_Page extends Utils {

    public void usershouldAbleToComparPriceOfBook(){
        clickElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a"));
        selectByVisibleText(By.id("products-orderby"),"Price: Low to High");
        selectByVisibleText(By.id("products-pagesize"),"3");
    }
}
