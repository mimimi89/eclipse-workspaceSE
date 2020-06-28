public class AcademyStaff extends AcademyMember {
	
	
	
	public String depart;
	
	public AcademyStaff() {
		
	}
	public AcademyStaff(int no, String name, String depart) {
		this.no=no;
		this.name=name;
		this.depart=depart;
		
	}
	//이전의 스태프 클래스 출력 메쏘드
	/*
	 public void staffPrint() {		//출력 메쏘드
		this.print();					//번호, 이름 출력되고	
		System.out.println(depart);		//부서까지 출력
		
	}
	 */
	@Override
	public void print() {
		super.print();
		System.out.println(depart);
		
	}
	
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
