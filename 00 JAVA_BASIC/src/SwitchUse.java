
public class SwitchUse {

	public static void main(String[] args) {
		// 홀수, 짝수 판별
		
		int number = 23;
		
		switch (number%2) {
		case 0:
			System.out.println(number+"은/는 짝수입니다.");
			break;
		case 1:
			System.out.println(number+"은/는 홀수입니다.");
			break;
		}

		// 4의 배수 판별
		
		int number2 = 41;
		
		switch (number2/4) {
		case 0:
			System.out.println(number2+"은/는 4의 배수입니다.");
			break;
		default:
			System.out.println(number2+"은/는 4의 배수가 아닙니다.");
			break;
			
		}
		
		//문자비교
		//A:left, D:right, W:up, X:douwn, S:rotate
		
		char direction='D';
		
		switch (direction) {
		case 'A':
			System.out.println("left(왼쪽)(으)로 이동");
			break;
		case 'D':
			System.out.println("right(오른쪽)(으)로 이동");
			break;
		case 'W':
			System.out.println("up(위)(으)로 이동");
			break;
		case 'X':
			System.out.println("down(아래)(으)로 이동");
			break;
		case 'S':
			System.out.println("rotate(으)로 이동");
			break;

		}
		
		

	}

}
