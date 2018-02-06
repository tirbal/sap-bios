package services;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRowService extends BaseService {

    WebElement addButton;

    public AddRowService(WebDriver driver) {
        super(driver);

    }

    private void addRow(String task, String activity) {
        this.driver.findElement(new ByXPath("//*[contains(text(), 'Add Row')]")).click();

    }


    @Override
    public boolean launch() {

        this.addRow("","");
        return true;
    }


    WebElement getInput(WebElement webElement) {
       return  webElement.findElement(By.tagName("input"));
    }
}
