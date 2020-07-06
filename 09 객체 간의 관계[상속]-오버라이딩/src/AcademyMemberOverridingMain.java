///

public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		
		AcademyStudent st1=new AcademyStudent(1, "kim", "linux");
		AcademyGangsa gs1=new AcademyGangsa(2, "lee", "office");
		AcademyStaff sf1=new AcademyStaff(3, "hong", "marketing");
		
		st1.print();
		gs1.print();
		sf1.print();
		
		
		
	}

}
