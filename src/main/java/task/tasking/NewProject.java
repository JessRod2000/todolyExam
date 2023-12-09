package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageTodoly;
import ui.HomePageUserUI;

public class NewProject {
    public static void as(WebDriver webDriver, String name){
        Click.on(webDriver, HomePageUserUI.newProject);
        Enter.text(webDriver, HomePageUserUI.nameProject, name);
        Click.on(webDriver, HomePageUserUI.buttonNewProject);
    }
}
