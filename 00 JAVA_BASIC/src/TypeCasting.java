
public class TypeCasting {

	public static void main(String[] args) {
		/*
		형변환(Casting)--> 숫자형데이타간에만 가능
		
		    - 형식 :  (데이타타입)변수or숫자형리터럴;
		    //데이타 타입에 boolean은 못 들어감
		    
		    - 자동(묵시적)형변환(작은데이타-->큰데이타)upcasting
			     byte-->short-->int-->long-->float-->double
			     
		    - 강제(명시적)형변환(큰데이타-->작은데이타)downcasting
			     double-->float-->long-->int-->short-->byte
		 */
		//upcasting(promotion)

		byte b = 127;
		short s = 32767;
		char c = 'A';
		int i = 2147483647;
		long l = 2147483648L;
		//float f = (float)3.14;
		float f = 3.14f;
		double d = 3.14;
		
		/*
		 * 자동형변환
		 */
		
		double dr = b;
		dr=s;
		dr=c;
		dr=i;
		dr=l;
		dr=f;
		
		/*
		 * 강제 형변환/명시적 형변환 
		 */
		
		/*
		int iresult = l;
		iresult = f;
		iresult = d;
		*/
		
		int iresult = (int)l;
		System.out.println("long-->int casting : "+iresult);
		iresult = (int)f;
		System.out.println("float-->int casting : "+iresult);
		iresult = (int)d;
		System.out.println("double-->int casting : "+iresult);
		
		//
		
		double davg = 85.665;
		System.out.println(davg);
		
		int iavg = (int)davg;
		System.out.println(iavg);
		
		/*
		 * 연산 시의 형변환
		 * 		-연산항들 중에 가장 큰 타입으로 모든 항이 형변환됨	
		 */
		
		double dresult = 23+ 0.1+90+'s';
		System.out.println("dresult : "+dresult);
		
		int tot = 61+42+81;
		System.out.println("tot : "+tot);
		double avg = tot/3;
		System.out.println("avg : "+avg);
		
		System.out.println("-----------연산시의 형변환 예외(byte,short)----------");
		byte bb = 90;
		short ss = 89;
		int ii = 78;
		long ll = 90;
		
		long llresult =bb+ss+ii+ll;
		System.out.println("long-->"+llresult);
		
		//short ssresult = bb+ss;
		int ssresult = bb+ss;
		System.out.println("byte, short의 연산은 모든 항이 int로 형변환 후 연산됨");
		
		
		
		
		
		
		
		
	}

}
