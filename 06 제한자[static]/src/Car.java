
public class Car {
	
	public static int count;		//차량의 총생산대수(적당하지 않음)
	private int no;					//차 번호
	private String model;			//차 모델명
	private String color;			//차 색상	
	
	
//생성자

	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		Car.count++;
	}

	
//출력메소드
	public void print() {
		System.out.println(no+"\t"+model+"\t"+color);
	}
	

//getter, setter
	public int getNo() {
		return no;
	}



	public String getModel() {
		return model;
	}



	public String getColor() {
		return color;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public void setColor(String color) {
		this.color = color;
	}

}
