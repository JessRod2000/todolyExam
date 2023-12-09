package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUserUI;

public class IsCreatedProject {
    public static boolean isVisible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUserUI.projectDiplomadoV5);
    }
}
