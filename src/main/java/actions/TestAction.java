package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author ThierryBARTHEL
 *
 */
public class TestAction {

  /**
   * 
   */
  public void clickOnThis(WebDriver webDriver) {
    webDriver.get( "http://www.sap.com/" );
    WebElement formEmail = webDriver.findElement(By.name("email"));
    // formEmail.sendKeys("LOL");
    WebElement formPassword = webDriver.findElement(By.name("pass"));
  }
}
