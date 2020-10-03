package classpart;

public class Man {
	
	int age;
	String name;
	boolean isMarried;
	int childQuanity;


	@Override
	public String toString() {
		return "Man [age=" + age + ", name=" + name + ", isMarried=" + isMarried + ", childQuanity=" + childQuanity
				+ "]";
	}

	public static void main(String[] args) {
		Man man=new Man();
		
		man.age=40;
		man.name="James";
		man.isMarried=true;
		man.childQuanity=3;
		
		System.out.println(man.toString());
		
		

	}

}
