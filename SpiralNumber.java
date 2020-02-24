package com.exa.sapleProjects;

public class SpiralNumber {
	public static void main(String[] args) {
		
		int num = 1;
		for(int i = 0; i < 5; i++) {
			 if(i % 2 == 0) {
				 for(int j = 0; j < 5;j++) {
					 System.out.print(num+" ");
					 num++;
				 }
				 System.out.println();
			 }
			 else {
				 num += 4;
				 for(int j = 0; j < 5;j++) {
					 System.out.print(num+" ");
					 num--;
				 }
				 num += 6;
				 System.out.println();
			 }
			 
		}
	}
 
}
