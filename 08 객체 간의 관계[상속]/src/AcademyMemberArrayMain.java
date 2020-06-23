
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students=new AcademyStudent[3];
		//academystudent 3명을 담을 수 있는 배열 객체 생성
		AcademyGangsa[] Gangsas=new AcademyGangsa[2];
		AcademyStaff[] Staffs=new AcademyStaff[2];
		
		
		students[0]=new AcademyStudent(1, "kim", "android");
		students[1]=new AcademyStudent(1, "jim", "ios");
		students[2]=new AcademyStudent(1, "dim", "linux");
		
		Gangsas[0]=new AcademyGangsa(4,"김강사", "아두이노");
		Gangsas[1]=new AcademyGangsa(5,"정강사", "오피스");
		
		Staffs[0]=new AcademyStaff(5, "lim", "총무부");
		Staffs[1]=new AcademyStaff(6, "him", "홍보부");
		
		
		System.out.println("----------AcademyMember 전체출력-------------");
		System.out.println();
		
		System.out.println("-------------student-------------");
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
		}

		System.out.println();
		
		System.out.println("-------------gangsa-------------");
		for (int i = 0; i < Gangsas.length; i++) {
			Gangsas[i].gansaPrint();
		}
		System.out.println();
		
		System.out.println("-------------staff-------------");
		for (int i = 0; i < Staffs.length; i++) {
			Staffs[i].staffPrint();
			
		}
		

	}

}
