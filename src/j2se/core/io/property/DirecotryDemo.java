package j2se.core.io.property;

import java.io.File;

public class DirecotryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("src/j2se/core/io/property");
		if (dir.isDirectory()) {

			System.out.println(dir + "ÊÇ¸öÄ¿Â¼");
		}

		for (String s : dir.list()) {

			System.out.println(s);

		}

	}

}
