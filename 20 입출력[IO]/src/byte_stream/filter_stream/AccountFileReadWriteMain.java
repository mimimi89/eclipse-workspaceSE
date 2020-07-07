package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AccountFileReadWriteMain {

	public static void main(String[] args) throws Exception {
		Account account1=new Account(1111, "kim", 89000, 1.2);
		Account account2=new Account(2222, "two", 56000, 3.2);
		
		System.out.println("--------------- Account 객체 내용 파일에 쓰기 ----------------");
		DataOutputStream accountDos=
				new DataOutputStream(
						new FileOutputStream("account.dat"));
		accountDos.writeInt(account1.getNo());
		accountDos.writeUTF(account1.getOwner());
		accountDos.writeInt(account1.getBalance());
		accountDos.writeDouble(account1.getIyul());
		
		accountDos.writeInt(account2.getNo());
		accountDos.writeUTF(account2.getOwner());
		accountDos.writeInt(account2.getBalance());
		accountDos.writeDouble(account2.getIyul());
		
		accountDos.close();
		System.out.println(">>> write Account data --> account.data 파일");
		
		System.out.println("------------ Account 객체 내용 파일로부터 읽기 -------------");
		
		DataInputStream accountDis=
				new DataInputStream(
						new FileInputStream("account.dat"));
		
		Account readAccount1=
				new Account(accountDis.readInt(),
						accountDis.readUTF(),
						accountDis.readInt(),
						accountDis.readDouble());
		
		Account readAccount2=
				new Account(accountDis.readInt(),
						accountDis.readUTF(),
						accountDis.readInt(),
						accountDis.readDouble());
		
		readAccount1.print();
		readAccount2.print();
		
		accountDis.close();
		

	}

}
