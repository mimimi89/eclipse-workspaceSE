public class AcademyStudent extends AcademyMember {
	
	
	public String ban;

	public AcademyStudent(String ban) {
		this.ban = ban;
	}

	public AcademyStudent(int no, String name, String ban) {
		this.no=no;
		this.name=name;
		this.ban = ban;
	}
	
	//이전 학생 클래스의 출력메쏘드
	/*
	 public void studentPrint() {		//출력 메쏘드
		this.print();					//번호, 이름이 출력되는 상속받은 메쏘드
		System.out.println(ban);		//반 출력
	}
	 */
	//상속받은 출력메쏘드를 재정의 
	@Override
	public void print() {
		super.print();				//부모클래스의 출력메쏘드에
		System.out.println(ban);	//반을 추가
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
	
	
	
	

}
