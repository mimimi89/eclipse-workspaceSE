
//
public abstract class Employee {
	//추상클래스
    
	
	public static final double INCENTIVE_RATE=0.1;
	//인센티브 비율 0.1, final이므로 변경 금지
	private int no;
    private String name;
    private int pay;
    //번호, 이름, 급여
    
    
    //생성자 메쏘드
    public Employee() {
		super();
	}

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}


	//급여 계산 메쏘드
	//추상 메쏘드, 재정의해서 사용
    public abstract void calculatePay();
    
    //인센티브 계산 메소드
    //final 메쏘드, 재정의 금지
    public final double calculateIncentive() {
    	double incentive=0.0;
    	if(this.pay>=1000000) {
    		incentive=pay*Employee.INCENTIVE_RATE;
    		
    	}
    	return incentive;
    } 
    
    //출력 메쏘드
    public void print(){
    	System.out.print(no+"\t"+name+"\t"+pay+"\t");
    	
    }

    //getter, setter 메쏘드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
    
    
    
    

}
