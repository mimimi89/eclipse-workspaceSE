package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamMain {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("bufferedOut.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		for (int i = 0; i < 256; i++) {
			bos.write(i);
		}
		
		bos.flush(); //기존의 다 차지 않은 버퍼를 비워주는 메소드 
		bos.close();
		System.out.println("write bufferedOut.txt --> write");
		
		
		BufferedInputStream bis=
				new BufferedInputStream(
						new FileInputStream("BufferedOut.txt"));
		
		while(true) {
			int readByte=bis.read();
			if(readByte==-1)break;
			System.out.println((char)readByte);
		}
		
		bis.close();
		System.out.println("BufferedOut.txt --> read");
		
		

	}

}
