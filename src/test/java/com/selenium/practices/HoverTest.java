package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverTest extends BaseTest{
    @Test
    public void hoverTest(){
        driver.get("https://the-internet.herokuapp.com/hovers");
        List<WebElement> userAvatars = driver.findElements(By.cssSelector("img[alt='User Avatar']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userAvatars.get(1)).build().perform();
        driver.findElement(By.cssSelector("a[href='/users/2']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/users/2"));
    }
}
