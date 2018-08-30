package classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*This program is to show how to customize the tostring() method.
 * 
 */
public class MainToString {
	public static void main(String[] args) throws ParseException {
		System.out.println("Welcome to my program");
		DateFormat dformat=new SimpleDateFormat("yyyy_MM_dd HH:mm:ss");
		overridetostringmethod ov=new overridetostringmethod();
		ov.when = dformat.parse("2012_01_01 00:02:14");
		ov.humidity=Float.parseFloat("74.20");
		ov.pressure=Float.parseFloat("30.50");
		//System.out.println(ov.when);
		//System.out.println(dformat.parse("2012_01_01 00:02:14"));
		//System.out.println(ov.when);
		//System.out.println(dformat.format(ov.when));
		System.out.println(ov);
		           
				
	}

}

