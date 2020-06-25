///
public class LocalVariableInitialization {
	//멤버필드
	private int no;
	private String name;
	//생성자
	public LocalVariableInitialization() {
		
	}

	public LocalVariableInitialization(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	//인스턴스메쏘드
	public void print() {	//출력메쏘드
		System.out.println(">>"+this.no+"\t"+this.name);
	}
	//setter, getter 메쏘드
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
