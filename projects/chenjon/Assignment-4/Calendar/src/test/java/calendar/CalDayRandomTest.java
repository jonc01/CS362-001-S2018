package calendar;


import org.junit.Test;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		
		System.out.println("Start testing...");
		Calendar cal1 = Calendar.getInstance();


		GregorianCalendar gCal1 = new GregorianCalendar(cal1.get(Calendar.MONTH), cal1.get(Calendar.DAY_OF_MONTH), cal1.get(Calendar.YEAR));
		CalDay calDay1 = new CalDay(gCal1);
		try{
			for (int iteration = 0; elapsed < TestTimeout; iteration++){
				long randomseed =System.currentTimeMillis();
				Random random = new Random(randomseed);

				int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				String title="Birthday Party";
				String description="This is my birthday party.";
				String emailAddress="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		        Appt appt = new Appt(startHour,
		                startMinute ,
		                startDay ,
		                startMonth ,
		                startYear ,
		                title,
		                description,
		                emailAddress);


				int startHour2=ValuesGenerator.getRandomIntBetween(random, -24, 24);
				int startMinute2=ValuesGenerator.getRandomIntBetween(random, -24, 24);
				int startDay2=ValuesGenerator.getRandomIntBetween(random, -24, 24);
				int startMonth2=ValuesGenerator.getRandomIntBetween(random, 0, 21);
				int startYear2=ValuesGenerator.getRandomIntBetween(random, 2000, 2030);
				String title2="Birthday Party";
				String description2="This is my birthday party.";
				String emailAddress2="xyz@gmail.com";

				Appt appt2 = new Appt(startHour2,
              	startMinute2 ,
                startDay2 ,
                startMonth2 ,
                startYear2 ,
                title2,
             	description2,
             	emailAddress2);
             	appt.setValid();
             	appt2.setValid();

             	elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			} 
	 	}catch(NullPointerException e){
		
		}

		System.out.println("Done testing...");

}
}
