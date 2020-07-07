///
public class AcademyGangsa extends AcademyMember {

	public String subject;

	public AcademyGangsa() {
	
	}

	public AcademyGangsa(int no, String name, String subject) {
		//상속받았으나 private member에는 접근 불가
		//this.no=no;
		//this.name=name;
		/*
		상속받은 public method를 통한 접근은 가능
		this.setNo(no);
		this.setName(name);
		 */
		//혹은 super 사용
		super(no, name);
		this.subject = subject;
	}

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
