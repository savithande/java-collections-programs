package com.exa.sapleProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionSingaltonClass {
	
	public static void main(String[] args) {

		String[] str = { "1","2","3","1","4","5","1","6","7","1","8","9"};
		String[] str1 = {"mango","apple","mango","grapes","chikku","mango","banana","pappaya","mango"};
		
		List list = new ArrayList(Arrays.asList(str));
		System.out.println("original list is : " +list);
		
		list.removeAll(Collections.singleton("1"));
		System.out.println("after removing '1' from the list is : ");
		System.out.println(list);
		
		System.out.println();
		List fruits = new ArrayList(Arrays.asList(str1));
		System.out.println("fruits : " + str1);
		
		fruits.removeAll(Collections.singleton("mango"));
		System.out.println("remaining fruits is : "+fruits);
		
		list.removeAll(Collections.singleton("8"));
		System.out.println(list);
	}
}
