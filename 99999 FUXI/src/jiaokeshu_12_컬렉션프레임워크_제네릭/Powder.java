package jiaokeshu_12_컬렉션프레임워크_제네릭;

public class Powder extends Material {
	
	public String toString() {
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력중입니다.");
	}

}
