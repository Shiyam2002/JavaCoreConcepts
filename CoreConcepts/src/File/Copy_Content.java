package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copy_Content {
	public static void main(String[] args) throws IOException {
		System.out.println("Reading a File Content");
		System.out.println("This is the Content: ");
		FileReader file = new FileReader("C:\\Document\\Dummy1.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		String content = file.toString();
		System.out.println("Writing it to another File");
		FileWriter copy = new FileWriter("C:\\Document\\Dummy2.txt");
		copy.write(content);
		System.out.println("Done!!");	
	}
}