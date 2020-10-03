package object;

public class Circle implements Cloneable {
	Point point;
	int radius;//반지름
	
	public Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	@Override
	public String toString() {
		return "원점은 "+point+"이고, 반지름은 "+radius+"입니다.";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
