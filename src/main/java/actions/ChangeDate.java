package actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author ThierryBARTHEL
 *
 */
public class ChangeDate {
  /**
   * 
   * @param webDriver
   * @param localDate
   */
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

  WebDriver driver;

  final String inputDateId = "__input3-inner";

  public ChangeDate(WebDriver driver) {
    this.driver = driver;
  }

  /**
   * 
   * @param localDate
   */
  public void changeDate(LocalDate localDate) {
    String localDateString = localDate.format(formatter);
    driver.findElement(By.id(inputDateId)).clear();
    driver.findElement(By.id(inputDateId)).sendKeys(localDateString);
    ((JavascriptExecutor) driver).executeScript("$('#" + inputDateId + "').blur()");

    //
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
