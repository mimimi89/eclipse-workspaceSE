/// 

public class Car {
	
	//멤버필드
	private int no;			//차량번호
	private String model;	//차의 모델
	private Engine engine;	//엔진 타입의 멤버 변수
	
	//생성자 오버로드, 하나의 메쏘드 다양한 인자 종류와 개수
	public Car() {
		
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	
	//인스턴스 메쏘드
	public void print() {
		System.out.print(this.no+"\t"+this.model+"\t\t");
		this.engine.print();
	
	}
	
	
	///getter, setter
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}
	public String getModel() {
		return model;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public void setModel(String model) {
		this.model = model;
	}

	

	

}
