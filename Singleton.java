package com.exa.sapleProjects;

public class Singleton {
	
	private static Singleton singleton_instance;
	
	String str = " ";
	
	private Singleton() {
		
		str = " this is singleton class";
	}
	
	public static Singleton getSingleton() {
		
		if(singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
}
