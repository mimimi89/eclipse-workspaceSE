package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore=150;

		int lastScore=gameScore++;
		System.out.println(lastScore);
		
		int lastScore2=gameScore--;
		System.out.println(lastScore2);
	}

}
