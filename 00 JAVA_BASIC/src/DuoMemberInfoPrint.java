
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		
		String name, number1, number2, sex;
		int id, marriage;
		boolean smoke;
		
		name = "홍길동";
		number1 = "201212";
		number2 = "3495039";
		sex = "male";
		
		id = 181818;
		marriage = 0;
		
		smoke = true;
		
		System.out.println("********************");
		System.out.println("회원번호 : "+id);
		System.out.println("이    름 : "+name);
		System.out.println("주민번호 : "+number1+"-"+number2);
		System.out.println("성    별 : "+sex);
		System.out.println("결혼횟수 : "+marriage);
		System.out.println("흡연여부 : "+smoke);
		System.out.println("********************");

		
	}

}
