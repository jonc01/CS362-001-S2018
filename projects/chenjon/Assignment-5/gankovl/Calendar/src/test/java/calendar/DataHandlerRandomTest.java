package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
    }

    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
    }


    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 
		System.out.println("Start testing...");

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
