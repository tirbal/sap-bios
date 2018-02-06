package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import actions.TestAction;


/**
 * 
 * @author ThierryBARTHEL
 *
 */
public class TestService extends Scenario {
  /**
   * 
   */
  private final Logger logger = LoggerFactory.getLogger(TestService.class);

  WebDriver driver = new FirefoxDriver();

  /**
   * 
   */
  TestAction testAction = new TestAction();

  /**
   * 
   */
  public void launchScenarioTest() {
    logger.info("launch scenario test");
    testAction.clickOnThis(driver);
  }

  @Override
  public boolean launch() {
    this.launchScenarioTest();
    return true;
  }
}
