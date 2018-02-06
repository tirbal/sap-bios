package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginService {


    String url;

    WebDriver driver;


    public LoginService(String url, WebDriver driver)
    {
        this.url = url;
        this.driver = driver;
    }

    public void login(String login, String password) {
        driver.get(this.url);
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0-user-inner")).clear();
        driver.findElement(By.id("__control0-user-inner")).sendKeys(login);
        driver.findElement(By.id("__control0-pass-inner")).clear();
        driver.findElement(By.id("__control0-pass-inner")).sendKeys(password);
        driver.findElement(By.id("__control0-logonBtn")).click();
    }





}
