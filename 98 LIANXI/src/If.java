
public class If {

	public static void main(String[] args) {
		//윤년 여부 출력하기
		
			int year=2500;
			
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println(year+"년은 윤년입니다.");
				
			}else {
				System.out.println(year+"년은 평년입니다.");
			}
		

		//문자 판단
			
			char c='김';
			
			if(c>='가'&&c<='힣') {
				System.out.println(c+"은/는 한글입니다.");
			}
			
			if(c>='A'&&c<='Z') {
				System.out.println(c+"은/는 알파벳 대문자입니다.");
			}
			
			if(c>='a'&&c<='z') {
				System.out.println(c+"은/는 알파벳 소문자입니다.");
			}
			
			if(c>='0'&&c<='9') {
				System.out.println(c+"은/는 숫자형 문자입니다.");
				
			}
		
		//아이디의 첫글자로 유효한지, 유효성 판단 
		//(아이디의 첫글자는 알파벳 대문자이거나 소문자이다.)
			
			char id='%';
			
			if((id>='A'&&id<='Z')||(id>='a'&&id<='z')) {
				System.out.println(id+"은/는 아이디의 첫글자로 유효합니다.");
				
			}else {
				System.out.println(id+"은/는 아이디의 첫글자로 유효하지 않습니다.");
			}
		
		//if use
			System.out.println("stmt0");
			
			if(true) {
				System.out.println("stmt1-1");
			}else {
				System.out.println("stmt1-2");
			}
			
			boolean condition=false;
			
			if(condition) {
				System.out.println("stmt2-1");
			}else {
				System.out.println("stmt2-2");
			}
			
			System.out.println("--------------------------------------------------------");
			
			int x=30;
			int y=30;
			
			if(x>y) {
				System.out.println("stmt3-1:x>y");
			}else {
				System.out.println("stmt3-2:x<=y");
			}
			
			if(x<y) {
				System.out.println("stmt4-1:x<y");
			}
			
			if(x==y) {
				System.out.println("stmt5-1:x==y");
			}
			
			if(x!=y) {
				System.out.println("stmt6-1:x!=y");
			}
			
			if(x>20) {
				System.out.println("stmt7-1:x>20");
			}else {
				System.out.println("stmt7-2:x<=20");
			}
			
			System.out.println();
			System.out.println("------------------지역변수의 범위-----------------------");
			int a=90;
			
			if(true) {
				int b=80;
				System.out.println("a= "+a);
				System.out.println("b= "+b);
			}
			
			System.out.println();
			System.out.println("------------------짝수, 홀수 판별-----------------------");
			//짝수 even number, 홀수 odd number
			int num=3;
			
			if(num%2==0) {
				System.out.println(num+"은/는 짝수입니다.");
			}else {
				System.out.println(num+"은/는 홀수입니다.");
			}
			
			
			System.out.println();
			System.out.println("--------------------4의 배수 판별-----------------------");
			//배수 multiple
			int num2=12;
			
			if(num2%4==0) {
				System.out.println(num2+"은/는 4의 배수입니다.");
			}else {
				System.out.println(num2+"은/는 4의 배수가 아닙니다.");
				
			}
			
			
			System.out.println();
			System.out.println("-------------------3과 4의 공배수-----------------------");
			int num1=15;
			
			if(num1%3==0&&num1%4==0) {
				System.out.println(num1+"은/는 3과 4의 공배수입니다.");
				
			}else {
				System.out.println(num1+"은/는 3과 4의 공배수가 아닙니다.");
			}
			
			
			System.out.println();
			System.out.println("------------------점수의 유효성 체크--------------------");
			int korscore=90;
			
			if(korscore>=0||korscore<=100) {
				System.out.println("국어 점수 : "+korscore+"점은 유효한 점수입니다.");
			}else {
				System.out.println("국어 점수 : "+korscore+"점은 유효하지 않은 점수입니다.");
			}

			System.out.println();
			System.out.println("------------------학생 성적 관리--------------------");

	

	}

}
