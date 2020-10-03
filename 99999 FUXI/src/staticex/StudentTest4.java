package staticex;

public class StudentTest4 {

	public static void main(String[] args) {

		Student2 studentLee=new Student2();
		studentLee.setStudent2Name("이지원");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName+"의 학번: "+studentLee.studentID);
		
		Student2 studentSon=new Student2();
		studentSon.setStudent2Name("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName+"의 학번: "+studentSon.studentID);
		
	}

}
