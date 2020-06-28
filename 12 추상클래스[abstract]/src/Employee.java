public abstract class Employee {	
    
	
	
	private int no;
    private String name;
    private int pay;		//번호, 이름, 급여  

    
    
    
    public Employee() {		//기본생성자
		super();
	}

	public Employee(int no, String name) {	//번호, 이름을 포함하는  생성자 메쏘드
		super();
		this.no = no;
		this.name = name;
	}


    public abstract void calculatePay();		//급여 계산 추상클래쓰
    //급여계산메쏘드는 실제구현작업 불가능
    //반드시 자식객체에서 재정의해야하는 메쏘드
    //재정의 강제
    
    
    public void print(){						//출력 메쏘드
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
