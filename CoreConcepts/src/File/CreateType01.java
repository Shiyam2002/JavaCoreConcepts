package File;

import java.io.File;
import java.io.IOException;

public class CreateType01 {

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

/*
  -Package Name : java.io.File;
  -Doesn't accept any argument
  -create new empty file
  
  -This method returns a boolean value: true if the file was successfully
   created, and false if the file already exists
   
  -Note that the method is enclosed in a try...catch block.
   This is necessary because it throws an IOException if an error occurs.It also
   throws SecurityException if a security manager exists and its SecurityManager.
   checkWriter(java.lang.String) method denies write access to the file.
   
  -We can pass the file name or absolute path or relative path as an argument
   in the File class object. For a non-absolute path, File object tries to locate
   the file in the current directory.
   
  -To create a file in a specific directory (requires permission), 
   specify the path of the file and use double backslashes to escape the "\"
   character (for Windows). On Mac and Linux you can just write the path,
   like: /Users/name/filename.txt
 */