package j2se.core.io.byteStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class CharsetDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		error("txt/utf8.txt");
		System.out.println("--------------------");
		right("txt/gbk.txt", "GBK");

	}

	private static void right(String filepath, String charset)
			throws IOException {
		File file = new File(filepath);
		InputStreamReader input = new InputStreamReader(
				new BufferedInputStream(new FileInputStream(file)), charset);
		
	
		char[] array = new char[100];
		int i;

		while ((i = input.read(array)) != -1) {

			for (int j = 0; j < i; j++)
				System.out.print(array[j]);
		}
	}

	private static void error(String filepath) throws IOException {
		File file = new File(filepath);
		BufferedInputStream input = new BufferedInputStream(
				new FileInputStream(file));

		int i;

		while ((i = input.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
