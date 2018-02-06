package services;

import org.openqa.selenium.By;

public class LoginService extends Scenario {

    String url;
    String login;
    String password;

    public LoginService(String url,String login, String password)
    {
        this.url = url;
        this.login = login;
        this.password = password;
    }


    @Override
    public boolean launch() {
        driver.get(this.url);
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0-user-inner")).clear();
        driver.findElement(By.id("__control0-user-inner")).sendKeys(login);
        driver.findElement(By.id("__control0-pass-inner")).clear();
        driver.findElement(By.id("__control0-pass-inner")).sendKeys(password);
        driver.findElement(By.id("__control0-logonBtn")).click();
        this.wait(10);

        return true;
    }
}
