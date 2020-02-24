package com.exa.sapleProjects;

public class MyStack {
	
	private static final int size = 3;
	String[] str = new String[size];
	 int top = -1;
	
	public void pushElement(String pushedElement) {
		
		if(top < size - 1) {
			++top;
			str[top] = pushedElement; 
			System.out.print(str[top] + " ");
		}
		else {
			System.out.println("stack overloading!");
		}
	}
	
	public String popElement( ) {
		if(top >= 0) {
			top--;
			printElements();
		}
		else {
			System.out.println("stack underflow!");
		}
		return str[top];
	}
	
	public void printElements() {
		if(top >= 0) {
			System.out.println();
			for (int i = 0; i <= top; i++) {
				System.out.print(str[i] +" ");
			}
		}	
	}
}
