/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    GregorianCalendar cal1 = new GregorianCalendar(2018, 4, 23);
    CalDay day1 = new CalDay(cal1);
    Appt appt00 = new Appt(9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    day1.addAppt(appt00);
    assertTrue(day1.isValid());

  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    GregorianCalendar cal2 = new GregorianCalendar(2018, 4, 23);
    CalDay day2 = new CalDay(cal2);
    Appt appt0 = new Appt(15, 0, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    day2.addAppt(appt0);
    assertTrue(day2.getFullInfomrationApp(day2) != null);
    assertTrue(day2.toString() != null);
  }

}
