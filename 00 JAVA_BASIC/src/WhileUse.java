
public class WhileUse {

	public static void main(String[] args) {
		//1~10 사이의 정수 출력
		int i=0;
		while(i<10) {
			int su = i+1;
			System.out.print(su+",");
			i++;
		}
		System.out.println();
		
		
		//1~10 사이의 정수 중 홀수만 출력
		int j=0;
		while(j<10) {
			int su = j;
			if(j%2==1) {
				System.out.print(su+",");
				
				}
			j++;
			}
		System.out.println();
		
		
		//1~10 사이의 정수 중 4의 배수만 출력
		int k=1;
		while(k<10) {
			int su = k;
			if(k%4==0) {
				System.out.print(su+",");
				
			}
			k++;
		}
		System.out.println();
		
		//1~100 사이의 정수 중 3과 4의 공배수만 출력
		int l=1;
		while(l<=100) {
			if(l%3==0 && l%4==0) 
			System.out.print(l+",");
			l++;
			
		}
		
		System.out.println();
		
		//quiz
		//1~2020년 사이의 연도 중 윤년만 출력
		
		int y=1;
		while(y<=2020) {
			
			if(y%4==0 && y%100!=0 || y%100==0)
			System.out.println(y+"년은 윤년입니다.");
			y++;
				
				
		}
		
		//1~100사이의 정수합
		int tot=0;
		int m=1;
		while(m<=100) {
			tot = tot+m;
			//연산 후 대입: tot +=m;
			//위와 동일
			m++;
		}
		System.out.println("1~100사이의 정수합: "+tot);
		
		
		//quiz 홀수합
		int oddtot=0;
		int n=1;
		while(n<=100) {
			if(n%2==1)
				oddtot = oddtot+n;
			//연산 후 대입: tot +=n;
			//위와 동일
			n++;
		
		}
		System.out.println("1~100사이의 홀수합: "+oddtot);
		
		
		//quiz 짝수합
		int eventot=0;
		int o=1;
		while(o<=100) {
			if(o%2==0)
				eventot = eventot+o;
			//연산 후 대입: tot +=n;
			//위와 동일
			o++;
			
		}
		System.out.println("1~100사이의 짝수합: "+eventot);
		
		//문자출력
		char c1='A';
		int count1=0;
		while(c1<='Z') {
			System.out.print(c1+" ");
			c1++;
			count1++;
			if(count1%5==0) {
				System.out.println();
				
			}
		}
		System.out.println();
		
		//숫자형 문자
		char c2='0';
		while(c2<='9') {
			System.out.print(c2+" ");
			c2++;
		}
		System.out.println();
		
		//한글 출력
		char c3='가';
		int count3=0;
		while(c3<='힣') {
			System.out.print(c3);
			c3++;
			count3++;
			if(count3%30==0) {
				System.out.println();
			}
			
		}
		System.out.println();
		
		
		
		

	}//main

}//class
