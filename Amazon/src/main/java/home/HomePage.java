package home;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import common.WebAPI;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebAPI {

    @FindBy(id = "twotabsearchtextbox")public static WebElement searchBar;
    @FindBy(xpath = "//input[@value = 'Go']")public static WebElement searchButton;
    @FindBy(id = "searchDropdownBox")public static WebElement allDropDown;
    @FindBy(xpath = "//h1")public static WebElement header;

    //write to mongodb
    public void addItemsToCollection(){
        MongoDatabase items = MongoDbHelper.getDatabase("items");
        MongoCollection itemsForSearch = items.getCollection("ItemsForSearch");

        List<String> itemList = new ArrayList<>();
        itemList.add("Make Up");
        itemList.add("Car Parts");
        itemList.add("Protein");
        itemList.add("Food");
        itemList.add("Books");
        itemList.add("pencils");
        itemList.add("BackPack");
        itemList.add("Shoes");

        for (String s : itemList
             ) {
            Document doc = new Document();
            doc.put("item", s);
            itemsForSearch.insertOne(doc);
        }
    }

    // make sure my local Mongo is running in order for this to work. if it were on a server, it will work just fine.
    public void SearchAllItemsInMongoDb(){
        List<String> items = new ArrayList<>();
        MongoDatabase db = MongoDbHelper.getDatabase("items");
        MongoCollection itemsForSearch = db.getCollection("ItemsForSearch");

        FindIterable<Document> fi = itemsForSearch.find();
        MongoCursor<Document> cursor = fi.iterator();
        try {
            while (cursor.hasNext()) {
                for(Document d : fi){
                    String value = d.getString("item");
                    searchBar.sendKeys(value);
                    searchButton.click();
                    Thread.sleep(300);
                    searchBar.clear();
                }
            }

        } catch (InterruptedException ex) {
        } finally {
            cursor.close();
        }
    }

    public void select() {}

    //Select Drop down Using Select class
    public void selectOptionFromAllDropDown(String option){
        explicitlyWait(10).until(ExpectedConditions.visibilityOf(searchBar));

        Select selector = new Select(allDropDown);
        selector.selectByVisibleText(option);

        //get current selected element
        WebElement current = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));
        Assert.assertTrue(selector.getAllSelectedOptions().contains(current), "wrong page selected");
    }
}
