/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
public class MemberMethod {

	
	//멤버변수 
	int member1;
	
	
	
	//멤버메쏘드(인스턴스메쏘드)
	
	void method1(){
		//접근제한자+리턴타입+메쏘드이름(인자){}
		//접근제한자: void
		//리턴타입: char, int, double 등과 사용자 지정 타입(ex. car, student)
		//
		
		System.out.println("MemberMethod.method1()실행");
		
		
		
		
		
		return;
		//모든 메쏘드의 마지막(블록 최하단)에는 항상 실행흐름(쓰레드)을 
		//호출한 곳으로 반환하여야 한다. 반환타입(리턴타입)이 void인 경우, 생략가능!!! 
						
		
	}//method1
	
	void method2(int count) {
		System.out.println("MemberMethod.method2(int count)실행 count:"+count);
		return;
		
		
		
	}//method2
	
	void method3(String msg, int count) {
		System.out.println("MemberMethod.method3(String msg, int count)실행)");
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
			
		}//for
		
		
	}//method3
	
	void method4(String name, String msg, int count) {
		System.out.println("MemberMethod.method4(String name, String msg, int count)실행)");
		String result=name+"님"+msg;
		for (int i = 0; i < count; i++) {
			System.out.println(result);
			
		}
		
		System.out.println();
		
	}//method4
	
}//class
