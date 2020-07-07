package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		DataOutputStream dos=
				new DataOutputStream(
						new FileOutputStream("dataOut.txt"));
		
		int intData=2147483647;
		/*
		dos.write(intData>>24);
		dos.write(intData>>16);
		dos.write(intData>>8);
		dos.write(intData);
		*/
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeDouble(3.14);
		dos.writeBoolean(true);
		dos.writeChar('가');
		/*
		 *문자열을 UTF-8 형식으로 write 
		 */
		dos.writeUTF("오늘은 자바 입출력을 합니다.");
		dos.writeUTF("♬어려워요!!");
		dos.close();
		System.out.println("DataOutputStream ---> writeXXX()");
		
		System.out.println("DataInputStream  ---> readXXX()");
		DataInputStream dis=
				new DataInputStream(
						new FileInputStream("dataOut.txt"));
		int readInt=dis.readInt();
		System.out.println("int: "+readInt);
		System.out.println("Byte: "+dis.readByte());
		System.out.println("Double: "+dis.readDouble());
		System.out.println("Boolean: "+dis.readBoolean());
		System.out.println("Char: "+dis.readChar());
		System.out.println("UTF: "+dis.readUTF());
		System.out.println("UTF: "+dis.readUTF());
		
		
		dis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
