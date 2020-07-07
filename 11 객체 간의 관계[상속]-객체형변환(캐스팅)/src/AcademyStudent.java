///
public class AcademyStudent extends AcademyMember {
	
	
	public String ban;

	public AcademyStudent(String ban) {
		this.ban = ban;
	}

	public AcademyStudent(int no, String name, String ban) {
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
		this.ban = ban;
	}
	
	public void print() {
		super.print();
		System.out.println(ban);
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
	
	
	
	

}
