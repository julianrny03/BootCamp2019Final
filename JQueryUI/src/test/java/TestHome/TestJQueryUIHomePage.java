package TestHome;

import common.WebAPI;
import home.pageObject.JQueryUIHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJQueryUIHomePage extends JQueryUIHomePage {

    JQueryUIHomePage homePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, JQueryUIHomePage.class);
    }

    //jsExecutor
    @Test
    public void testDemosButton(){
        clickOnDemos();
    }

    @Test
    public void clickDraggable(){
        selectInteractions("Draggable");
    }

    @Test
    public void clickDroppable(){
        selectInteractions("Droppable");
    }

    @Test
    public void clickResizable(){
        selectInteractions("Resizable");
    }

    @Test
    public void clickSelectable(){
        selectInteractions("Selectable");
    }

    @Test
    public void clickSortable(){
        selectInteractions("Sortable");
    }
}