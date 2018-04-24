
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
    GregorianCalendar cal1 = new GregorianCalendar(2018, 4, 23);
    GregorianCalendar cal2 = new GregorianCalendar(2018, 4, 30);
    assertTrue(dh1.getApptRange(cal1, cal2) != null);

  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    DataHandler dh2 = new DataHandler();
    Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    assertTrue(dh2.saveAppt(appt0));
    assertTrue(dh2.deleteAppt(appt0));

  }

}
