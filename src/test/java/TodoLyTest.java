import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.*;
import task.validations.IsCreatedProject;
import task.validations.IsLogOut;
import task.validations.IsLoginUp;

public class TodoLyTest extends BaseTest {
    @Test
    public void signupTest(){
        SignUp.as(webDriver, "Jessica Rodriguez","jerodbook@gmail.com","contra1234");
        Assert.assertTrue(IsLoginUp.visible(webDriver));
    }
    @Test
    public void logoutTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        LogOut.as(webDriver);
        Assert.assertTrue(IsLogOut.visibleLogButton(webDriver));
        Assert.assertTrue(IsLogOut.visibleSignUpButton(webDriver));
    }
    @Test
    public void loginTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        Assert.assertTrue(IsLoginUp.visible(webDriver));
        Assert.assertTrue(IsLoginUp.visibleOptionNewProject(webDriver));
    }
    @Test
    public void createProjectTest (){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        NewProject.as(webDriver, "Diplomado V5");
        Assert.assertTrue(IsCreatedProject.isVisible(webDriver));
    }
    @Test
    public void newTodoTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        NewTodo.as(webDriver,"Tarea Completada");
    }
}
