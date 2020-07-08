package com.itwill06.service;
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
		/*
		 * for (int i = 0; i < members.length; i++) { members[i].print(); }
		 */
		return members;
	}

	public void print() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}

	//번호를 입력하면 그 사람의 소속을 밝힘
	public AcademyMember findAcademyMemberByNo(int no) {
		AcademyMember findMember=null;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo() == no) {
				findMember = members[i];
			}
		}
		return findMember;
	}

	//사람 이름 넣으면 그 사람의 소속을 밝힘
	public AcademyMember[] findAcademyMemberByName(String name) { 
		AcademyMember[] findMembers=null;
		int count =0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];


		int j=0;
		for (int i = 0; i < findMembers.length; i++) {
			if(members[j].getName().equals(name)) {
				findMembers[j] = members[i];
			}
		}
		return findMembers;
	}
	/*
	 * 강사 or 학생 or Staff들 반환( instanceof연산자)
	 * 	
	 */
	public AcademyMember[] findAcademyStudents(){
		int count = 0;

		for (int i = 0 ; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				count++;
			}
		}

		AcademyMember[] acamem = new AcademyMember[count];
		int j=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				acamem[j] = members[i];
				j++;
			}
		}

		return acamem;
	}
	public AcademyMember[] findAcademyGangsas(){

		int count = 0;

		for (int i = 0 ; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				count++;
			}
		}

		AcademyMember[] acamem = new AcademyMember[count];
		int j=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				acamem[j] = members[i];
				j++;
			}
		}

		return acamem;
	}
	public AcademyMember[] findAcademyStaffs(){

		int count = 0;

		for (int i = 0 ; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				count++;
			}
		}

		AcademyMember[] acamem = new AcademyMember[count];
		int j=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				acamem[j] = members[i];
				j++;
			}
		}
		return acamem;

	}

	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		for (int i = 0; i < members.length; i++) {
			if( AcademyMember.GANGSA_TYPE == type) {

				findMembers =this.findAcademyGangsas();

			} else if( AcademyMember.STAFF_TYPE == type) {

				findMembers = this.findAcademyStaffs();

			} else if ( AcademyMember.STUDENT_TYPE == type) {

				findMembers = this.findAcademyStudents();
			} 	
		}
		return findMembers;
	}

	/*
	public AcademyMember[] findAcademyStudentsByBan(String ban) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsasBySubject(String subject) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyStaffsByDepart(String depart) {
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

		//serchStr에 해당하는 배열공간 마련을 위해 배열공간 재정의를 위한 count변수 초기화
		int count = 0;

		AcademyMember[] findMembers=null;

		//타입에 따른 배열객체의 주소를 findMembers에 대입
		findMembers = this.findAcademyMembersByType(type);

		//serchStr에 해당하는 배열공간 마련을 위해 배열공간 재정의
		for (int i = 0; i < findMembers.length; i++) {

			//findMembers의 반 or 부서의 값과 serchStr의 값이 동일하면 
			//배열공간 마련을 위에 앞서 0으로 초기화된 count에 증가연산자 사용

			/*
			 * 왜 if문을 이렇게 썻는지 살펴보면
			 * 우선 181번 라인 findMembers = this.findAcademyMembersByType(type);에서
			 * findMembers에는 인자값에 해당하는 배열의 주소값을 저장하게 되니
			 * 또 다시 findMembers만을 위한 배열공간을 마련해 줄 필요가 없다
			 * 하지만 4개의 학생객체, 3개의 강사객체, 2개의 직원객체중에서
			 * searchStr에 해당하는 학생,강사,직원을 뽑을 때는 새로운 배열이 만들어져야함
			 * 그래서 
			 * 
			 * 
			 * 
			 */
			
			if(findMembers[i] instanceof AcademyStudent) {
				AcademyStudent tem = (AcademyStudent)findMembers[i];
				if (tem.getBan().equals(searchStr)) {
					count++;
				}

			}else if(findMembers[i] instanceof AcademyGangsa) {
				AcademyGangsa tem = (AcademyGangsa)findMembers[i];
				if (tem.getSubject().equals(searchStr)) {
					count++;
				}
			}else if(findMembers[i] instanceof AcademyStaff) {
				AcademyStaff tem = (AcademyStaff)findMembers[i];
				if (tem.getDepart().equals(searchStr)) {
					count++;
				}
			}
		}


		AcademyMember[] dsa = new AcademyMember[count];
		int j =0;
		for (int i = 0; i < findMembers.length; i++) {

			//findMembers의 반 or 부서의 값과 serchStr의 값이 동일하면 
			//배열공간 마련을 위에 앞서 0으로 초기화된 count에 증가연산자 사용

			if(findMembers[i] instanceof AcademyStudent) {
				AcademyStudent tem = (AcademyStudent)findMembers[i];
				if (tem.getBan().equals(searchStr)) {
					dsa[j]=findMembers[i];
					j++;
				}

			}else if(findMembers[i] instanceof AcademyGangsa) {
				AcademyGangsa tem = (AcademyGangsa)findMembers[i];
				if (tem.getSubject().equals(searchStr)) {
					dsa[j]=findMembers[i];
					j++;
				}
			}else if(findMembers[i] instanceof AcademyStaff) {
				AcademyStaff tem = (AcademyStaff)findMembers[i];
				if (tem.getDepart().equals(searchStr)) {
					dsa[j]=findMembers[i];
					j++;
				}
			}
		}

		return dsa;
	} 
	/*
	public AcademyMember[] findByAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		return findMembers;
	} 
	 */
}
