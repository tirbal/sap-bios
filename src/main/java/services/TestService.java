package services;

import launch.Application;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author ThierryBARTHEL
 */
public class TestService extends Scenario {


    String url = "https://my335712.sapbydesign.com/sap/public/ap/ui/repository/SAP_UI/HTMLOBERON5/client.html?client_type=html&app.component=/SAP_UI_CT/Main/root.uiccwoc&rootWindow=X&redirectUrl=/sap/public/ap/ui/runtime";

    /**
     *
     */

    WebDriver driver = new ChromeDriver();


    LoginService loginService = new LoginService(driver,url,Application.CONFIG.getProperty("username"), Application.CONFIG.getProperty("password"));

    TimetableService timetableService = new TimetableService(driver);

    DateService dateService = new DateService(url, driver, Application.CONFIG.getProperty("start.date"), Application.CONFIG.getProperty("end.date"));


    @Override
    public boolean launch() throws Exception {


        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(1400,768));


        /**
         * Login
         */

        logger.info("Login");

        this.loginService.launch();

        /**
         * Go to timetable
         */
        logger.info("Go to timetable ");
        this.timetableService.launch();

        this.dateService.launch();

        Thread.sleep(10000);
        this.driver.close();


        return true;
    }

}
