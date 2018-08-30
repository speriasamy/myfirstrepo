package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*this program is going to take 2 input file 
 * and write the content of both into 3rd file
 */
public class Task1 {

	public static void witetofile(File file3, String linedata) {
		
		try {
			FileWriter filewrite3=new FileWriter(file3,true);
			BufferedWriter write=new BufferedWriter(filewrite3);
			write.write(linedata);
			write.newLine();
			write.flush();
			write.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my prgram");
		String filename1="C:/08 - Staples backup 2018/Java/Sasi-Java-Training-Eclipse/WS-Java/Pro2-Methods/Data/File1.txt";
		String filename2="C:/08 - Staples backup 2018/Java/Sasi-Java-Training-Eclipse/WS-Java/Pro2-Methods/Data/File2.txt";
		String filename3="C:/08 - Staples backup 2018/Java/Sasi-Java-Training-Eclipse/WS-Java/Pro2-Methods/Data/File3.txt";
		int file1count=0;
		int file2count=0;
		String linedata;
		File file1=new File(filename1);
		File file2=new File(filename2);
		File file3=new File(filename3);
			
		try {
			Scanner filescan1=new Scanner(file1);
			while(filescan1.hasNext()){
				linedata=filescan1.nextLine();
				witetofile(file3, linedata); //write line by line to file3
				file1count++;
			}
			System.out.println("numbe of rows in File1.txt is: "+file1count);
			filescan1.close();
		} catch (FileNotFoundException e) {
			System.out.println("File1.txt not found error"+e);
		} 
		try {
			Scanner filescan2=new Scanner(file2);
			while (filescan2.hasNext()) {
				String linedata2=filescan2.nextLine();
				witetofile(file3, linedata2); //write line by line to file3
				file2count++;
			}
			System.out.println("numbe of rows in File2.txt is: "+file2count);
			filescan2.close();
		} catch (FileNotFoundException e) {
			System.out.println("File2.txt not found error"+e);
		}
		System.out.println("numbe of rows in File3.txt is: "+(file1count+file2count));
	}
}
