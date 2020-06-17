
public class Switch {
				/*
				 switch문의 형식
			
			switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		    
				 */
	public static void main(String[] args) {
		//1~6 사이의 정수
						
		int level=4;
		String message="";
		
		switch(level) {
		case 1:
			message="입문";
			break;
			
		case 2:
			message="초급";
			break;
			
		case 3:
			message="초중급";
			break;
			
		case 4:
			message="중급";
			break;
			
		case 5:
			message="중고급";
			break;
			
		case 6:
			message="고급";
			break;
			
		default:
			//default 이행하지 않다
			message="level은 1~6 사이의 정수입니다.";
			break;
	
		}
		System.out.println(level+" --->> "+message);
		
				
		System.out.println();
		System.out.println("---------------홀수, 짝수 판별----------------");
		
		int num=23;
		
		switch(num%2) {
		case 0: 
			System.out.println(num+"은/는 짝수입니다.");
			break;
		case 1:
			System.out.println(num+"은/는 홀수입니다.");
			break;
			
		}
		
		System.out.println();
		System.out.println("---------------4의 배수 판별----------------");
		
		switch(num%4) {
		case 0: 
			System.out.println(num+"은/는 4의 배수임");
			break;
			
		default:
			System.out.println(num+"은/는 4의 배수가 아님");
			break;
			
		}
		
		System.out.println();
		System.out.println("-------------------문자비교--------------------");
		
		/*
		 * 문자비교 
		 * 
		 * A:LEFT 
		 * D:RIGHT 
		 * W:UP 
		 * X:DOWN 
		 * S:ROTATE
		 */
		
		char direction='D';
		
		switch(direction) {
		case 'A':
			System.out.println("LEFT로 이동");
			break;
		
		case 'D':
			System.out.println("RIGHT로 이동");
			break;
		
		case 'W':
			System.out.println("UP으로 이동");
			break;
			
		case 'X':
			System.out.println("DOWN으로 이동");
			break;
			
		case 'S':
			System.out.println("ROTATE로 이동");
			break;
		}
		
		/*
		 * 학생2명 기본데이타를 사용해서
		 *   총점 평균 평점계산후 대입
		 *   << 평점(A,B,C,D,F)계산시 switch 문을사용하세요 >>
		 */
		
		int avg1=;
		int avg2=;
	
		
		//사용한 변수 이름:level, message, num, direction,
		

	}//main

}//class
