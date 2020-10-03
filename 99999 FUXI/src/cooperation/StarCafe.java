package cooperation;

public class StarCafe {
	int sales;
	int money;
	
	public StarCafe() {
		
	}
	
	public void buyAmericano(int money) {
		this.money +=money;
		sales++;
		
	}
	
	public void showInfo() {
		System.out.println("별다방의 아메리카노 판매량은 "+sales+"잔이고, 수익은 "+money+"원입니다.");
	}

}
