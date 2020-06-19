
public class Car {
	
	//차량번호
	private int no;
	//차의 모델
	private String model;
	//차의 엔진
	private Engine engine;
	
	//생성자 오버로드
	
	public Car() {
		
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	
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
