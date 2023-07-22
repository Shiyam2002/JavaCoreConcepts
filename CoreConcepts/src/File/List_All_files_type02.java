package File;

import java.io.File;

public class List_All_files_type02 {
	public static void main(String[] args) {
		  File directoryPath = new File("D:\\Document");
	      File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	         System.out.println("File path: "+file.getAbsolutePath());
	         System.out.println("Size :"+file.getTotalSpace());
	         System.out.println(" ");
	}
  }
}
