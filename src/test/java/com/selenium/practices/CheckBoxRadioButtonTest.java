package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxRadioButtonTest extends BaseTest{
    @Test
    public void checkBoxTest(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //check that checkbox 1 is not selected before the click
        Assert.assertFalse(checkBoxes.get(0).isSelected());
        checkBoxes.get(0).click();
        //check that checkbox 1 is selected after click
        Assert.assertTrue(checkBoxes.get(0).isSelected());
    }

}
