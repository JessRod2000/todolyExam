package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By addRemove = By.xpath("//a[.='Add/Remove Elements']");
    public static By checkBoxes = By.xpath("//*[@id=\"content\"]/ul/li[6]/a");
    public static By basicAuth = By.xpath("//*[@id=\"content\"]/ul/li[3]/a");
    public static By formAuth = By.xpath("//a[.='Form Authentication']");
    public static By dropDown = By.xpath("//*[@id=\"content\"]/ul/li[11]/a");
}
