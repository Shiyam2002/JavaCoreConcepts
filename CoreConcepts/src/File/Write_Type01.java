package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Type01 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Desktop\\dummy.txt");
		FileWriter fwrite = new FileWriter(file);
		fwrite.write("Hi! These programs are usful");
		System.out.println("File created Successfully");
		fwrite.close();
	}

}
