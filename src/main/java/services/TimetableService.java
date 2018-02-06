package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimetableService extends BaseService {


    public TimetableService(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean launch() {
        driver.findElement(By.cssSelector("div.sapBUiShMnuItemIcon")).click();
        this.wait(1);
        driver.findElement(By.cssSelector("#__item33 > div.sapBUiCenterMnuItemText")).click();
        //driver.get(this.url);
        this.wait(5);
        driver.findElement(By.cssSelector("#__link24")).click();
        this.wait(5);
        return false;
    }



    void save() {
        this.driver.findElement(new By.ByXPath("//*[contains(text(), 'Save')]")).click();
    }


}
