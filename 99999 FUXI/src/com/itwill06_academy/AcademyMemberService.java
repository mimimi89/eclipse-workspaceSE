package com.itwill06_academy;
/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	
	private AcademyMember[] members={
			new AcademyStudent(1, "KIM", "자바"),
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"),
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"),
			new AcademyGangsa(7, "DIM", "OS"),
			new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산")
	};

	
	
	public AcademyMember[] getMembers() {
		return members;
	}
	
	// 1. 출력메쏘드
	public void print() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}
	
	// 2. 번호로 찾아서 반환하는 메쏘드
	public AcademyMember findAcademyMemberByNo(int no) {
		AcademyMember findMember = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == no) {
				findMember = members[i];
				members[i].print();
				break;
			}
		}
		return findMember;
	}
	
	// 3. 이름으로 찾아서 반환하는 메쏘드
	
	/*
	 *이름이 KIM인 사람이 한 명일 때
	
	public AcademyMember findAcademyMemberByName(String name) {
		AcademyMember findMember = null;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equalsIgnoreCase("KIM")) {
				//string은 equalsIgnoreCase로 
				findMember=members[i];
				members[i].print();
				break;
			}
		}
		return findMember;
		
	}
	*/

	/*이름이 KIM인 사람이 여러 명일 때*/
	public AcademyMember[] findAcademyMemberByName(String name) {
		AcademyMember[] findMembers = null;
		
		int a = 0;
		//a는 이름이 KIM인 사람의 수
		
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equalsIgnoreCase(name)) {
				a++;
			}
		}
		//배열의 길이만큼 반환받은 이름의 값이 괄호와 같으면 a의 숫자를 증가시킨다.
		
		findMembers = new AcademyMember[a];
		//찾아낸 사람들을 배열 객체로 묶는다.
		
		int index = 0;
		//배열 객체의 크기를 0으로 설정
		
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equalsIgnoreCase(name)) {
				findMembers[index] = members[i];
				members[i].print();
				index++;
			}
		}
		
		return findMembers;
	}


	// 3. instanceof를 이용해서 학생, 직원, 강사인 사람 반환하기
	// 학생 찾기
	public AcademyMember[] findAcademyStudents() {
		AcademyMember[] student=null;
		//학생으로 이루어진 배열 객체 초기화
		int countStu=0;
		//학생의 수 0으로 초기화
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				countStu++;
			}
		}
		
		student=new AcademyStudent[countStu];
		
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				student[index] = members[i];
				members[i].print();
				index++;
			}
		}
		return student;
	}
	
	//직원 찾기
	public AcademyMember[] findAcademyStaff() {
		AcademyMember[] staff=null;
		int countStf=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				countStf++;
				
			}
			
		}
		
		staff=new AcademyStaff[countStf];
		
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				staff[index]=members[i];
				members[i].print();
				index++;
				
			}
			
		}
		return staff;
	}
	
	//강사 찾기
	public AcademyMember[] findAcademyGangsa() {
		AcademyMember[] gangsa=null;
		int countGs=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				countGs++;
				
			}
		}
		
		gangsa=new AcademyGangsa[countGs];
		
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				gangsa[index]=members[i];
				members[i].print();
				index++;
			}
		}
		return gangsa;
		
	}
	
	// 4. AcademyMember 중에서 자바반인 AcademyStudent객체들
	// 자바반 학생 찾기
	public AcademyMember[] findAcademyJavaStudents() {
		AcademyMember[] javaStudent=null;
		//학생으로 이루어진 배열 객체 초기화
		int countStu=0;
		//학생의 수 0으로 초기화
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				countStu++;
			}
		}
		
		javaStudent=new AcademyStudent[countStu];
		
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				String ban=tempStudent.getBan();
				if(ban=="자바") {
					javaStudent[index] = members[i];
					members[i].print();
				}
				index++;
			}
		}
		return javaStudent;
	}
	
	// 영업부서 직원 찾기
		public AcademyMember[] findAcademySalesStaff() {
			AcademyMember[] salesStaff=null;
			int countStf=0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStaff) {
					countStf++;
				}
			}
			
			salesStaff=new AcademyStaff[countStf];
			
			int index = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					AcademyStaff tempStaff=(AcademyStaff)members[i];
					String depart=tempStaff.getDepart();
					if(depart=="영업") {
						salesStaff[index] = members[i];
						members[i].print();
					}
					index++;
				}
			}
			return salesStaff;
		}
		
		// 프로그래밍 강사 찾기
		public AcademyMember[] findAcademyProgramingGangsa() {
			AcademyMember[] programingGangsa=null;
			int countGs=0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyGangsa) {
					countGs++;
				}
			}
			
			programingGangsa=new AcademyGangsa[countGs];
			
			int index = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					AcademyGangsa tempGangsa=(AcademyGangsa)members[i];
					String subject=tempGangsa.getSubject();
					if(subject=="프로그래밍") {
						programingGangsa[index] = members[i];
						members[i].print();
					}
					index++;
				}
			}
			return programingGangsa;
		}
	
	
	

}