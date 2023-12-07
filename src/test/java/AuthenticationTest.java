import base.BaseTest;
import lombok.extern.java.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;
import task.validations.IsLogoutButton;

public class AuthenticationTest extends BaseTest {
    @Test
    public void authenticationSucessTest(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Assert.assertTrue(IsLogoutButton.visible(webDriver));
        Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver),"You logged into a secure area!\n×");
    }
    @Test
    public void authenticationUsernameInvalid(){
        Login.as(webDriver,"jessica","SuperSecretPassword!");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver),"Your username is invalid!\n×");
    }
    @Test
    public void authenticationPasswordInvalid(){
        Login.as(webDriver,"tomsmith","contraIncorrecta");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver),"Your password is invalid!\n×");
    }
}