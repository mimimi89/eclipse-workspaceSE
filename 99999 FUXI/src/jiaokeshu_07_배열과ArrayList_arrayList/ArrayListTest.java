package jiaokeshu_07_배열과ArrayList_arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		//Ctrl+Shift+o import 단축키
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");//배열에 그냥 객체 추가

		for (String string : list) {
			System.out.println(string);
			
		}
		
		System.out.println("/////////////////////////////////");
		/*
		*ArrayList에서는 인덱스를 제공하지 않기 때문에 아래와 같은 코드는 사용할 수 없음
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		 */
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		

	}

}
