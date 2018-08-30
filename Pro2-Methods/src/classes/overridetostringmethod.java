package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class overridetostringmethod {

	Date when;
    float pressure;
    float humidity;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		DateFormat df=new SimpleDateFormat("yyyy_MM_dd HH:mm:ss");
		
		return ("Data for: " + df.format(when)
	            + " Barometric Pressure: " 
	            + Float.toString(pressure) 
	            + " Humidity: " + Float.toString(humidity) );
	
		
	}
    
	
	
	
}
