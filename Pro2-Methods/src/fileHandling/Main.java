package fileHandling;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/* using SCANNER class
 * file is located under the project folder
 * displays all the value in the file
 */
public class Main {
public static void main(String[] args) {
	System.out.println("Welcome to file handling");
	String linedata;
	String [] Header;
	int noofrows=0;
	double opentot=0;
	double hightot=0;
	double lowtot=0;
	double closetot=0;
	double adjclosetot=0;
	double volumetot=0.0;
	File filedata=new File("CTSH.csv");
	System.out.println(filedata.getAbsolutePath());
	try {
		Scanner fileinput = new Scanner(filedata);
		while (fileinput.hasNext()) 
			{
				linedata=fileinput.nextLine();
				String[] data=linedata.split(",");
				if (data[0].equals("Date")){  //header row
					Header=data;
					System.out.println("---------------------------------------------------------------------------");
					System.out.println(Header[0]+"    | "+Header[1]+"    | "+Header[2]+"    | "+Header[3]+"    | "+Header[4]+"    | "+Header[5]+" | "+Header[6]);
					
				}
				else
				{
					noofrows++;
					opentot     +=Double.parseDouble(data[1]);
					hightot     +=Double.parseDouble(data[2]);
					lowtot      +=Double.parseDouble(data[3]);
					closetot    +=Double.parseDouble(data[4]);
					adjclosetot +=Double.parseDouble(data[5]);
					volumetot   +=Double.parseDouble(data[6]);
				}
				//System.out.println(data[1]);
			}
		fileinput.close();
		DecimalFormat df=new DecimalFormat("####,###,###.00");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("        |");
		System.out.print(df.format(opentot));
		System.out.print(" |");
		System.out.print(df.format(hightot));
		System.out.print(" |");
		System.out.print(df.format(lowtot));
		System.out.print("|");
		System.out.print(df.format(closetot));
		System.out.print("  |");
		System.out.print(df.format(adjclosetot));
		System.out.print("   |");		
		System.out.print(df.format(volumetot));
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("This file has "+noofrows+" detail rows");
		System.out.println("---------------------------------------------------------------------------");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("File has the following problem: "+e);
	}
		
}
}
