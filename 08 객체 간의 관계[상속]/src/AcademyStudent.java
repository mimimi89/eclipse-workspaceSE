public class AcademyStudent extends AcademyMember {	//아카데미 멤버 클래스를 상속받는 아카데미 학생 클래스
	
	
	public String ban;			// 상속받은 변수 번호, 이름에  반 추가됨

	public AcademyStudent(String ban) {	//기본 생성자
		this.ban = ban;
	}

	public AcademyStudent(int no, String name, String ban) {	//번호, 이름, 반 포함하는 생성자 메쏘드
		this.no=no;
		this.name=name;
		this.ban = ban;
	}
	
	public void studentPrint() {		//출력 메쏘드
		this.print();					//번호, 이름이 출력되는 상속받은 메쏘드
		System.out.println(ban);		//반 출력
	}
	
	//getter, setter 메쏘드
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
	
	
	
	

}
