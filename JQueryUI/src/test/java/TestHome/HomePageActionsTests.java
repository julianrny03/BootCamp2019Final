package TestHome;

import home.pageObject.HomePageActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageActionsTests extends HomePageActions {
    HomePageActions hpa;

    @BeforeMethod
    public void initElements(){
        hpa = PageFactory.initElements(driver, HomePageActions.class);
    }

    @Test
    public void testDraggableInteraction(){
        dragAndDropInDraggableSection();
    }
}
