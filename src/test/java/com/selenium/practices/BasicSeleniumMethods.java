package com.selenium.practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasicSeleniumMethods extends BaseTest{
    @Test
    public void loginTest(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                driver.getCurrentUrl());
        WebElement userDropdown = driver.findElement(By.cssSelector(".oxd-userdropdown"));
        Assert.assertTrue(userDropdown.isDisplayed());
    }
}
