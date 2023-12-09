package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageTodoly;

public class IsLogOut {
    public static boolean visibleLogButton(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageTodoly.Login);
    }
    public static boolean visibleSignUpButton(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageTodoly.SignUpFree);
    }
}
