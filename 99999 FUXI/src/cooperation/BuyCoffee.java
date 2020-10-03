package cooperation;

public class BuyCoffee {

	public static void main(String[] args) {
		Person personLee=new Person("이씨", 5000);
		Person personKim=new Person("김씨", 10000);
		Person personPark=new Person("박씨", 20000);
		
		StarCafe starCafe=new StarCafe();
		personLee.buyStarAmericano(starCafe);
		personPark.buyStarAmericano(starCafe);
		
		BeanCafe beanCafe=new BeanCafe();
		personKim.buyBeanLatte(beanCafe);
		personPark.buyBeanLatte(beanCafe);
		
		personLee.showInfo();
		personKim.showInfo();
		personPark.showInfo();
		starCafe.showInfo();
		beanCafe.showInfo();
	
	
	}

}
