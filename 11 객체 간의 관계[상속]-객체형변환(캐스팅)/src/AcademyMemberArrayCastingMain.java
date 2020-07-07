///
public class AcademyMemberArrayCastingMain {

	public static void main(String[] args) {
		
		AcademyMember[] members= {
			new AcademyStudent(1,"kim","java"),
			new AcademyStudent(2,"lim","kava"),	
			new AcademyStudent(3,"mim","lava"),	
			new AcademyGangsa(4,"fim","c"),
			new AcademyGangsa(5,"fim","c++"),	
			new AcademyStaff(6,"kang","marketing"),	
			new AcademyStaff(7,"king","ceo")
		};
		//7개 객체 담을 수 있는 배열 객체 생성
		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		//출력 작업
		System.out.println();
		
		
		
		System.out.println("--------학생의 반, 강사의 과목, 스태프의 부서----------");
		System.out.println();
		
		
		//instanceof 
		//형태: 참조변수 instanceof 클래스이름
		//반환: true or false
	
		
		System.out.println("-----학생만 출력------");
		for (int i = 0; i < members.length; i++) {
			//배열의 길이만큼 출력(0~6까지)
			if(members[i] instanceof AcademyStudent) {
				//배열 객체 내의 i가 AcademyStudent로 찍어낸 것이라면 true, 아니라면 false를 반환
				members[i].print();
				//"1	kim		java"의 형태로 출력
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				//학생 클래스로 임시 객체 하나 생성해서 members[i]의 값을 담아 놓는다.
				//members[i]은 멤버 클래스로 찍은 것이기에 형변환(캐스팅)
				String ban=tempStudent.getBan();
				//출력할 ban은 배열 객체 중 하나였던 members[i]로부터 반환된 값
				System.out.println(">>>반: "+ban+"반");
				
			}
		}
		System.out.println();
		
		System.out.println("-----강사만 출력------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				members[i].print();
				AcademyGangsa tempGangsa=(AcademyGangsa)members[i];
				String subject=tempGangsa.getSubject();
				System.out.println(">>>과목: "+subject);
				
			}
			
		}
		System.out.println();

	
		
		System.out.println("-----스태프만 출력------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				members[i].print();
				AcademyStaff tempStaff=(AcademyStaff)members[i];
				String depart=tempStaff.getDepart();
				System.out.println("부서: "+depart);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
