package jiaokeshu_12_컬렉션프레임워크_제네릭;

public class ThreeDPrinter<T extends Material> {
	
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
