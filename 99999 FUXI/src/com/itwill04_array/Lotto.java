package com.itwill04_array;
/*
 * 로또번호 6개 1set 를 가지고있는객체
 */
public class Lotto {
	private int[] noArray;
	public Lotto() {
		noArray=new int[6];
		this.generateNumber();
	}
	private void generateNumber() {
		for (int i = 0; i < noArray.length; i++) {
			noArray[i] = (int)(Math.random()*45)+1;
		}
	}
	
	public void print() {
		for (int i = 0; i < noArray.length; i++) {
			System.out.print(noArray[i]+" ");
		}
		System.out.println();
	}
}
