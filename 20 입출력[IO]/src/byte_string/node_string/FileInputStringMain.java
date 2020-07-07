package byte_string.node_string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 1. 데이타의 source 선정(파일)
 * 2. 입력스트림(InputStream) 객체 생성(FileInputStream)
 * 3. 입력스트림(InputStream)에 1바이트씩 읽는다.(read)   
 * 4. 입력스트림(InputStream)을 닫는다.(close)
 */
public class FileInputStringMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fileOut.dat");
		
		int readByte=fis.read();
		System.out.println("1.byte: "+Integer.toBinaryString(readByte));
		//System.out.println("1.byte: "+readByte);
		
		readByte=fis.read();
		System.out.println("2.byte: "+Integer.toBinaryString(readByte));
		
		
		fis.close();
		
		
		
		
		

	}

}
