package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age=60;
		int charge;
		
		if(age<8) {
			charge=1000;
		}else if(age<14) {
			charge=2000;
		}else if(age<20) {
			charge=2500;
		}else if(age>=60) {
			charge=0;
		}else {
			charge=3000;
		}
		
		System.out.println("입장료는 "+charge+"원입니다.");
		
		int score=65;
		char grade;
		
		if(score>90&&score<=100) {
			grade='A';
		}else if(score>80&&score<=89) {
			grade='B';
		}else if(score>70&&score<=79) {
			grade='C';
		}else if(score>60&&score<=69) {
			grade='D';
		}else {
			grade='F';
		}
		
		System.out.println("학점은 "+grade+"입니다");

	}

}
