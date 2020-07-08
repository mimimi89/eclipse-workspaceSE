package char_stream;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception{

		FileWriter fw=new FileWriter("fileWriter.txt");
		fw.write(44457);
		fw.write('김');
		
		
		
		fw.flush();
		fw.close();
		
		
		System.out.println("-----FileWriter.write-----");
		
		
		
		
	}

}
