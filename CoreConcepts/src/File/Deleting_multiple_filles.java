package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deleting_multiple_filles {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many File(s) do want to Delete ? ");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter the File Path : ");
			String path = sc.next();
			File file = new File(path);
			file.delete();
			System.out.println("File path: "+path+" Deleted successfully!!");
		}
	}
}