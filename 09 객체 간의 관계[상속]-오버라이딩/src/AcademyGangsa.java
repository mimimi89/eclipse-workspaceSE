public class AcademyGangsa extends AcademyMember {

	public String subject;

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
	@Override
	public void print() {
		super.print();
		System.out.println(subject);
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
}
