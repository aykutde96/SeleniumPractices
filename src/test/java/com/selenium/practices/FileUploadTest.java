package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.File;

public class FileUploadTest extends BaseTest{
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
        File file = new File("uploadPhoto.png");
        driver.findElement(By.cssSelector("input[type='file']")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        Assert.assertEquals("uploadPhoto.png",driver.findElement(By.id("uploaded-files")).getText());

    }
}
