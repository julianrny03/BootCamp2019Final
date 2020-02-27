package home.pageObject;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class JQueryUIHomePage extends WebAPI {

    @FindBy(xpath = "//h1")public static WebElement header;
    @FindBy(xpath = "//ul[@id = 'menu-top']/li/a[contains(@href, 'demos')]")public static WebElement demosButton;
    @FindBy(xpath = "//aside[h3[text() = 'Interactions']]/ul/li/a")public static List<WebElement> interactionsList;
    @FindBy(xpath = "//aside[h3[text() = 'Utilities']]/ul/li/a")public static List<WebElement> utilitiesList;

    //javascriptExecutor
    public void clickOnDemos(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        explicitlyWait(10).until(
                d -> d.findElement(By.xpath("//ul[@id = 'menu-top']/li/a[contains(@href, 'demos')]"))
                      .isEnabled()
        );

        javaExecutorClick(demosButton);
        Assert.assertTrue(header.getText().contains("Demos"), "Could not click demos button");
    }

    //scrolling
    public void selectUtilities(String name){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        for (WebElement e : utilitiesList
             ) {
            if(e.getText().equalsIgnoreCase(name)){
                scrollIntoView(e);
                e.click();
                break;
            }
        }

        explicitlyWait(10).until(d -> header.isDisplayed());
        //refresh
        driver.navigate().refresh();
        Assert.assertTrue(header.getText().contains(name));
    }

    //list ebelement
    public void selectInteractions(String name) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        for (WebElement e : interactionsList
        ) {
            if(e.getText().equalsIgnoreCase(name)){
                javaExecutorClick(e);
                break;
            }
        }

        explicitlyWait(10).until(d -> header.isDisplayed());
        //refresh
        driver.navigate().refresh();
        Assert.assertTrue(header.getText().contains(name));
    }
}
