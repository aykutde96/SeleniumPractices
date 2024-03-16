package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchWindowTest extends BaseTest {
    @Test
    public void switchTabTest() {
        driver.get("https://the-internet.herokuapp.com/windows");
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();
        //Check we don't have other windows open already
        Assert.assertEquals(1,driver.getWindowHandles().size());
        //Click the link which opens in a new window
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        //Wait for the new window or tab
        Assert.assertEquals(2,driver.getWindowHandles().size());
        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        //Wait for the new tab to finish loading content
        Assert.assertEquals("New Window",driver.getTitle());
    }
}
