package cooperation;
//객체 간 협력
public class BeanCafe {
	int sales;
	int money;
	
	public BeanCafe() {
		
	}
	
	public void buyLatte(int money) {
		this.money +=money;
		sales++;
		
	}
	
	public void showInfo() {
		System.out.println("콩다방의 라떼 판매량은 "+sales+"잔이고, 수익은 "+money+"원입니다.");
	}

}
