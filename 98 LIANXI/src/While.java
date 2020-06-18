
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
		
		
	
	
	//사용한 변수: i, j, k, condition,
		
		
		
		
		
	}//main

}//class
