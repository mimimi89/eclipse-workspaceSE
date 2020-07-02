package com.itwill.인터페이스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 인터페이스Main {

	public static void main(String[] args) {
		
		InterfaceChildAImpl icai=new InterfaceChildAImpl();
		InterfaceChildA ica=icai;
		InterfaceSuper is=icai;
		
		ArrayList  arrayList=new ArrayList();
		List  list= arrayList;
		Collection col=arrayList;
		
		HashSet  hashSet=new HashSet();
		Set set=hashSet;	
		Collection col2=hashSet;
		
		
		
		

	}

}
