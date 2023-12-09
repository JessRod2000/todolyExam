package ui;

import org.openqa.selenium.By;

public class HomePageUserUI {
    public static By Logout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By newProject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div");
    public static By nameProject = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By buttonNewProject = By.xpath("//*[@id=\"NewProjNameButton\"]");
    public static By projectDiplomadoV5 = By.xpath("//*[@id=\"ItemId_4174062\"]");
    public static By NewTodo = By.xpath("//*[@id=\"NewItemContentInput\"]");
}
