package Page_Object;
import Page_Objects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TestSuite extends BaseTest {

    Register_Page register_page = new Register_Page();
    Compare_Page compare_page = new Compare_Page();
    Clear_Compare_List clear_compare_list = new Clear_Compare_List();
    Electronic_Page electronic_page = new Electronic_Page();
    Book_Page book_page = new Book_Page();

  @Test
  public void verifyUserShodBeOnHomePage(){
      Assert.assertEquals(getTextFromeElement(By.linkText("Register")),"Register");
  }

  @Test
    public void userShouldRegister(){
      register_page.UserShouldRegisterSuccessFully();
      Assert.assertEquals(getTextFromeElement(By.className("result")),"Your registration completed");
  }

  @Test
    public void userShouldAbleToCompareToItems(){
      compare_page.userShouldAbleToCompare();
      Assert.assertEquals(getTextFromeElement(By.xpath("//h1[contains(text(),'Compare products')]")),"Compare products");
  }

  @Test
    public void userShouldClearComparelist(){
      clear_compare_list.userShouldAbleToCleareComparelist();
      Assert.assertEquals(getTextFromeElement(By.xpath("//div[contains(text(),'You have no items to compare.')]")),"You have no items to compare.");
  }

  @Test
    public void UserShouldAbleToAddTocartSuccessFully(){
      electronic_page.userShouldAbleToAddToCartItem();
      Assert.assertEquals(getTextFromeElement(By.xpath("//h1[contains(text(),'Shopping cart')]")),"Shopping cart");
  }

  @Test
    public void userShouldBeAbleToAssertBooksPrice(){
      book_page.usershouldAbleToComparPriceOfBook();

      List<String> actualResult = new ArrayList<String>();
      WebElement table = driver.findElement(By.xpath("//span[contains(text(),'$24.00')]"));
      List<WebElement> allCells = table.findElements(By.xpath("//span[contains(text(),'$51.00')]"));

      for (int j=0; j<allCells.size(); j++){
          actualResult.add(allCells.get(j).getText());
      }
  }

}
