package cooperation;

public class Person {
	
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name=name;
		this.money=money;
	}

	public void buyStarAmericano(StarCafe starCafe) {
		starCafe.buyAmericano(4000);
		this.money -= 4000;
	}
	
	public void buyBeanLatte(BeanCafe beanCafe) {
		beanCafe.buyLatte(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원입니다.");
	}
}
