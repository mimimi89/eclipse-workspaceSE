public class AcademyGangsa extends AcademyMember {

	public String subject;		//상속받은 변수 번호, 이름에 과목이 추가됨

	public AcademyGangsa() {		//기본 생성자
	
	}

	public AcademyGangsa(int no, String name, String subject) {		//번호, 이름, 과목을 포함하는 생성자 메쏘드
		this.no=no;
		this.name=name;
		this.subject = subject;
	}

	
	public void gansaPrint() {		//출력 메쏘드
		this.print();						//번호, 이름 출력 후
		System.out.println(subject);		//과목 출력
	}
	
	
	//getter, setter 메쏘드
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
}
