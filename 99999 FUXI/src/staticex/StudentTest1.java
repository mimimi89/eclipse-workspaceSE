package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);//1000
		studentLee.serialNum++;//1001
		
		Student studentSon=new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);//1002
		System.out.println(studentLee.serialNum);//1001
		

	}

}
