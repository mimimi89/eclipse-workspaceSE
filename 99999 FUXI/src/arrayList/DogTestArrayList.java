package arrayList;

import java.util.ArrayList;

import array.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("플루토", "블러드하운드"));
		dogList.add(new Dog("구피", "블러드하운드"));
		dogList.add(new Dog("퐁고", "달마시안"));
		dogList.add(new Dog("레이디", "코커스패니얼"));
		dogList.add(new Dog("트램프", "슈나우저"));
		
		for (int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());
		}

	}

}
