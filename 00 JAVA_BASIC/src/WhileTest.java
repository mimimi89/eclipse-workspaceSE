
public class WhileTest {
				//반복문
	/*
	반복문
	     stmt1;
	     while(조건문){
			 //조건문--> 논리형데이타를 반환하는 식, 논리형 변수, 논리형리터럴
			stmt2;
		 }
		 stmt3;
	     
		 흐름  
		 stmt1 -->조건식의 데이타가 true인 동안 stmt2를 반복 실행--> stmt3
		 stmt1 -->조건식의 데이타가 false가 되면 stmt2를 실행하지 않음--> stmt3
	*/
	
	public static void main(String[] args) {
		System.out.println("stmt1");
		System.out.println("1.----------논리형리터럴----------");
		int k=0;
		while(true){
			System.out.println("stmt2: "+k);
			k++;
			if(k==3) {
				break;//반복루프를 빠져나갈 수 있다
				//break은 switch문과 반복문에서만 사용가능
			
			}
			
		}
		
		System.out.println("2.----------논리형 변수----------");
		boolean condition=true;
		int i=0;//반복첨자는 통상 0부터 시작
		//10번 실행되고 끝나게 하려면
		while (condition) {
			System.out.println("stmt3: "+i);
			i++;
			if(i==5) {
				condition=false;
			}
		}
		System.out.println("3.------------비교연산-------------");
		int j=0;
		while(j<10) {
			System.out.println("stmt4: "+j);
			j++;
			
		}
		
		
	}//end main

}//end class
