package home.pageObject;

import home.webElement.WebElementUnitedHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;

public class JQueryUIHomePage extends WebElementUnitedHomePage {

    @FindBy(xpath = "//h1")public static WebElement header;
    @FindBy(xpath = "//ul[@id = 'menu-top']/li/a[contains(@href, 'demos')]")public static WebElement demosButton;
    @FindBy(xpath = "//aside[h3[text() = 'Interactions']]/ul/li")public static Iterable<WebElement> interactionsList;
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)WebElement clickOnSignIn;

    public void checkSignIn() {
        clickOnSignIn.click();
    }

    //javascriptExecutor
    public void clickOnDemos(){
        explicitlyWait(10).until(
                d -> d.findElement(By.xpath("//ul[@id = 'menu-top']/li/a[contains(@href, 'demos')]"))
                      .isEnabled()
        );

        javaExecutorClick(demosButton);
        Assert.assertTrue(header.getText().contains("Demos"), "Could not click demos button");
    }

    //list webelement
    public void selectInteractions(String name){
        ArrayList<WebElement> elemList = (ArrayList<WebElement>) interactionsList;
        for (WebElement e : elemList
        ) {
            if(e.getText() == name) {
                explicitlyWait(10).until(ExpectedConditions.elementToBeClickable(e));
                e.click();
                return;
            }
        }

    }
}
