/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       선언과 대입; 조건; 증감
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		
		System.out.println("----------while-----------");
		int k=0;
		while(k<10) {
			System.out.println("k="+k);
			k++;
			
		}
		
		System.out.println();
		System.out.println("----------for i++ 증가-----------");
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
		}
		
		//주석 단축키
		//한 줄(단문) 주석: ctrl+/
		//여러 줄(장문) 주석: ctrl+shift+/
		
		
		System.out.println();
		System.out.println("----------for i-- 감소-----------");
		
		for (int i = 10; i > 0 ; i--) {
			System.out.println("i="+i);
		}
		
		System.out.println();
		System.out.println("----------홀수 출력[1~10]-----------");
		for (int i = 1; i <=10; i++) {
			if(i%2!=0) {
				System.out.printf("%d\t", i);
			}//if
		}//for
		
		System.out.println();
		System.out.println();
		System.out.println("------홀수 출력[1~10] continue------");
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				continue;
				//continue문 이후의 코드를 실행하지 않고 다음 반복 실행
				//break;와의 차이(최초, 최소공배수 구할 때)
				
				
			}else {
				System.out.printf("%d\t", i);
				
			}//else
		}//for
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------짝수 출력[1~10]-----------");
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				System.out.printf("%d\t", i);
			}//if
		}//for
		
		System.out.println();
		System.out.println();
		System.out.println("------------3과 4의 공배수------------");
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%4==0) {
				System.out.println("i="+i);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-------------3과 4의 최소공배수-----------");
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%4==0) {
				System.out.println("i="+i);
				break;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("----------홀수짝수합[1~100] 구하기----------");
		int tot=0;
		int eventot=0;
		int oddtot=0;
		for (int i = 1; i <=100; i++) {
			if(i%2==0) {
				eventot+=i;
			}else {
				oddtot+=i;
			}
			tot+=i;
		}
		System.out.println("홀수합="+oddtot);
		System.out.println("짝수합="+eventot);
		System.out.println("전체합="+tot);
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------문자 출력--------------------");
		for(char c='a';c<='z';c++) {
			System.out.print(c);
			if(c=='z') {
				System.out.println("//");
				continue;
				
							
			}
			System.out.printf("%s ", ",");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------문자 출력2------------------");
		for(char c='a';c<='z';c++) {
			System.out.print(c);
			if(c%4==0) {
				System.out.println();
				
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------문자 출력3------------------");
		for(int c='a', count=0;c<='z';c++) {
			System.out.print((char)c+" ");
			count++;
			if(c%4==0) {
				System.out.println();
				
			}
			
		}
		System.out.println();
		
		
		
	}//main

}//class
