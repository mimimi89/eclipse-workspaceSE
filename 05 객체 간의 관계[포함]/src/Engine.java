/// 
public class Engine {
	
	//멤버필드
	private String type;	//엔진 타입
	private int cc;			//엔진 배기량
	
	//생성자 메쏘드
	public Engine() {		//기본 생성자
		
	}
	
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	//인스턴스 메쏘드
	public void print(){	//출력 메쏘드
		System.out.println(this.type+"\t"+this.cc);
	}
	
	//setter, getter 메쏘드
	public String getType() {
		return type;
	}

	public int getCc() {
		return cc;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	

}
