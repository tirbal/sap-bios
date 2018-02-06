package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import actions.TestAction;

import java.util.concurrent.TimeUnit;


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

  WebDriver driver = new ChromeDriver();

  String url = "https://my335712.sapbydesign.com/sap/public/ap/ui/repository/SAP_UI/HTMLOBERON5/client.html?client_type=html&app.component=/SAP_UI_CT/Main/root.uiccwoc&rootWindow=X&redirectUrl=/sap/public/ap/ui/runtime";

  /**
   * 
   */
  TestAction testAction = new TestAction();

  LoginService loginService = new LoginService(url,driver);

  TimetableService timetableService = new TimetableService(driver);

  /**
   * 
   */
  public void launchScenarioTest() {
    logger.info("launch scenario test");


    testAction.clickOnThis(driver);
  }

  @Override
  public boolean launch() {

    /**
     * Login
     */

    this.loginService.login("maxime.leprince@bioserenity.com","sdfsdfsdf");
    this.wait(2);

    /**
     * Go to timetable
     */
    this.timetableService.open();

    return true;
  }




  void wait(int seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }



}
