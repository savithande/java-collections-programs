package com.exa.sapleProjects;

import java.util.Scanner;

public class MultiplayNumbers {
	
	public static void sumOfNumbers(int n) {
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				if(true) {
					sum = sum + i;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		int q = scan.nextInt();
		double s = scan.nextDouble();
		
		sumOfNumbers(n);
		sumOfNumbers(p);
		sumOfNumbers(q);

		
	}

}
