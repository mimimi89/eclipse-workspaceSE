
public class WhileGugudan {

	public static void main(String[] args) {
		
		

		
		int i = 0;
		while (i < 8) {
			int j = 0;
			while (j < 9) {
				int r = (i+2)*(j+1);
				System.out.printf("%d %s %d %s %d\t", i+2, "*", j+1, "=", r);
				j++;
			}//while2
			System.out.println();

			i++;
		}//while1

	
	}//main

}//class
