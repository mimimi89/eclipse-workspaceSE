package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim=new Person();
		personKim.name="김유신";
		personKim.weight=85.5F;
		personKim.height=180.0F;
		
		
		Person personLee=new Person("이순신", 175.0F, 75.0F);
		
		System.out.println(personKim.toString());
		System.out.println(personLee.toString());
		

	}

}
