package home.Tests;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends home.HomePage {

    home.HomePage hp;

    @BeforeMethod
    public void initElements(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void TestSearchAllItemsInMongoDb(){
        SearchAllItemsInMongoDb();
    }

    //using override
    @Test
    @Override
    public void select(){
        selectOptionFromAllDropDown("Appliances");
    }
}
