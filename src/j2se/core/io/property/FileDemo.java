package j2se.core.io.property;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(File.separator);

		System.out.println(System.getProperty("file.separator"));

		File file = new File("src/j2se/core/io/property/FileDemo.java");
		if (file.isFile()) {
			System.out.println(file + "是文件");

			deleteFile("newfile.txt");
		}

	}

	private static void deleteFile(String string) {
		// TODO Auto-generated method stub
		File file = new File(string);
		if (file.exists())

			System.out.println("文件存在");

		else
			System.out.println("文件不存在");

		file.delete();

	}
}
