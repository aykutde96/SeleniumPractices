package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenuTest extends BaseTest {
    @Test
    public void dropDownMenuTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select selectMenu = new Select(driver.findElement(By.id("dropdown")));
        Assert.assertEquals("Please select an option",selectMenu.getFirstSelectedOption().getText());
        selectMenu.selectByVisibleText("Option 1");
        Assert.assertEquals("Option 1",selectMenu.getFirstSelectedOption().getText());
        selectMenu.selectByValue("2");
        Assert.assertEquals("Option 2",selectMenu.getFirstSelectedOption().getText());
        selectMenu.selectByIndex(1);
        Assert.assertEquals("Option 1",selectMenu.getFirstSelectedOption().getText());
    }
}
