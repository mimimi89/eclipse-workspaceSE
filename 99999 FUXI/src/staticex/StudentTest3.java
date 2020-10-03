package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student1 studentLee=new Student1();
		studentLee.setStudent1Name("이지원");
		System.out.println(Student1.serialNum);//1001
		System.out.println(studentLee.studentName+"의 학번: "+studentLee.studentID);
		
		Student1 studentSon=new Student1();
		studentSon.setStudent1Name("손수경");
		System.out.println(Student1.serialNum);//1002
		System.out.println(studentSon.studentName+"의 학번: "+studentSon.studentID);
	}

}
