/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
      assertFalse(appt0.getValid());
      assertEquals("Birthday Party", appt0.getTitle());
      assertEquals(2018, appt0.getStartYear());
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt1 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      assertFalse(appt1.isOn(9, 10, 2017));
      assertTrue(appt1.hasTimeSet());
      appt1.setRecurrence(null, 3, 1, 1000);
      assertTrue(appt1.isRecurring());
      assertEquals(appt1.getRecurIncrement(), 1);
      //assertEquals(appt1.getRecurDays(), null);

  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt2 = new Appt(1, 1, 2, 2, 1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      appt2.setValid();
      assertTrue(appt2.getValid());
      assertTrue(appt2.hasTimeSet() && appt2.isOn(2,2,1));
      assertEquals(appt2.getEmailAddress(), "xyz@gmail.com");

  }

}
