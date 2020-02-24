package com.exa.sapleProjects;

import java.util.HashSet;
import java.util.Iterator;

public class HashTest {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("abc");
		hs1.add("def");
		hs1.add("ghi");
		hs1.add("abc");
		hs1.add("def");
		
		Iterator<String> i = hs1.iterator();
		 while(i.hasNext() == true) {
			 System.out.println(i.next());
		 }
		 System.out.println();
		 hs1.remove("abc");
		 System.out.println(hs1);
		 
	}

}
