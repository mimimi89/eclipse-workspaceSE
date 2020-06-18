
public class LocalVariableInitialization {
	
	private int no;
	private String name;
	
	public LocalVariableInitialization() {
		
	}

	public LocalVariableInitialization(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public void print() {
		System.out.println(">>"+this.no+"\t"+this.name);
	}

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
