package madhur.thoughtworks.ctm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
	
	private Calendar cal;
	private final String format = "HH:mma";
	private SimpleDateFormat sdf = new SimpleDateFormat(format);
	
	public Time(String timeStr) {
		
		Date date;
		//parse(timeStr);
		
		this.cal = new GregorianCalendar();
		try {
			date = sdf.parse(timeStr);
			cal.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	public Time(Time time) {
		this.cal = (Calendar) time.cal.clone();
	}
	
	public Time incrementMinutesBy(int min) {
		this.cal.add(Calendar.MINUTE, min);
		return this;
	}
	
	public Time incrementHoursBy(int hour) {
		this.cal.add(Calendar.HOUR, hour);
		return this;
	}
	
	@Override
	public String toString() {
		return sdf.format(cal.getTime());
	}
	
	
	
}
