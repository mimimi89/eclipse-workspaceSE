package lang;

public class StringUseMain {

	public static void main(String[] args) {

		String str1="Have a nice day!!!";
		String str2="오늘은 금요일 회식을 할 거예요!!";
		
		System.out.println("-----------------length---------------------");
		
		int length1=str1.length();
		System.out.println(length1);
		
		int length2=str2.length();
		System.out.println(length2);
		
		System.out.println("자바가 재미있네요!!!".length());
		
		String emptyStr="";
		System.out.println("emptyStr: "+emptyStr.length());
		if(emptyStr.equals("")) {
			System.out.println("empty String입니다.");
		}
		
		/*
		NullPointerException --> null.xxx()
		 */
		
		String id=null;
		if(id==null||id.equals("")) {
			System.out.println("아이디를 입력하세요!");
			
		}
		System.out.println();
		
		System.out.println("-----------------String.substring---------------------");
		/*
		 public String substring(int beginIndex)
		  "unhappy".substring(2) returns "happy"
		 
		 public String substring(int beginIndex, int endIndex)
		 "hamburger".substring(4, 8) returns "urge"
		 */
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println("오늘은 금요일 회식을 할 거예요!!".length());
		System.out.println("오늘은 금요일 회식을 할 거예요!!".substring(0, 10));
		System.out.println();
		
		System.out.println("-----------------String.charAt---------------------");
		String userId="test#00";
		char firstChar=userId.charAt(0);
		System.out.println(firstChar);
		for (int i = 0; i < userId.length(); i++) {
			char tempChar=userId.charAt(i);
			if(tempChar>='a'&&tempChar<='z'||tempChar>='A'&&tempChar<='Z'||tempChar>='0'&&tempChar<='9') {
				System.out.println("아이디로 유효한 문자: "+tempChar);
			}else {
				System.out.println("아이디로 유효하지 않은 문자: "+tempChar);
			}
		}
		
		//퀴즈: 아이디로 적합한지 판단하시오.
		//	-길이가 3-7 사이
		//	-영문, 숫자로만 구성되어야 함
		//	-첫글자가 숫자여서는 안 됨
		// 	String memberId="dfgsdf@#@"
		
		System.out.println("-----------------String.split()---------------------");	//"-"를 기준으로 끊기
		String cardNo="123-4567-9877";
		String[] cardNoArray=cardNo.split("-");	
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(cardNoArray[i]);
		}
		
		System.out.println("-------------String.replace(char, char)--------------");//변경
		String str3="우리는 자바를 공부합니다. 자바는 객체지향언어입니다.";
		String result3=str3.replace('자', '저');
		System.out.println(result3);
		String result4=str3.replace("자바", "파이썬");
		System.out.println(result4);
		String result5=str3.replaceFirst("자바", "파이썬");
		
		System.out.println("-------------String.toUpperCase, toLowerCase--------------");//대문자, 소문자로 바꾸기
		System.out.println("jaVA".toUpperCase());
		System.out.println("jaVA".toLowerCase());
		
		System.out.println("-------------String.equalsIgnoreCase--------------");    //????
		System.out.println("Yes".equalsIgnoreCase("yes"));
		System.out.println("Yes".equalsIgnoreCase("YES"));
		System.out.println("Yes".equalsIgnoreCase("yeS"));
		
		System.out.println("-------------String.indexOf()--------------");    //파일이름 변경
		String fileName="xxx.gif";
		int dotIndex=fileName.indexOf(".");
		System.out.println("dot index: "+dotIndex);
		String fileNameNoExt=fileName.substring(0,dotIndex);
		String fileExt=fileName.substring(dotIndex+1);
		String copyFileName=fileNameNoExt+"-복사본."+fileExt;
		System.out.println(copyFileName);
		
		System.out.println("-------------startWith, endWith--------------");    //with 이후로 시작하거나 끝나면
		String fileName2="yyy.gif";
		if(fileName2.endsWith(".gif")||fileName2.endsWith(".jpg")) {
			System.out.println(fileName2+"는 이미지 파일입니다[gif, jpg]");
			
			}
		
		String[] names= {"김경호", "김미숙", "최경녀", "이은희", "신명숙"};
		int count=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				System.out.println(names[i]+" ");
				count++;
			}
		}
		
		String[] kimArray=new String[count];
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				kimArray[i]=names[i];
				index++;
			}
		}
		System.out.println("kimArray length: "+kimArray.length);
		for (int i = 0; i < kimArray.length; i++) {
			System.out.println(kimArray[i]+" ");
		}
		System.out.println();
		
		System.out.println("-------------trim()--------------");    //좌우공백제거
		String id2=" guard ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		
		String spaceStr="      ";
		if(spaceStr.trim().equals("")) {
			System.out.println("empth string");
		}
		
		
		
		
		
		

	}

}
