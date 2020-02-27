package home.Tests;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests2 extends home.HomePage{

    home.HomePage hp;

    @BeforeMethod
    public void initElements(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void selectDigitalEducationalResources(){
        selectOptionFromAllDropDown("Digital Educational Resources");
    }

    @Test
    public void selectDigitalMusic(){
        selectOptionFromAllDropDown("Digital Music");
    }

    @Test
    public void selectElectronics(){
        selectOptionFromAllDropDown("Electronics");
    }

    @Test
    public void selectGardenOutdoor(){
        selectOptionFromAllDropDown("Garden & Outdoor");
    }

    @Test
    public void selectGiftCards(){
        selectOptionFromAllDropDown("Gift Cards");
    }

    @Test
    public void selectGroceryGourmetFood(){
        selectOptionFromAllDropDown("Grocery & Gourmet Food");
    }

    @Test
    public void selectHandmade(){
        selectOptionFromAllDropDown("Handmade");
    }

    @Test
    public void selectHealthHouseholdBabyCare(){
        selectOptionFromAllDropDown("Health, Household & Baby Care");
    }

    @Test
    public void selectHomeBusinessServices(){
        selectOptionFromAllDropDown("Home & Business Services");
    }
}
