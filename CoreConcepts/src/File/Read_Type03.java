package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_Type03 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\document\\dummy.txt");
		BufferedReader read = new BufferedReader( new FileReader(file));
		String value;
		while((value = read.readLine())!= null) {
			System.out.println(value);
		}
	}

}
