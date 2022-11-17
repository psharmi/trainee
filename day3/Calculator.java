package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();

		System.out.println("enter the operation that you want to perform :");
		char s = sc.next().charAt(0);
		switch(s) {
		
		case '+':
			 {
			c = a + b;
			System.out.println(c);
		} case'-': {
			c = a - b;
			System.out.println(c);
		} case '*': {
			c = a * b;
			System.out.println(c);

		} case '%':{
			c = a % b;
			System.out.println(c);
		}
	}
	}
}
