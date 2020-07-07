package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 실행시 외부로부터 인자를 받아서 실행
		 * >java FileCopy <file_name>
		 */
		
		/*
		if(args.length==0) {
			System.out.println("Usage: java FileCopyMain <file_name>");
			return;
		}
		String fileName=args[0];
		String copyFileName="";
		
		int dotIndex = fileName.indexOf(".");
		String fileExt = fileName.substring(dotIndex);
		String fileNameNoExt = fileName.substring(0,dotIndex);
		copyFileName=fileNameNoExt+"_copy"+fileExt;
		System.out.println("fileNameNoExt:"+fileNameNoExt);
		System.out.println("fileExt:"+fileExt);
		System.out.println("copyFileName:"+copyFileName);
		*/
		String fileName="lee.png";
		String copyFileName="lee_copy.png";
		
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(copyFileName);
		
		while (true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			fos.write(readByte);
		}
		
		System.out.println(">>>> FileCopy");
		
	}

}
