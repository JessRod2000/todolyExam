package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.FormAuthentication;

public class IsLogoutButton {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, FormAuthentication.logoutButton);
    }
}
