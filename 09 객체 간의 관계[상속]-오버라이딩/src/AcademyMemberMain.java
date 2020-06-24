
public class AcademyMemberMain {

	public static void main(String[] args) {
		
		AcademyStudent st1=new AcademyStudent(1, "kim", "linux");
		AcademyGangsa gs1=new AcademyGangsa(2, "lee", "office");
		AcademyStaff sf1=new AcademyStaff(3, "hong", "marketing");
		
		st1.studentPrint();
		gs1.gansaPrint();
		sf1.staffPrint();
		sf1.print();
		
		
		
	}

}
