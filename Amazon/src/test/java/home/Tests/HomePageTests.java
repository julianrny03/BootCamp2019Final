package home.Tests;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTests extends home.HomePage {

    home.HomePage hp;

    @BeforeMethod
    public void initElements(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    //using data Driven approach (MongoDB)
    @Test
    public void TestSearchAllItemsInMongoDb(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        SearchAllItemsInMongoDb();
    }

    //using override
    @Test
    @Override //will select Appliances
    public void select(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Appliances");
    }

    @Test
    public void selectAmazonWarehouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Amazon Warehouse");
    }

    @Test
    public void selectAppsAndGames(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Apps & Games");
    }

    @Test
    public void selectArtsCraftsAndSewing(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Arts, Crafts & Sewing");
    }

    @Test
    public void selectBaby(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Baby");
    }

    @Test
    public void selectBeautyPersonalCare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Beauty & Personal Care");
    }

    @Test
    public void selectAutomotivePartsAndAccessories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Automotive Parts & Accessories");
    }

    @Test
    public void selectCreditandPaymentCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Credit and Payment Cards");
    }

    @Test
    public void selectCellPhonesAndAccessories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Cell Phones & Accessories");
    }

    @Test
    public void selectBooks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("Books");
    }

    @Test
    public void selectCDsAndVinyl(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectOptionFromAllDropDown("CDs & Vinyl");
    }
}
