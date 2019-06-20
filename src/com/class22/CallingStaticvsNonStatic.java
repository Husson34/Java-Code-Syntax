package com.class22;

public class CallingStaticvsNonStatic {

	
	public static void main(String[] args) {
		
		StaticvsNonStatic obj=new StaticvsNonStatic();
		//accessing non static members
		System.out.println(obj.name);
		obj.getInfo();
		
		
		//access static members by using className they belong to
				System.out.println(StaticvsNonStatic.lastName);
				StaticvsNonStatic.getInfo1();
		

	}

}
