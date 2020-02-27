package home.pageObject;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class HomePageActions extends WebAPI {

    @FindBy(xpath = "//h1")public static WebElement header;
    @FindBy(xpath = "//aside[h3[text() = 'Interactions']]/ul/li/a")public static List<WebElement> interactionsList;
    @FindBy(xpath = "//div[@id = 'draggable']/p")public static WebElement draggableBox;


    //Actions Class and Drag & Drop
    public void dragAndDropInDraggableSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        Actions actions = new Actions(driver);

        for(WebElement e : interactionsList){
            if(e.getText().equalsIgnoreCase("Draggable"))
                e.click();
            break;
        }
        //assert at the right page
        Assert.assertTrue(header.getText().equals("Draggable"));

        actions.dragAndDropBy(draggableBox, 180, 300)
               .build()
               .perform()
               ;

    }
}
