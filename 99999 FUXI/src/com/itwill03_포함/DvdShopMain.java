package com.itwill03_포함;


public class DvdShopMain {

	public static void main(String[] args) {

		DvdMember mb1=new DvdMember(1, "김가영", "010-5279-0000");
		DvdMember mb2=new DvdMember(2, "김나영", "010-5202-0000");
		DvdMember mb3=new DvdMember(3, "김다영", "010-3705-0000");


		Dvd d1=new Dvd(1111, "라라랜드", "드라마");
		Dvd d2=new Dvd(2222, "엑시트", "액션");
		Dvd d3=new Dvd(3333, "겨울왕국", "애니메이션");
		Dvd d4=new Dvd(4444, "기생충", "드라마");
		Dvd d5=new Dvd(5555, "윤희에게", "멜로");
		
		
		mb1.setDvd(d5);
		mb2.setDvd(d3);
		mb3.setDvd(d1);
		
		mb1.print();
		mb2.print();
		mb3.print();
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		
	}

}
