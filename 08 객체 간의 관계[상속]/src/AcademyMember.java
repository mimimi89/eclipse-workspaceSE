public class AcademyMember {		
	
	public int no;				//번호
	public String name;			//이름	/멤버변수
	
	public AcademyMember() {		//기본 생성자

	}

	public AcademyMember(int no, String name) {		//번호, 이름 포함한 생성자 메쏘드	
		this.no = no;
		this.name = name;
	
	}
	
	public void print() {
		System.out.print(no+"\t"+name+"\t");		//출력 메쏘드
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
