package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimetableService {


    public TimetableService(WebDriver webDriver) {
        this.driver = webDriver;
    }


    WebDriver driver;

    public void open() {
        driver.findElement(By.cssSelector("div.sapBUiShMnuItemIcon")).click();
        driver.findElement(By.cssSelector("#__item33 > div.sapBUiCenterMnuItemText")).click();
        driver.findElement(By.id("__link24")).click();
    }
}
