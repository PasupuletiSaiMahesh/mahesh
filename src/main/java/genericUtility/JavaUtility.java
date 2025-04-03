package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a an utility class which with java related functionalities
 */
public class JavaUtility 
{
	/**
	 * This is a generic method to generate random number for a given bound
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random random=new Random();
		int value=random.nextInt(bound);
		return value;
		
	}
	public String getCalenderDetails(String Pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf=new  SimpleDateFormat(Pattern);
		String value=sdf.format(date);
		return value;
		
		
		
	}

}
