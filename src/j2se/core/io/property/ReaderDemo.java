package j2se.core.io.property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("src/j2se/core/io/property/Environment.java");
		Reader reader = new FileReader(file);

		int i = reader.read();
		System.out.println(i + " " + (char) i);

		char[] array = new char[200];
		while (true) {
			i = reader.read(array);
			if (i == -1)
				break;
			for (int j = 0; j < i; j++)
				System.out.println(array[j]);

		}
		reader.close();
	}

}
