package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import File.CreateType01;

public class Deleting_file {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Does the file you gonna delete exist ?");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the File path to delete : ");
			String path = sc.next();
			File file = new File(path);
			file.delete();
			System.out.println("File Deleted!!");
		}
		else 
		{
			System.out.println("Create a file");
			File file2 = CreateType01.main(null);
			file2.delete();
			
		}
	}

}
