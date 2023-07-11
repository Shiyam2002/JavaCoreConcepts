package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write_Type02  {
	public static void main(String[] args) throws IOException {
		String value = "Welcome to the place where you can learn about File Handling";
		Path file = Path.of("C:\\Document\\dum.txt");
		Files.writeString(file, value);
		String readerfile = Files.readString(file);
		System.out.println(readerfile);
	}
}