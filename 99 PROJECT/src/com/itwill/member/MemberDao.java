package com.itwill.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.account.Account;

public class MemberDao {
	/*
	 * 멤버필드
	 */
	private File membersFile;
	//file 자료형으로 하는  membersfile 
	
	/*
	 * 생성자 메쏘드
	 */
	public MemberDao() throws Exception{
		membersFile=new File("members.ser");
		if(!membersFile.exists()) {
			//membersFile이 존재하는지 여부 확인
			System.out.println("파일생성[members.ser]");
			//ObjectOutputStream 인스턴스르 파일에 저장하는 과정
			ObjectOutputStream oos
				=new ObjectOutputStream(new FileOutputStream(membersFile));
			oos.writeObject(new ArrayList<Account>());
		}
	}
	
	/**********************************************/
	
	/*
	 * input, output
	 */
	private ArrayList<Member> readFile() throws Exception{
		//ArrayList<Member>를 반환하는 readFile 메쏘드
		
		//ObjectInputStream 피일에서 인스턴스를 복원하는 과정
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream(membersFile));
		ArrayList<Member> memberList=(ArrayList<Member>)ois.readObject();
		ois.close();
		return memberList;
	}
	
	private void writeFile(ArrayList<Member> memberList) throws Exception{
		//파일에서 불러온 memberList를 쓰는 writeFile 메쏘드
		ObjectOutputStream oos=
				new ObjectOutputStream(
						new FileOutputStream(membersFile));
		oos.writeObject(memberList);
		oos.close();
	}
	
	/**********************************************/
	
	/*
	 * 1. CRUD-create
	 */
	public boolean create(Member addMember) throws Exception{
		boolean isSuccess=false;
		//성공여부 false로 초기화
		ArrayList<Member> memberList=this.readFile();
		//읽어낸 파일을 멤버리스트에 담아놓기
		if(isDuplicateId(addMember.getId())) {
			//추가한 멤버의 아이디를 인자로 넣어 중복여부 체크
			isSuccess=false;
			return isSuccess;
		}
		isSuccess=true;
		memberList.add(addMember);
		this.writeFile(memberList);
		return isSuccess;
	}
	
	public boolean isDuplicateId(String id) throws Exception{
		boolean isDuplicate=false;
		ArrayList<Member> memberList=this.readFile();
		for (Member member : memberList) {
			if(member.getId().equals(id)) {
				isDuplicate=true;
				break;
			}
		}
		return isDuplicate;
		
	}
	
	/*
	 * readAll
	 */
	public ArrayList<Member> readAll()throws Exception {
		return this.readFile();
	}
	
	/*
	 * readOne
	 */
	public Member readOne(String id) throws Exception{
		Member findMember=null;
		ArrayList<Member> memberList=this.readFile();
		for (Member member : memberList) {
			if(member.getId().equals(id)) {
				findMember=member;
				break;
			}
		}
		return findMember;
	}
	
	/*
	 * update
	 */
	public void update(Member updateMember) throws Exception{
		ArrayList<Member> memberList=this.readFile();
		for (Member member : memberList) {
			if(member.getId().equals(updateMember.getId())) {
				member.setPassword(updateMember.getPassword());
				member.setName(updateMember.getName());
				member.setAddress(updateMember.getAddress());
				member.setAge(updateMember.getAge());
				member.setMarried(updateMember.isMarried());
				break;
			}
		}
		this.writeFile(memberList);
	}
	
	/*
	 * delete
	 */
	public void delete(String id) throws Exception {
		ArrayList<Member> memberList=this.readFile();
		for (Member member : memberList) {
			if(member.getId().equals(id)) {
				memberList.remove(member);
				break;
			}
		}
		this.writeFile(memberList);
		
	}
}














