package home.Tests;

import home.PageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTests extends home.PageObject.HomePage{

    home.PageObject.HomePage hp;

    @BeforeMethod
    public void initElements(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testClickChaseAutoLink(){
        clickChaseAutoLink();
    }

    @Test
    public void testClickInvestOnline(){
        findAndClickInvestOnline();
    }


}
