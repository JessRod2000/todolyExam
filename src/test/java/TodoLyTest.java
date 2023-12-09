import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.*;

public class TodoLyTest extends BaseTest {
    @Test
    public void signupTest(){
        SignUp.as(webDriver, "Jessica Rodriguez","jerodbook@gmail.com","contra1234");
    }
    @Test
    public void logoutTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        LogOut.as(webDriver);
    }
    @Test
    public void loginTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
    }
    @Test
    public void createProjectTest (){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        NewProject.as(webDriver, "Diplomado V5");
    }
    @Test
    public void newTodoTest(){
        Login.as(webDriver,"jessrodgu@gmail.com","1234");
        NewTodo.as(webDriver,"Tarea Completada");
    }
}
