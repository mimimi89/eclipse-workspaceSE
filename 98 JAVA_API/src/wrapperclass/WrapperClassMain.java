/*
- Wrapper 클래스

	자바 데이타형은 기본 데이타형과 레퍼런스(참조형) 데이타형으로 구분됩니다.
	기본 데이타형으로는 int, boolean, double 등이 제공됩니다.
	이런 기본 데이타형을 객체로 사용할 수 있는 방법으로 Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종 유용한 기능들을 메서드로 제공받을 수 있다는 장점이 있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */

package wrapperclass;

public class WrapperClassMain {

	public static void main(String[] args) {
		
		//WrapperClass 객체 생성
		
		//Boxing
		Integer wi1=null;
		wi1=new Integer(89);
		//참조변수 wi1에 주소값이 들어감
		Integer wi2=new Integer("89");
		
		
		//UnBoxing
		int i1=wi1.intValue();
		int i2=wi2.intValue();
		
		
		//Boxing
		Double wd1=new Double(3.14159);
		Double wd2=new Double("3.14159");
		
		
		//UnBoxing
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		
		Boolean wb1=new Boolean(true);
		Boolean wb2=new Boolean("true");
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		
		//AUTO Boxing
		
		Integer wi3=89;
		Integer wi4=89;
		Double wd3=3.14159;
		String wd4="3.14159";
		Boolean wb3=true;
		Boolean wb4=false;
		
		
		//AUTO UnBoxing
		
		int i11=wi1.intValue();
		int i22=wi2;
		
		double d11;
		double d22;
		
		boolean b11;
		boolean b22=wb2;
		
		Object o=1;
		
		Integer ia=89;
		Integer ib=45;
		Integer ic=78;
		Integer id=99;
		Integer ie=23;
		
		//UpCasting
		Object oa=ia;
		Object ob=ib;
		Object oc=ic;
		Object od=id;
		Object oe=ie;
		
		//Auto Boxing->UpCasting
		Object ooa=89;
		Object oob=45;
		Object ooc=78;
		Object ood=99;
		Object ooe=23;
		
		Object[] scoreArray=new Object[10];
		
		scoreArray[0]=89;
		scoreArray[1]=43;
		scoreArray[2]=33;
		scoreArray[3]=67;
		scoreArray[4]=77;
		scoreArray[5]=11;
		scoreArray[6]=89;
		scoreArray[7]=92;
		scoreArray[8]=99;
		scoreArray[9]=66;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer wi=(Integer)scoreArray[i];
			int tempScore=wi.intValue();
			System.out.print(tempScore+" ");
			 */
			
			int tempScore=(Integer)scoreArray[i];
			System.out.print(tempScore+" ");
		}
		
		
		
		
		
		
		

	}

}
