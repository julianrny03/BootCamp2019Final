package home.pageObject;

import home.webElement.WebElementUnitedHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JQueryUIHomePage extends WebElementUnitedHomePage {


        //Method 1
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)
        WebElement clickOnSignIn;
    public void checkSignIn() {
        clickOnSignIn.click();
    }





}
