package j2se.core.io.property;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫд����ļ���");
		String filename = scanner.nextLine();
		File file = new File(filename);
		Writer writer = new FileWriter(file);

		System.out.println("������Ҫд���ļ�������");
		while (true) {

			String content = scanner.nextLine();
			if (content.length() == 0)

				break;
			writer.write(content);
			writer.write("\r\n");

		}
		writer.flush();
		writer.close();

	}

}
