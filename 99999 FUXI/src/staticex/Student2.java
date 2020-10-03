package staticex;

public class Student2 {
	
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		this.studentID=serialNum;
		
	}
	
	public String getStudent2Name() {
		return studentName;
	}
	
	public void setStudent2Name(String name) {
		this.studentName=name;
	}
	
	public static int getSerialNum() {
		int i=10;//이 변수는 뭐야??
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum=serialNum;
	}
	

}
