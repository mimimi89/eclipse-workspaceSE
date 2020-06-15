
public class WhileNested {

	public static void main(String[] args) {
		/*
		 * ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★★★ ☆☆☆☆☆
		 */

		System.out.print("★★★★★\n");
		System.out.println();

		System.out.println("★★★★★");
		System.out.println();

		System.out.println("1. -------------------------------------------------");
		//System.out.printf("%s[%d, %d]","★", i, j);
		
		/*
		★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
		★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
		★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
		★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
		★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
		 */
		
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[i=%d, j=%d]","★", i, j);
				j++;
			}
			System.out.println();

			i++;
		}
		
		System.out.println("2. -------------------------------------------------");
		/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		 
		☆[i=0, j=0]★[i=0, j=1]★[i=0, j=2]★[i=0, j=3]★[i=0, j=4]
		★[i=1, j=0]☆[i=1, j=1]★[i=1, j=2]★[i=1, j=3]★[i=1, j=4]
		★[i=2, j=0]★[i=2, j=1]☆[i=2, j=2]★[i=2, j=3]★[i=2, j=4]
		★[i=3, j=0]★[i=3, j=1]★[i=3, j=2]☆[i=3, j=3]★[i=3, j=4]
		★[i=4, j=0]★[i=4, j=1]★[i=4, j=2]★[i=4, j=3]☆[i=4, j=4]
		 */
		
		i=0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i!=j) {
					System.out.printf("★");
					
				}else {
					System.out.printf("☆");
					
				}
				j++;
			}
			System.out.println();
			
			i++;
		}
		System.out.println();
		System.out.println();
		
		System.out.println("-----------------숙  제----------------");
		System.out.println();
		System.out.println();
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i<=j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
					
				}
				j++;
				
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		 */
		
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("★");
					
				}
				j++;
				
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		
		
		/*
	    ★★★★★
	      ★★★★ 
	        ★★★ 
	          ★★ 
	            ★
	     */

		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(j>=i) {
					System.out.print("★");
				}else {
					System.out.print("  ");
					
				}
				j++;
				
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 ★★★★★
		 ★★★★
		 ★★★
		 ★★
		 ★
		 */
		
		/*
		★[i=0, j=0]★[i=0, j=1]★[i=0, j=2]★[i=0, j=3]★[i=0, j=4]
		★[i=1, j=0]★[i=1, j=1]★[i=1, j=2]★[i=1, j=3]
		★[i=2, j=0]★[i=2, j=1]★[i=2, j=2]
		★[i=3, j=0]★[i=3, j=1]
		★[i=4, j=0]
		 */
		
		//i가 0이면 별 5개
		//i가 1이면 별 4개
		//i가 2면 별 3개
		
		
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==0) {
					System.out.print("★");
				}else{
					System.out.print("  ");
					i++;
				}
				j++;
				
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println();
		System.out.println();
		

	}// main

}// class
