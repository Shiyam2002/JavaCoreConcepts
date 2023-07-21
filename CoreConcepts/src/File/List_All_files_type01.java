package File;

import java.io.File;
import java.io.IOException;

public class List_All_files_type01 {

	public static void main(String[] args) throws IOException {
		File folder = new File("C:\\Document");
		String files[] = folder.list();
		System.out.println("List of All file in the Folder C:\\Document");
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}
	}
}
