package home.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.*;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends WebAPI{

    @FindBy(linkText = "Chase Auto")public static WebElement chaseAutoLink;
    @FindBy(partialLinkText = "online")public static List<WebElement> onlineContainingElements;

    //LinkText
    public void clickChaseAutoLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        explicitlyWait(10).until(d -> d.findElement(
                By.linkText("Chase Auto"))
                .isDisplayed()
        );
        scrollIntoView(chaseAutoLink);
        chaseAutoLink.click();

        explicitlyWait(10).until(d ->
            d.getCurrentUrl().contains("autopreferred")
        );
        Assert.assertTrue(driver.getCurrentUrl().equals("https://autopreferred.chase.com/"));
    }

    //partial LinkText
    public void findAndClickInvestOnline(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        for(WebElement e : onlineContainingElements){
            if(e.getText().equalsIgnoreCase("invest online")){
                scrollIntoView(e);
                e.click();
                break;
            }
        }

        explicitlyWait(10).until(
                d -> d.findElement(By.linkText("invest online"))
        );
        Assert.assertTrue(driver.getCurrentUrl().contains("you-invest"));
    }
}
