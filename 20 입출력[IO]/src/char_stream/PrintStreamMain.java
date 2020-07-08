package char_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {

		PrintStream ps=new PrintStream(
				new FileOutputStream("print.txt"));
		
		ps.write('A');
		ps.write(65);
		
		ps.print(65);
		ps.write('6');
		ps.write('5');
		
		ps.println();
		ps.print(true);
		ps.println();
		ps.print(12345678);
		ps.println();
		ps.print("문자열");
		ps.println();
		ps.print(3.14159);
		ps.println();
		ps.print("3.14159");

		
		
		ps.flush();
		ps.close();
		System.out.println("-----print------");
		
		
		
	}

}
