///
public class AcademyStaff extends AcademyMember {
	//AcademyMember를 상속받는 AcademyStaff 클래스
	
	//멤버필드(번호, 이름에 부서 추가)
	public String depart;
	
	//생성자 메쏘드
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
	
	//상속받은 출력 메쏘드를 재정의
	@Override
	public void print() {
		super.print();
		System.out.println(depart);
		
	}
	
	//getter, setter 메쏘드
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
