package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int rangking=1;
		char medalColor;
		/*
		 * if-else if문을 사용할 때,
		 
				if(rangking==1) {
					medalColor='G';
					
				}else if(rangking==2) {
					medalColor='S';
					
				}else if(rangking==3) {
					medalColor='B';
					
				}else{
					medalColor='A';
					
				}
				System.out.println(rangking+"등의 메달 색깔은 "+medalColor+"입니다.");
		 */
		
		/*
		 * switch-case문을 사용할 때,
		 */
		switch(rangking) {
			case 1: medalColor='G';
					break;
			case 2: medalColor='S';
					break;
			case 3: medalColor='B';
					break;
			default: 
					medalColor='A';
		}
		
		System.out.println(rangking+"등의 메달 색깔은 "+medalColor+"입니다.");
		
	}

}
