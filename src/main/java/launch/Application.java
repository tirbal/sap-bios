package launch;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import services.TestService;

public class Application {
  /**
   * 
   */
  public static Properties CONFIG = new Properties();
  static {
    try {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      InputStream is = classLoader.getResourceAsStream("application.properties");
      CONFIG.load(is);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    //
    System.out.println("Hello SAP");
    System.setProperty("webdriver.chrome.driver", CONFIG.getProperty("chrome.driver.path")); // "src/main/resources/chromedriver.exe");
    new TestService().launch();
  }
}
