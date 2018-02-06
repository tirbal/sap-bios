package launch;

import services.TestService;

/**
 * 
 * @author ThierryBARTHEL
 *
 */
public class Application {
  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    //
    System.out.println("Hello SAP");
    new TestService().launch();
  }
}
