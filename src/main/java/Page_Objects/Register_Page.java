package Page_Objects;

import Page_Object.Utils;
import org.openqa.selenium.By;

public class Register_Page extends Utils {

    public void UserShouldRegisterSuccessFully(){

        clickElement(By.linkText("Register"));
        clickElement(By.id("gender-male"));
        clearAndEnterText(By.name("FirstName"),"rr");
        clearAndEnterText(By.id("LastName"),"rp");
        selectByIndex(By.name("DateOfBirthDay"),1);
        selectByValue(By.name("DateOfBirthMonth"),"11");
        selectByVisibleText(By.name("DateOfBirthYear"),"1992");
        clearAndEnterText(By.id("Email"),randomNumber()+"@gmail.com");
        clearAndEnterText(By.id("Company"),"pound");
        clickElement(By.id("Newsletter"));
        clearAndEnterText(By.id("Password"),"098765432p");
        clearAndEnterText(By.id("ConfirmPassword"),"098765432p");
        clickElement(By.id("register-button"));


    }
}