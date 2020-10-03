package staticex;

public class Student1 {
	
	public static int serialNum=1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		this.studentID=serialNum;
		
	}
	
	public String getStudent1Name() {
		return studentName;
	}
	
	public void setStudent1Name(String name) {
		studentName=name;
	}
	

}
