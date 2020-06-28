////********* 나중에 28항부터 다시 보기(이해가 안 됨)
public class AcademyMemberArrayCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcademyMember[] members= {
			new AcademyStudent(1,"kim","java"),
			new AcademyStudent(2,"lim","kava"),	
			new AcademyStudent(3,"mim","lava"),	
			new AcademyGangsa(4,"fim","c"),
			new AcademyGangsa(5,"fim","c++"),	
			new AcademyStaff(6,"kang","marketing"),	
			new AcademyStaff(7,"king","ceo")
		};
		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		//instanceof 
		//형태: 참조변수 instanceof 클래스이름
		//반환: true or false
		
		//AcademyMember am=new AcademyStudent();
		//boolean inStudentInstance=am instanceof AcademyStudent;
		
		System.out.println("--------학생의 반, 강사의 과목, 스태프의 부서----------");
		System.out.println("-----학생만 출력------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				String ban=tempStudent.getBan();
				System.out.println(">>>ban: "+ban);
			}
		}

	
		
		
		

	}

}
