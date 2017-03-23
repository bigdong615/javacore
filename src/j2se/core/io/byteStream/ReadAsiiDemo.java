package j2se.core.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadAsiiDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("data/data.dat");
		
		FileInputStream input = new FileInputStream (file);
		
		FileOutputStream output = new FileOutputStream ("output.txt");
		
		int i;
		while ((i=input.read())!=-1){
			
			output.write(i);
		}
		
		}
	}


