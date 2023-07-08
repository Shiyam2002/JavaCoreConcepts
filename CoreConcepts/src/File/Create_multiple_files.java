package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create_multiple_files  {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Files to create");
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println("Enter the "+i+" file path");
			String path = sc.next();
			File file = new File(path);
			if(file.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File Existing");
			}
		}
	}
}
