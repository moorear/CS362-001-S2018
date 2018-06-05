/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    DataHandler dh1 = new DataHandler();
    Appt appt01 = new Appt(15, 30, 4, 27, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    int[] recurDaysArr={2,3,4};
    appt01.setRecurrence( recurDaysArr, Appt.RECUR_BY_YEARLY, 1, Appt.RECUR_NUMBER_FOREVER);
    dh1.saveAppt(appt01);
    GregorianCalendar cal1 = new GregorianCalendar(2018, 4, 23);
    GregorianCalendar cal2 = new GregorianCalendar(2020, 4, 30);
    assertTrue(dh1.getApptRange(cal1, cal2) != null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    DataHandler dh2 = new DataHandler();
    Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    assertTrue(dh2.saveAppt(appt0));
    assertTrue(dh2.deleteAppt(appt0));

  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    DataHandler dh3 = new DataHandler();
    Appt appt02 = new Appt(15, 30, 4, 27, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    int[] recurDaysArr={2,3,4};
    appt02.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
    Appt appt03 = new Appt(15, 30, 4, 28, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    appt03.setRecurrence(null, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
    dh3.saveAppt(appt02);
    dh3.saveAppt(appt03);
    GregorianCalendar cal3 = new GregorianCalendar(2018, 4, 23);
    GregorianCalendar cal4 = new GregorianCalendar(2020, 4, 30);
    assertTrue(dh3.getApptRange(cal3, cal4) != null);
  }

}
