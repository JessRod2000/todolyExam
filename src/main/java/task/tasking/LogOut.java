package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageTodoly;
import ui.HomePageUserUI;
import ui.LoginUI;

public class LogOut {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, HomePageUserUI.Logout);
    }
}
