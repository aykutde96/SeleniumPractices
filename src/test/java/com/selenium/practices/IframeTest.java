package com.selenium.practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeTest extends BaseTest{
    @Test
    public void iFrameTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("tinymce")).sendKeys("deneme");
        driver.switchTo().defaultContent();
    }
}
