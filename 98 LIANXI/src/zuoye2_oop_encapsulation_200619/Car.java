package zuoye2_oop_encapsulation_200619;	

//멤버변수 private, 멤버메쏘드 public
//캡슐화는 뭐 때문에????


public class Car {

	private String no;
	private int intime;
	private int outtime;
	private int fee;
	
	
	public void intime(String no, int intime) {
		this.no=no;
		this.intime=intime;
		
	}
	
	public void setOuttime(int outtime) {
		this.outtime=outtime;
	}
	
	public void calculateFee() {
		this.fee=(this.outtime-this.intime)*1000;
	}
	
	public void print() {
		System.out.println();
		System.out.printf("\t\t     주차요금 영수증\n");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%6s\t %13d\t %12d\t %14d\n", this.no, this.intime, this.outtime, this.fee);
		System.out.println("-----------------------------------------------------------");
	}
	
	//setter, getter 단축키: alt+shift+S --> R
	//이거 왜 하는 거?????

	public String getNo() {
		return no;
	}

	public int getIntime() {
		return intime;
	}

	public int getOuttime() {
		return outtime;
	}

	public int getFee() {
		return fee;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setIntime(int intime) {
		this.intime = intime;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
	
	

}
