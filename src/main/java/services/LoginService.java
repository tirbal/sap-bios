package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService {

    String url;
    String login;
    String password;

    public LoginService(WebDriver driver,String url, String login, String password)
    {

        super(driver);

        this.url = url;
        this.login = login;
        this.password = password;
    }


    @Override
    public boolean launch()  {
        driver.get(this.url);
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0")).click();
        driver.findElement(By.id("__control0-user-inner")).clear();
        driver.findElement(By.id("__control0-user-inner")).sendKeys(login);
        driver.findElement(By.id("__control0-pass-inner")).clear();
        driver.findElement(By.id("__control0-pass-inner")).sendKeys(password);
        driver.findElement(By.id("__control0-logonBtn")).click();
        this.wait(2);
        return true;
    }
}
