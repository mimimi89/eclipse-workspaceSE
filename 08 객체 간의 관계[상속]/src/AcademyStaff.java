public class AcademyStaff extends AcademyMember {		//아카데미 멤버 클래스를 상속받는 스태프 클래스
	
	
	
	public String depart;		//번호, 이름에 부서 추가됨
	
	public AcademyStaff() {		//기본 생성자
		
	}
	public AcademyStaff(int no, String name, String depart) {		//번호, 이름, 부서를 포함하는 생성자 메쏘드
		this.no=no;
		this.name=name;
		this.depart=depart;
		
	}
	
	public void staffPrint() {		//출력 메쏘드
		this.print();					//번호, 이름 출력되고	
		System.out.println(depart);		//부서까지 출력
		
	}
	
	//getter, setter 메쏘드
	public String getDepart() {
		return depart;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
