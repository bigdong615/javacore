package j2se.core.io.practise.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {
	private File file;
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader in;
	private PrintWriter out;

	public FileUtil(String FILENAME) throws IOException {
		file = new File(FILENAME);
		try {
			
			if (!file.exists()){
				
				file.getParentFile().mkdir();
				
				file.createNewFile();
			}
			
			in = new BufferedReader(new FileReader(file));
			out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readLine() {

		if (in != null) {

			try {
				return in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public void writeLine(String str) {

		if (out != null) {

			out.println(str);
		}
	}

	public void close() {

		if (in != null)
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (out != null)
			out.close();
	}
}
