
public class Switch_case_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ranking=1;
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor='G';
				break;			// 조건을 만족하면 case문을 빠져나오도록 꼭 기재
				
		case 2: medalColor='S';
				break;
		
		case 3: medalColor='B';
				break;
				
		default:
				medalColor='A';
		
		
		}
		
		System.out.println(ranking+"등 메달 색깔은 "+medalColor+"입니다.");
		
		
		int month=6;
		int day=31;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31;
				break;
		case 4: case 6: case 9: case 11: day=30;
				break;
		case 2: day=28;
				break;
		
		}
		
		System.out.println(month+"월은 "+day+"일입니다.");
		
		String medal="Gold";
		
		switch(medal) {
		
		}
		

	}

}
