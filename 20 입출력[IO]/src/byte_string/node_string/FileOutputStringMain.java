package byte_string.node_string;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1. 데이타의 목적지(target) 선정(파일)
 * 2. 출력스트림(OutputStream) 객체 생성(FileOutputStream)
 * 3. 출력스트림(OutputStream)에 1바이트씩 쓴다.(write)   
 * 4. 출력스트림(OutputStream)을 닫는다.(close)
 */
public class FileOutputStringMain {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fileOut.dat");
		
		/*
		 * <<OutputStream>>
		 * public abstract void write(int b) throws IOException
		  	- Writes the specified byte to this output stream. 
		  	- The general contract for write is 
		  	that one byte is written to the output stream. 
		  	- The byte to be written is the eight low-order bits of the argument b. 
		 */
		
		fos.write(65);
		// 00000000|00000000|00000000|01000001
		fos.write(66);
		// 00000000|00000000|00000000|01000010
		
		fos.write(2147483647);
		// 01111111|11111111|11111111|11111111
		fos.write(255);
		// 00000000|00000000|00000000|11111111
		//앞의 3바이트는 날라감
		

		fos.write('C');
		fos.write('D');
		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}
		
		
		fos.close();
		System.out.println("FileOutputStream.write!!!");
		
		
		
		
		

	}

}
