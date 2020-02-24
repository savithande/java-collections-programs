package com.exa.sapleProjects;

public class StackTest {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		//adding the element to the stack
		ms.pushElement("hello");
		ms.pushElement("hii");
		ms.pushElement("India");
		
		//deleting or removing the element from the stack
		ms.popElement();
		ms.popElement();
	}

}
