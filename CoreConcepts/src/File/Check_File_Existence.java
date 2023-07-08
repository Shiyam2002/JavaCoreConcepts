package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Check_File_Existence {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File name or File path");
		String file_name = sc.next();
		File file = new File(file_name);
		boolean existence = file.exists();
		if(existence == true) {
			System.out.println("File Exists");
		}
		else {
			System.out.println("File doesn't Exists");
		}
		
	}
}
