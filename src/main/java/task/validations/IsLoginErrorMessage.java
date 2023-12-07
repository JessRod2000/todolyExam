package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;

public class IsLoginErrorMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, FormAuthentication.alertError);
    }
}
