package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageTodoly;
import ui.SingUpUI;

public class SignUp {
    public static void as(WebDriver webDriver, String name, String email, String password){
        Click.on(webDriver, HomePageTodoly.SignUpFree);
        Enter.text(webDriver, SingUpUI.fullName, name);
        Enter.text(webDriver, SingUpUI.email, email);
        Enter.text(webDriver, SingUpUI.password, password);
        Click.on(webDriver, SingUpUI.termsOfService);
        Click.on(webDriver, SingUpUI.signupButton);
    }
}
