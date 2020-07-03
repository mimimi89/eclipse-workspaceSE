
public class ObjectChildMain {

	public static void main(String[] args) {
		
		ObjectChild oc = new ObjectChild();	
		//ObjectChild 클래스로 찍어내 객체 oc
		
		int hashCode=oc.hashCode();
		/*
		 * public native int hashCode(); 
		 * hashCode 메쏘드: 두 객체가 같은 객체인지 확인할 때
		 */

		System.out.println(hashCode);
		
		
		String str=oc.toString();
		/* 
		 * public String toString() {
		        return getClass().getName() + "@" + Integer.toHexString(hashCode());
		    }
		 * toString 메쏘드: 객체가 가지고 있는 정보나 값들을 문자열로 만들어 반환하는 메쏘드
		 */
		System.out.println(str);	//객체의 주소지
		
		
		
		
		
		

	}

}
