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

    //using data Driven approach (MongoDB)
    @Test
    public void TestSearchAllItemsInMongoDb(){
        SearchAllItemsInMongoDb();
    }

    //using override
    @Test
    @Override //will select Appliances
    public void select(){
        selectOptionFromAllDropDown("Appliances");
    }

    @Test
    public void selectAmazonWarehouse(){
        selectOptionFromAllDropDown("Amazon Warehouse");
    }

    @Test
    public void selectAppsAndGames(){
        selectOptionFromAllDropDown("Apps & Games");
    }

    @Test
    public void selectArtsCraftsAndSewing(){
        selectOptionFromAllDropDown("Arts, Crafts & Sewing");
    }

    @Test
    public void selectBaby(){
        selectOptionFromAllDropDown("Baby");
    }

    @Test
    public void selectBeautyPersonalCare(){
        selectOptionFromAllDropDown("Beauty & Personal Care");
    }

    @Test
    public void selectAutomotivePartsAndAccessories(){
        selectOptionFromAllDropDown("Automotive Parts & Accessories");
    }

    @Test
    public void selectCreditandPaymentCards(){
        selectOptionFromAllDropDown("Credit and Payment Cards");
    }

    @Test
    public void selectCellPhonesAndAccessories(){
        selectOptionFromAllDropDown("Cell Phones & Accessories");
    }

    @Test
    public void selectBooks(){
        selectOptionFromAllDropDown("Books");
    }

    @Test
    public void selectCDsAndVinyl(){
        selectOptionFromAllDropDown("CDs & Vinyl");
    }
}
