package j2se.core.io.byteStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dir =  System.getProperty("user.dir");
		File file = new File(dir + "/src/j2se/core/io/byteStream/BufferedDemo.java");
		
		BufferedReader reader = new BufferedReader(new  FileReader(file));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
		
		int i;
		
		while((i=reader.read())!=-1){
			
			writer.write(i);
			
		}
		
		/*String line ;
		
		while ((line=reader.readLine())!=null){
			
			writer.write(line);
			writer.write("\r\n");
		}*/
		
		try {
			writer.flush();
			writer.close();
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
