package services;

import launch.Application;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import actions.TestAction;

import java.util.concurrent.TimeUnit;


/**
 * @author ThierryBARTHEL
 */
public class TestService extends Scenario {


    String url = "https://my335712.sapbydesign.com/sap/public/ap/ui/repository/SAP_UI/HTMLOBERON5/client.html?client_type=html&app.component=/SAP_UI_CT/Main/root.uiccwoc&rootWindow=X&redirectUrl=/sap/public/ap/ui/runtime";

    /**
     *
     */

    LoginService loginService = new LoginService(url,Application.CONFIG.getProperty("username"), Application.CONFIG.getProperty("password"));

    TimetableService timetableService = new TimetableService(driver);


    @Override
    public boolean launch() {

        /**
         * Login
         */

        logger.info("Login");

        this.loginService.launch();

        /**
         * Go to timetable
         */
        logger.info("Go to timetable ");
        this.timetableService.open();


        return true;
    }

}
