package staticex;

public class Student3 {
	
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum +=100;
		this.studentID=serialNum;
		
	}
	
	public String getStudent3Name() {
		return studentName;
	}
	
	public void setStudent3Name(String name) {
		this.studentName=name;
	}
	
	public static int getSerialNum() {
		int i=10;//이 변수는 뭐야??
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum=serialNum;
	}
	

}
