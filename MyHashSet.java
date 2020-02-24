package com.exa.sapleProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyHashSet {
	
	String arr1 = " ";
	
	public static void add(List<String> list) {
		
		for(String str :  list) {
			System.out.println("https://" + str.toUpperCase() + "/" + "ru" + "." + "com" );
		}
	}
	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("apple","Mango","grapes","chikku");
		
		String str1 = " ";  
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array List :");
		ArrayList<String> str = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			str1 = scan.nextLine();
			str.add(str1);
		}
		add(str);
 	}
}
