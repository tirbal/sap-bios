package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public abstract class Scenario {
  public final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

  WebDriver driver = new ChromeDriver();


  void wait(int seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }


  abstract public boolean launch();
}
