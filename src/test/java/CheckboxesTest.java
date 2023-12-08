import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CheckBoxes;
import task.validations.IsCheckedBox;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkedOnlybox1(){
        CheckBoxes.as(webDriver);
        Assert.assertTrue(IsCheckedBox.checkBox1(webDriver));
        Assert.assertFalse(IsCheckedBox.checkBox2(webDriver));
    }
} 