package home.Tests;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTests2 extends home.HomePage{

    home.HomePage hp;

    @BeforeMethod
    public void initElements(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void selectDigitalEducationalResources(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Digital Educational Resources");
    }

    @Test
    public void selectDigitalMusic(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Digital Music");
    }

    @Test
    public void selectElectronics(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Electronics");
    }

    @Test
    public void selectGardenOutdoor(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Garden & Outdoor");
    }

    @Test
    public void selectGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Gift Cards");
    }

    @Test
    public void selectGroceryGourmetFood(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Grocery & Gourmet Food");
    }

    @Test
    public void selectHandmade(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Handmade");
    }

    @Test
    public void selectHealthHouseholdBabyCare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Health, Household & Baby Care");
    }

    @Test
    public void selectHomeBusinessServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Home & Business Services");
    }
}
