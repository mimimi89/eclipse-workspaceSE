package com.itwill.member;

import java.util.concurrent.ExecutionException;

public class MemberService {
	
	private MemberDao memberDao;
	public MemberService() throws Exception{
		memberDao=new MemberDao();
		
	}
	
	
	/*
	 * 회원가입
	 */
	public boolean memberRegister(Member newMember) throws Exception {
		boolean isSuccess=false;
		isSuccess=memberDao.create(newMember);
		return isSuccess;
	}
	
	/*
	 * 로그인
	 */
	public int login(String id, String password) throws Exception {
		
		int result=-9999;
		/*
		 * 0: 성공
		 * 1: 존재하지 않는 아이디
		 * 2: 잘못 입력한 비밀번호
		 */
		
		//1. 아이디 존재 여부
		if(memberDao.isDuplicateId(id)){
			//아이디 존재
			Member findMember=memberDao.readOne(id);
			//2. 패스워드 일치 여부
			if(findMember.matchPassword(password)) {
				//비밀번호 일치
				result=0;
			}else {
				//비밀번호 불일치
				result=2;
			}
			
		}else {
			//존재하지 않는 아이디
			result=1;
		}
		return result;
		
	}
	
	
	/*
	 * 로그아웃
	 */
	
	
	/*
	 * 회원상세보기(회원 1명 아이디로 찾기)
	 */
	
	/*
	 * 회원리스트(전체)
	 * 회원리스트(이름으로 찾기)
	 * 회원리스트(주소로 찾기)
	 * 회원리스트(나이로 찾기)
	 */

	
	
	
	
	
	
	
	
	
	
}
