package TestHome;

import home.pageObject.HomePageActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageActionsTests extends HomePageActions {
    HomePageActions hpa;

    @BeforeMethod
    public void initElements(){
        hpa = PageFactory.initElements(driver, HomePageActions.class);
    }

    @Test
    public void testDraggableInteraction(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        dragAndDropInDraggableSection();
    }
}
