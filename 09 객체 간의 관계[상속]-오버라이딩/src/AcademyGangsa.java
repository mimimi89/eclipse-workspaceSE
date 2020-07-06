///
public class AcademyGangsa extends AcademyMember {
	//AcademyMember를 상속받는 AcademyGangsa

	//멤버필드
	public String subject;
	
	
	//디폴트 생성자 메쏘드
	public AcademyGangsa() {
	
	}

	public AcademyGangsa(int no, String name, String subject) {
		this.no=no;
		this.name=name;
		this.subject = subject;
	}
	
	//이전의 강사 클래스 출력 메쏘드
	/*
	public void gansaPrint() {		//출력 메쏘드
		this.print();						//번호, 이름 출력 후
		System.out.println(subject);		//과목 출력
	}
	 */
	
	//상속받은 출력 메쏘드를 재정의 해서 사용
	@Override
	public void print() {
		super.print();
		System.out.println(subject);
	}
	
	//getter, setter 메쏘드
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
}
