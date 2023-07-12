package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_Type01 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Document\\Dummy.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}	
	}
}