import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMustKnowDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source = "data/data.dat";
		String desc = "data/out.dat";

		File sourceFile = new File(source);
		File descFile = new File(desc);

		if (!descFile.getParentFile().exists()) {

			System.out.println("dir didn't exist, create one ");

			descFile.getParentFile().mkdir();
		}

		System.out.println("start copying...");

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				sourceFile));
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream(descFile));

		byte[] bytes = new byte[4096];

		int len = -1;

		while ((len = in.read(bytes, 0, bytes.length)) != -1) {

			out.write(bytes, 0, len);

		}

		System.out.println("Copy Done !");

		in.close();
		out.close();
	}

}
