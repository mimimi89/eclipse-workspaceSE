package util;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		//키보드 객체 생성
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			//thread가 String을 키보드로부터 입력받기 위해서 blocking
			System.out.print("이름을 입력하세요: ");
			String nameString=scanner.next();
			//System.out.println("입력한 이름: "+nameString);
			
			System.out.print("국어 점수를 입력하세요: ");
			int kor=scanner.nextInt();
			
			System.out.print("영어 점수를 입력하세요: ");
			int eng=scanner.nextInt();
			
			System.out.print("수학 점수를 입력하세요: ");
			int math=scanner.nextInt();
			int tot=kor+eng+math;
			double avg=tot/3.0;
		
			System.out.println(nameString+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
			System.out.println("계속할까요?(Y/N)");
			String yn=scanner.next();
			if(yn.equalsIgnoreCase("n")) {
				System.out.println("프로그램을 종료합니다.");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
