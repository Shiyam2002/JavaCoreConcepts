package File;

import java.io.FileReader;
import java.io.IOException;

public class Read_Type02 {
	  public static void main(String[] args) throws IOException {
	    FileReader file = new FileReader("C:\\Document\\Dummy.txt");
	    int i;
	    while((i=file.read()) != -1) {
	    	System.out.println((char)i );
	    }
	}
}
