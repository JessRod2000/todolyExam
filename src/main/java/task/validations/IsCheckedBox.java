package task.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckboxesUI;

public class IsCheckedBox {
    public static boolean checkBox1(WebDriver webDriver){
        WebElement checkbox = webDriver.findElement(CheckboxesUI.checkbox1);
        return checkbox.isSelected();
    }
    public static boolean checkBox2(WebDriver webDriver){
        WebElement checkbox = webDriver.findElement(CheckboxesUI.checkbox2);
        return checkbox.isSelected();
    }
}
