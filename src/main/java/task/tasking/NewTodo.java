package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUserUI;

public class NewTodo {
    public static void as(WebDriver webDriver, String todo){
        Click.on(webDriver, HomePageUserUI.projectDiplomadoV5);
        Enter.text(webDriver, HomePageUserUI.NewTodo, todo);
    }
}
