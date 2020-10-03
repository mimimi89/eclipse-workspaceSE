package array;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog5=new Dog[5];
		
		dog5[0]= new Dog("플루토", "블러드하운드");
		dog5[1]= new Dog("구피", "블러드하운드");
		dog5[2]= new Dog("퐁고", "달마시안");
		dog5[3]= new Dog("레이디", "코커스패니얼");
		dog5[4]= new Dog("트램프", "슈나우저");
		
		for (int i = 0; i < dog5.length; i++) {
			System.out.println(dog5[i].showDogInfo());
		}
		
		
	}

}
