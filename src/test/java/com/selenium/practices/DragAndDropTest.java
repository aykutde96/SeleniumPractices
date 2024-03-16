package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest extends BaseTest{
    @Test
    public void dragAndDropTest(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        // import Actions. Actions class is used to chain together multiple Actions to form a sequence of interactions.
        WebElement elementA = driver.findElement(By.id("column-a"));
        WebElement elementB = driver.findElement(By.id("column-b"));
        Actions action = new Actions(driver);
        action.dragAndDrop(elementA, elementB).build().perform();
        Assert.assertEquals("B",elementA.getText());
        Assert.assertEquals("A",elementB.getText());
    }

}
