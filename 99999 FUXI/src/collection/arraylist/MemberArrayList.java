package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	//멤버를 인스턴스로 갖는 어레이리스트를 필드를 갖고 있음
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	//생성자
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//멤버를 매개변수로 받으면 그 멤버를 어레이리스트에 추가 
	
	public boolean removeMember(int memberId) {
		//멤버아이디를 매개변수로 받아 있으면 삭제 후 참 반환, 없으면 존재하지 않습니다 출력 후 참 반환 
		for (int i = 0; i < arrayList.size(); i++) {
			//어레이리스트 사이즈만큼 돌아가면서
			Member member=arrayList.get(i);
			int tempId=member.getMemberId();
			//임시 아이디에 아이디를 넣고
			if(tempId==memberId) {
				//임시 아이디와 매개변수로 받은 아이디가 같으면
				arrayList.remove(i);
				//삭제
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return true;
	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
