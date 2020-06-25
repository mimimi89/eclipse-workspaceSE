///

public class DefaultConstrctor {
	
	//생성자를 정의하지 않을 경우 컴파일러는 인자가 하나도 없는
    //생성자(디폴트(기본) 생성자)를 자동으로 넣어서 컴파일한다. 
	
	public DefaultConstrctor() {
		
	}
	
	public DefaultConstrctor(int m) {
		System.out.println("public DefaultConstrctor(int m)"+m);
	}


}
