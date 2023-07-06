package File;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateType02 {
	public static void main(String[] args) {
		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file Name: ");
		String name = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(name,true);
		System.out.println("Enter file content: ");
		String str = new String();
		byte[] content = str.getBytes();
		fos.write(content);
		fos.close();
		System.out.println("file saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
