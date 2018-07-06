package Page_Objects;

import Page_Object.Utils;
import org.openqa.selenium.By;

public class Clear_Compare_List extends Utils {

    Compare_Page compare_page = new Compare_Page();

    public void userShouldAbleToCleareComparelist(){
        compare_page.userShouldAbleToCompare();
        clickElement(By.xpath("//a[contains(text(),'Clear list')]"));
    }


}
