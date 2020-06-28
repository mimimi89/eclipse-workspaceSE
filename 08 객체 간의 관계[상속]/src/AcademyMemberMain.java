
public class AcademyMemberMain {

	public static void main(String[] args) {
		
		AcademyStudent st1=new AcademyStudent(1, "kim", "linux");
		//번호: 1, 이름: kim, 반: linux 를 인자로 가지고 있는 객체 st1
		AcademyGangsa gs1=new AcademyGangsa(2, "lee", "office");
		//번호: 2, 이름: lee, 과목: office를 인자로 가지고 있는 객체 gs1
		AcademyStaff sf1=new AcademyStaff(3, "hong", "marketing");
		//번호: 3, 이름: hong, 부서: marketing을 인자로 가지고 있는 객체 sf1
		
		st1.studentPrint();
		gs1.gansaPrint();
		sf1.staffPrint();
		sf1.print();
		
		
		
	}

}
