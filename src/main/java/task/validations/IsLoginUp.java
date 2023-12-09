package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUserUI;

public class IsLoginUp {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUserUI.Logout);
    }
    public static boolean visibleOptionNewProject(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUserUI.newProject);
    }
}
