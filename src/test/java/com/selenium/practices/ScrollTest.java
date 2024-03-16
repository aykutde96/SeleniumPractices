package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollTest extends BaseTest{
    @Test
    public void scrollTestJS(){
        driver.get("https://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.id("post-body-3107268830657760720"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(element.isDisplayed());
    }
}
