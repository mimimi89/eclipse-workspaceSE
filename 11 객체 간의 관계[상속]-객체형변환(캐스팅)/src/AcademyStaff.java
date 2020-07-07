///
public class AcademyStaff extends AcademyMember {
	
	
	
	public String depart;
	
	public AcademyStaff() {
		
	}
	public AcademyStaff(int no, String name, String depart) {
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
		this.depart=depart;
		
	}
	
	public void print() {
		super.print();
		System.out.println(depart);
		
	}
	
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
