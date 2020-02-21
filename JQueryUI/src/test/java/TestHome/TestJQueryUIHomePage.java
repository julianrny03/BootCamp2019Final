package TestHome;

import common.WebAPI;
import home.pageObject.JQueryUIHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestJQueryUIHomePage extends WebAPI {


    @Test(priority = 1)
    public void testSignIn() throws InterruptedException {
        JQueryUIHomePage home = PageFactory.initElements(driver, JQueryUIHomePage.class);
        driver.manage().window().maximize();
        sleepFor(2);
        home.checkSignIn();
    }

}
