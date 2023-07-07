package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateType03 {
	
	public static void main(String[] args) {
		Path path = Paths.get("c:\\demo\\dummy.txt");
		try {
			Path p = Files.createFile(path);
			System.out.println("File Create at the Path :"+path);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

	/* 
	 -Package Name: java.nio
	 -The nio package is buffer-oriented.
	 -The createFile() method is also used to create a new, empty file.
	 -We don't need to close the resources when using this method.
	 -We create a Path instance using a static method in the Paths 
	  class (java.nio.file.Paths) named Paths.get().
	 -The method returns the file. 
	 */