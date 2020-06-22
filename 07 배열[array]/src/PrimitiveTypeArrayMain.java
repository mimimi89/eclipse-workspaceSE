/* 책 198페이지
 배열:  
      - 같은데이타형을 가진 기억장소여러개의 모음 
      - 배열변수의 선언형식
           데이타타입[] 이름(식별자); 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수(주소값)이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		
		int pi=34;
		//pi에는 정수값이 들어가고
		
		int[] ia=new int[5];
		//int 타입의 배열 객체
		ia[0]=11;
		ia[1]=22;
		ia[2]=33;
		ia[3]=44;
		ia[4]=55;
		
		//ia에는 주소값이 들어간다.
		//객체 생성을 위해 new 연산자 사용
		//new 연산자 뒤에는 생성자();
		//int[](인티자 배열타입의 템플릿)은 클래쓰가 존재하지 않기 때문에
		//[] 괄호 안에 멤버 변수의 개수를 기입한다.
		//멤버 변수에 접근하고 싶으면 도트 연산자, 배열 타입에서는 괄호
		
		System.out.println("-------------------------------------------------");
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		
		System.out.println("------------------for loop---------------------");
		System.out.println("배열의 크기: "+ia.length);
		for (int i = 0; i < ia.length; i++) {
			System.out.println(ia[i]);
		}

			
		System.out.println("--------------기본형 1차원 배열----------------");
		int[] korArray=new int[10];//괄호가 하나 있으면 1차원
		korArray[0]=80;
		korArray[1]=56;
		korArray[2]=78;
		korArray[3]=99;
		korArray[4]=88;
		korArray[5]=34;
		korArray[6]=78;
		korArray[7]=93;
		korArray[8]=12;
		korArray[9]=98;
		
		int korTot=0;
		
		for (int o = 0; o < korArray.length; o++) {
			korTot+=korArray[o];
			
		}
		
		System.out.println("반 전체 국어 총첨: "+korTot);

		
		System.out.println("반 전체 국어 평균: "+korTot/korArray.length);
		
		char[] ca=new char[6];
		ca[0]='H';
		ca[1]='E';
		ca[2]='L';
		ca[3]='L';
		ca[4]='O';
		ca[5]='!';
		
		for (int j = 0; j < ca.length; j++) {
			System.out.println(ca[j]);
		}
			
		System.out.println("--------------배열객체생성초기화--------------");
		int[] scoreArray= {56, 77, 23, 88, 92, 61, 93, 43, 57, 99};
		char[] gradeArray= {'A', 'B', 'F', 'D', 'B', 'C', 'A', 'A', 'F', 'B'};
		boolean[] marriedArray= {true, true, false, true, false, true, false, true, true, false};
		String[] nameArray= {"KIM", "LEE", "PARK", "CHOI", "SIM", "HONG", "KANG", "KWON", "JUNG", "HWANG"};
		for (int k = 0; k < scoreArray.length; k++) {
			System.out.printf("%10d %10c %10b %10s %n", 
					scoreArray[k], 
					gradeArray[k], 
					marriedArray[k], 
					nameArray[k] );
			
		}
		
		
			
		
		
		


	}

}
