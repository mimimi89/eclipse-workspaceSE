package jiaokeshu_12_컬렉션프레임워크_제네릭;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1=new ThreeDPrinter<Powder>();
		printer1.setMaterial(new Powder());
		Powder powder= printer1.getMaterial();
		System.out.println(printer1);
		
		System.out.println("///////////////////////////////");
		
		ThreeDPrinter<Plastic> printer2=new ThreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic= printer2.getMaterial();
		System.out.println(printer2);
		
		/*
		 * Material을 상속받지 않은 Water는 사용할 수 없도록 제한
		ThreeDPrinter<Water> printer3=new ThreeDPrinter<Water>();
		printer3.setMaterial(new Water());
		Water water= printer3.getMaterial();
		System.out.println(printer3);
		*/
		
		System.out.println("///////////////////////////////");
		printer2.printing();
		
		
	}

}
