package TestHome;

import home.pageObject.JQueryUIHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestJQueryUIHomePage extends JQueryUIHomePage {

    JQueryUIHomePage homePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, JQueryUIHomePage.class);
    }

    //jsExecutor
    @Test
    public void testDemosButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        clickOnDemos();
    }

    @Test
    public void clickDraggable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectInteractions("Draggable");
    }

    @Test
    public void clickDroppable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectInteractions("Droppable");
    }

    @Test
    public void clickResizable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectInteractions("Resizable");
    }

    @Test
    public void clickSelectable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectInteractions("Selectable");
    }

    @Test
    public void clickSortable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectInteractions("Sortable");
    }

    @Test
    public void clickPosotion(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectUtilities("Position");
    }

    @Test
    public void clickWidgetFactory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        selectUtilities("Widget Factory");
    }
}