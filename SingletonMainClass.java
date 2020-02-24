package com.exa.sapleProjects;

public class SingletonMainClass {

	public static void main(String[] args) {
		Singleton single1 = Singleton.getSingleton();
		Singleton single2 = Singleton.getSingleton();
		Singleton single3 = Singleton.getSingleton();
		
		single2.str = (single2.str).toLowerCase();
		System.out.println("1)" +single2.str);
		
		single3.str = (single1.str).toUpperCase();
		System.out.println("2)" +single3.str);
	}

}
