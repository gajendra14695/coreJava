package com.ustglobal.maps;

import java.util.HashMap;

public class Testmap1A {
	 	public static void main(String[] args) {
			
	 		HashMap hm = new HashMap();
	 		
	 		hm.put("kuku", 998014);
	 		hm.put("mala", 676014);
	 		hm.put("sheela", 9038014);
	 		hm.put(null, 987890);
	 		System.out.println("Data is "+hm);
	 		hm.put("mala", 123456);
	 		System.out.println("After Modify is "+hm);
	 		
	 		System.out.println("=================================================");
	 		
	 		hm.put("dimple", 457689);
	 		System.out.println("After Dimple "+hm);
	 		
	 		System.out.println("=================================================");
	 		hm.put(null, 457679);
	 		
	 		System.out.println("After Null "+hm);
	 		
	 		System.out.println("=================================================");
	 		
	 		Object phonenumber =hm.get("sheela");
	 		System.out.println("Value "+phonenumber);
	 		
	 		Object phonenumbe =hm.get("sheel");
	 		System.out.println("Value "+phonenumbe);
	 		
	 		System.out.println("=================================================");
	 		
	 		Object value =hm.remove("sheela");
	 		System.out.println("--------->"+value);
	 		
	 		
		}
}
