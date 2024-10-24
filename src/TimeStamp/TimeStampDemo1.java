package TimeStamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampDemo1 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		SimpleDateFormat sDate = new SimpleDateFormat("YYYY MMM dd hh mm ss");
		String newDate = sDate.format(date);
		System.out.println(newDate);
	}

}
