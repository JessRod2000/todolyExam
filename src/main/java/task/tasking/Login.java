package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageTodoly;
import ui.LoginUI;

public class Login {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, HomePageTodoly.Login);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, password);
        Click.on(webDriver, LoginUI.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Login");
    }
}
