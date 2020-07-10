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
		
		
	}
	
	
	
	
	
	
	
	
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers = null;
		return findMembers;
	}


	/*
	 * 자바반 학생들 찾아서 반환해줘 리눅스과목 강사들 찾아서 반환해줘 영업부서 스텝들 찾아서 반환해줘
	 */

	public AcademyMember[] findByAcademyMembers(int type) {
		AcademyMember[] findMembers=null;
		int cnt=0, index = 0;		
		switch (type) {
		case AcademyMember.GANGSA_TYPE:
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					findMembers[index] = members[i];
					index++;				
				}
			}
			break;
		case AcademyMember.STUDENT_TYPE:
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					findMembers[index] = members[i];
					index++;				
				}
			}
			break;
		case AcademyMember.STAFF_TYPE:
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					findMembers[index] = members[i];
					index++;				
				}
			}
			break;
		}
	return findMembers;
	}

	public AcademyMember[] findByAcademyMembersDetail(int type, String Detail) {
		AcademyMember[] findMembers = null;
		int cnt=0, index = 0;		
		switch (type) {
		case AcademyMember.GANGSA_TYPE:
			findMembers = this.findAcademyGangsas();
			AcademyGangsa[] findGangsas = new AcademyGangsa[this.findAcademyGangsas().length];  
			for (int i = 0; i < this.findAcademyGangsas().length; i++) {
				findGangsas[i] = (AcademyGangsa)findMembers[i];
			}
			
			for (int i = 0; i < this.findAcademyGangsas().length; i++) {
				if (findGangsas[i].getSubject() == Detail) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < this.findAcademyGangsas().length; i++) {
				if (findGangsas[i].getSubject() == Detail) {
					findMembers[index] = findGangsas[i];
					index++;				
				}
			}
			break;
		case AcademyMember.STUDENT_TYPE:
			findMembers = this.findAcademyStudents();
			AcademyStudent[] findStudents = new AcademyStudent[this.findAcademyStudents().length];
			for (int i = 0; i < this.findAcademyStudents().length; i++) {
				findStudents[i] = (AcademyStudent)findMembers[i];
			}
			for (int i = 0; i < this.findAcademyStudents().length; i++) {
				if (findStudents[i].getBan() == Detail) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < this.findAcademyStudents().length; i++) {
				if (findStudents[i].getBan() == Detail) {
					findMembers[index] = findStudents[i];
					index++;				
				}
			}
			break;
		case AcademyMember.STAFF_TYPE:
			findMembers = this.findAcademyStaffs();
			AcademyStaff[] findStaffs = new AcademyStaff[this.findAcademyStaffs().length];
			for (int i = 0; i < this.findAcademyStaffs().length; i++) {
				findStaffs[i] = (AcademyStaff)findMembers[i];
			}
			for (int i = 0; i < this.findAcademyStaffs().length; i++) {
				if (findStaffs[i].getDepart() == Detail) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			for (int i = 0; i < this.findAcademyStaffs().length; i++) {
				if (findStaffs[i].getDepart() == Detail) {
					findMembers[index] = findStaffs[i];
					index++;				
				}
			}
			break;
		}
	return findMembers;
	}
	

}