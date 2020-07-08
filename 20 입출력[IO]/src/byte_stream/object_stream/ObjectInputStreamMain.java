package byte_stream.object_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream("objects.ser"));
		
		
		System.out.println("--------- objects.ser -->  String objects read---------");
		String msg1=(String)ois.readObject();
		System.out.println(msg1);

		
		System.out.println("--------- objects.ser -->  Integer objects read---------");
		Integer wi2=(Integer)ois.readObject();
		System.out.println(wi2);
		
		System.out.println("--------- objects.ser -->  Account objects read---------");
		Account account3=(Account)ois.readObject();
		account3.print();
		
		System.out.println("--------- objects.ser -->  Account objects read---------");
		Account account4=(Account)ois.readObject();
		account4.print();
		
		
		
	}

}
