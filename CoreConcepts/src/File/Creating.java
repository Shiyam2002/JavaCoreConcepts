package File;

import java.io.File;
import java.io.IOException;

public class Creating {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ramya\\Desktop\\shiyam\\dummy");
		if(file.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("File Existings");
		}
	}

}