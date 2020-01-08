package com;

import java.util.Scanner;

public class Sum {
	public int addNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fisrt no :");
		int i = sc.nextInt();
		System.out.println("Enter the second no :");
		int j = sc.nextInt();
		return i+j;
	}
}
