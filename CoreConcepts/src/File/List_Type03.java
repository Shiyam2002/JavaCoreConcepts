package File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class List_Type03 {
	public static void main(String[] args) throws IOException {
		File file  = new File("C:\\Document");
		FilenameFilter txtnameFilter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				String lowercasefile = name.toLowerCase();
				if(lowercasefile.endsWith(".txt")) {
					return true;
				}
				else {
					return false;
				}
			}
		};
		String filelist[] = file.list(txtnameFilter);
		System.out.println("List of the text files in the specified directory:");
		for(String files: filelist) {
			System.out.println(files);
		}
	}
}
