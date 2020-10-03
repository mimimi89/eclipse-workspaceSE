package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		
		Student3 studentLee=new Student3();
		studentLee.setStudent3Name("이지원");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName+"의 학번: "+studentLee.studentID);
		
		Student3 studentSon=new Student3();
		studentSon.setStudent3Name("손수경");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.studentName+"의 학번: "+studentSon.studentID);
		

	}

}
