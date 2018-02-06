package services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.openqa.selenium.WebDriver;
import actions.ChangeDate;

/**
 * 
 * @author ThierryBARTHEL
 *
 */
public class DateService extends Scenario {
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  String url;
  WebDriver driver;
  ChangeDate changeDateAction;
  LocalDate localDateStart;
  LocalDate localDateEnd;

  /**
   * 
   * @param url
   * @param driver
   */
  public DateService(String url, WebDriver driver) {
    this.url = url;
    this.driver = driver;
    this.changeDateAction = new ChangeDate(driver);
  }

  /**
   * 
   * @param url
   * @param driver
   */
  public DateService(String url, WebDriver driver, String localDateStart, String localDateEnd) {
    this(url, driver);
    //
    // LocalDate localDateStart,
    // LocalDate localDateEnd
    this.localDateStart = LocalDate.parse(localDateStart, formatter);
    this.localDateEnd = LocalDate.parse(localDateEnd, formatter);
  }


  /**
   * 
   * @param startDate
   * @param endDate
   * @return
   */
  public List<LocalDate> getDatesBetween(LocalDate startDate, LocalDate endDate) {

    long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween)
        .mapToObj(i -> startDate.plusDays(i)).collect(Collectors.toList());
  }
  
  /**
   * 
   * @param startDate
   * @param endDate
   * @return
   */
  public List<LocalDate> getMondaysBetween(LocalDate startDate, LocalDate endDate) {

    List<LocalDate> mondays = new ArrayList<> ();
    LocalDate mondayStartDate = startDate.with(DayOfWeek.MONDAY);
    mondays.add(mondayStartDate);
    
    while(mondayStartDate.isBefore(endDate)) {
      mondayStartDate = mondayStartDate.plusDays(7);
      mondays.add(mondayStartDate);
    }
    
    return mondays;
  }

  @Override
  public boolean launch() {
    //
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    List<LocalDate> localDates = this.getMondaysBetween(localDateStart, localDateEnd);
    // filter saturdays / sundays
    
    //
    for (LocalDate date : localDates) {
      logger.info("go to date : {}", date);
      this.changeDateAction.changeDate(date);
    }

    // TODO Auto-generated method stub
    return true;
  }
}
