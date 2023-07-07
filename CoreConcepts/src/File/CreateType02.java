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

/*
  -Package Name: java.io package
  -We use FileOutputStream class when we need to write some data into
   the created file.
  -It stores the data into bytes.
  -The FileOutputStream class provides a constructor to create a file.
  -The signature of the constructor is:
  		Parameters
		 name:   is the file name
		 append: if true, byte will be written to the end of the file, not in the beginning.
  */
