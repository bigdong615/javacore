package j2se.core.io.byteStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStreamDemo {

	private static final String FILENAME = "data/data.dat";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	private static void writeToFile(Person[] persons) {
		// TODO Auto-generated method stub

	}

	private static Person[] readFromFile() throws IOException {

		File file = new File(FILENAME);

		DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream(file)));

		List<Person> list = new ArrayList<Person>();

		while (true) {
			Person p = new Person(null, 0, false);
			p.name = in.readUTF();
			p.age = in.readInt();
			p.sex = in.readBoolean();
			list.add(p);
		}

	}
}
