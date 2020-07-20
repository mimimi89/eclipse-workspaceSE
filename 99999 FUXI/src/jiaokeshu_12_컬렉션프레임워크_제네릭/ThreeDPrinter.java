package jiaokeshu_12_컬렉션프레임워크_제네릭;

public class ThreeDPrinter<T extends Material> {
	//type의 T, <> 다이아몬드 연산자, static 키워드는 T에 사용할 수 없음
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		material.doPrinting();
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	
	

}
