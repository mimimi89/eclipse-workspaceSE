
public class While {

	public static void main(String[] args) {
		
		
		System.out.println("---------------------논리형리터럴----------------------------");
		
		int i=0;
		
		while(true) {
			System.out.println("stmt2: "+i);
			i++;
			if(i==10) {
				break;
			}
			
			
		}
		
		System.out.println("---------------------논리형 변수----------------------------");
		
		boolean condition=true;
		int j=0;
		
		while(condition) {
			System.out.println("stmt3: "+j);
			j++;
			if(j==10) {
				condition=false;
				
			}
			
		}
		
		System.out.println("----------------------비교 연산---------------------------");
		
		int k=0;
		
		while(k<10) {
			System.out.println("stmt1: "+k);
			k++;
			
		}
		
		System.out.println("--------------------1-10 사이의 정수 출력--------------------------");
		
		int n=0;
		
		while(n<10) {
			int number=n+1;
			System.out.println(number);
			n++;
		}
		
		
		System.out.println("--------------------1-10 사이의 홀수 출력--------------------");
		
		int m=0;
		
		while(m<10) {
			int number=m+1;
			if(number%2!=0) {
				System.out.println(number);
			}
			m++;
		}
		
		System.out.println("---------------------1-10 사이의 짝수 출력-------------------");
		
		int b=0;
		
		while(b<10) {
			int number=b+1;
			if(number%2==0) {
				System.out.println(number);
			}
			b++;
		}
		
		System.out.println("----------------1-10 사이의 4의 배수 출력-------------------");
		
		int z=0;
		
		while(z<10) {
			int number=z+1;
			if(number%4==0) {
				System.out.println(number);
			}
			z++;
			
		}
		
		System.out.println("----------------1-2020 사이의 윤년 출력-------------------");
		int y=0;
		
		while(y<2020) {
			int leapYear=y+1;
			if((leapYear%4==0) && (leapYear%100!=0) || (leapYear%400==0)) {
				System.out.println(leapYear);
			}
			y++;
			
		}
		
		System.out.println("----------------1-100 사이의 정수합 출력-------------------");
		int tot=0;
		int oddtot=0;
		int eventot=0;
		
		int a=1;
		
		while(a<=100) {
			tot=tot+a;
			
			
		}
		System.out.println("1-100 사이의 정수합 출력=>"+tot);
		
		System.out.println("----------------1-100 사이의 홀수합 출력-------------------");
		
		int o=1;
		
		while(o<=100) {
			if(o%2!=0) {
				oddtot +=o;
			
			}else {
				eventot +=o;
			}
			
			o++;
			
		}
		System.out.println("1-100 사이의 홀수합 출력=>"+oddtot);
		System.out.println("1-100 사이의 짝수합 출력=>"+eventot);
		
		
		
	
	//사용한 변수: i, j, k, n, m, b, z, y, a, condition, tot, oddtot, eventot, 
		
		
		
		
		
	}//main

}//class
