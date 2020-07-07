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
		FileOutputStream fos=new FileOutputStream("fileOut.txt");
		fos.write(65);
		fos.write(66);
		fos.close();
		
		
		
		
		
		

	}

}
