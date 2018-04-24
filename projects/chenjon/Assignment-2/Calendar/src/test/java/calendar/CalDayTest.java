/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
  	Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    String string0 = appt0.toString();
    //CalDay calDay0 = new CalDay();

  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
