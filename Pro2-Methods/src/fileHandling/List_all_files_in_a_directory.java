package fileHandling;

import java.io.File;
import java.util.Scanner;

public class List_all_files_in_a_directory {

	public static void main(String[]args) {
		//String filename;
		String dirname;
		System.out.println("welcome");
		Scanner input=new Scanner(System.in);
		//System.out.print("Enter filename: ");
		//filename=input.nextLine();
		System.out.print("Enter directory to search in: ");
		dirname=input.nextLine();
		input.close();
		//System.out.println(dirname);
		File f=new File(dirname);
		//System.out.println("is this a directory? "+f.isDirectory());
		String[] fileinfo=f.list();// store it in string array
		for (int i=0;i<fileinfo.length;i++) {
			System.out.println(fileinfo[i]);	
		}
		search(f);
				
		
				
	}//end of main
	
	public static void search(File f1) {
		File[] filearray=f1.listFiles();//store it in File array
		for (File ft: filearray) {
			System.out.println(ft);//path+name
			//System.out.println(ft.getParentFile());//path
			//System.out.print("          "+ft.getName());//just the name
			if (ft.isDirectory()) {
				search(ft);
			}
		}
	}
}//end of class
