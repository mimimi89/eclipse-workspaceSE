package com.itwill06_car;


public class Car {			//car 객체를 찍어내는 클래스
	//멤머필드
	private String no;
	private int inTime;
	private int outTime;
	private int fee;		//번호, 입차시간, 출차시간, 주차비
	
	//기본(디폴트) 생성자
	public Car() {	
		
	}
	
	//번호와 입차시간을 인자로 갖는 생성자 메쏘드
	public Car(String no, int inTime) {
		
		this.no = no;
		this.inTime = inTime;
	}


	//인스턴스 메쏘드
	//입차
	public void ipChar(String no,int inTime) {
		this.setNo(no);
		this.setInTime(inTime);
	}
	//주차요금계산 메쏘드
	public void calculateFee() {
		this.fee = (this.outTime-this.inTime)*1000;
	}
	//출차(출차 시간 입력하면 주차요금계산)
	public void chulCha(int outTime) {
		this.setOutTime(outTime);
		this.calculateFee();
	}
	//헤더프린트 메쏘드
	public static void headerPrint() {
		System.out.println("*******************************");
		System.out.println("번호\t입차\t출차\t요금");
		System.out.println("*******************************");
	}
	//출력 메쏘드
	public void print() {
		System.out.println(this.no+"\t"+inTime+"\t"+outTime+"\t"+fee);
		
	}
	//getter,setter 메쏘드
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
}












