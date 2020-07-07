///
public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		AcademyMember m1=new AcademyStudent(1,"kim", "java");
		AcademyMember m2=new AcademyStudent(2,"lim", "javara");
		AcademyMember m3=new AcademyStudent(3,"him", "python");
		AcademyMember m4=new AcademyGangsa(4,"김소라", "디자인");
		AcademyMember m5=new AcademyGangsa(5,"김중라", "오피스");
		AcademyMember m6=new AcademyStaff(6,"정비사", "op");
		AcademyMember m7=new AcademyStaff(7,"hong", "marketing");
		/*
		 * member class로 student\gangsa\staff 객체를 생성
		 * 부모 클래스로 자식 객체를 생성 
		 */
		
		System.out.println("-------------------------------------");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		System.out.println();
		
		AcademyMember[] members=new AcademyMember[7];
		members[0]=m1;
		members[1]=m2;
		members[2]=m3;
		members[3]=m4;
		members[4]=m5;
		members[5]=m6;
		members[6]=m7;
		//7개의 객체를 담을 수 있는 배열 객체 생성
		
		System.out.println("---------AcademyMember print---------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
