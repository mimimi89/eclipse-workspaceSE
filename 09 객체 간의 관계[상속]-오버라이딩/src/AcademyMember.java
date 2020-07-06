///
public class AcademyMember {
	
	//멤버필드
	public int no;
	public String name;
	
	//생성자 메쏘드
	public AcademyMember() {

	}

	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	
	}
	
	//출력 메쏘드
	public void print() {
		System.out.print(no+"\t"+name+"\t");
	}

	//getter, setter 메쏘드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
