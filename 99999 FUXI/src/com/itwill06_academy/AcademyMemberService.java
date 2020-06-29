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
	
	public void print() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}
	public AcademyMember findAcademyMemberByNo(int no) {
		AcademyMember findMember=null;
		return findMember;
	}
	public AcademyMember[] findAcademyMemberByName(String name) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	/*
	 * 강사 or 학생 or Staff들 반환( instanceof연산자)
	 * 	public AcademyStudent[] findAcademyStudents(){}
	 *	public AcademyGangsa[] findAcademyGangsas(){}
	 * 	public AcademyStaff[] findAcademyStaffs(){}
	 */
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	
	/*
	public AcademyStudent[] findAcademyStudentsByBan(String ban) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyGangsa[] findAcademyGangsasBySubject(String subject) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyStaff[] findAcademyStaffsByDepart(String depart) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	*/
	/*
	 * 자바반     학생들 찾아서 반환해줘 
	 * 리눅스과목 강사들 찾아서 반환해줘 
	 * 영업부서   스텝들 찾아서 반환해줘 
	 */
	public AcademyMember[] findByAcademyMembers(int type,String searchStr) {
		AcademyMember[] findMembers=null;
		return findMembers;
	} 
	/*
	public AcademyMember[] findByAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		return findMembers;
	} 
	*/
}
