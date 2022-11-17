package day3;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int a = sc.nextInt();
		System.out.println("enter the interest percentage");
		int b = sc.nextInt();
		System.out.println("enter the term");// term or month
		int c = sc.nextInt();
		int rate = (a / b) * c;// rate=(principal amount/interest percentage)*years
		System.out.println("rate of interest," + rate);
		int total = a + rate;
		System.out.println("total amount to be paid:" + total);
		int month = total / (c * 12);
		System.out.println("paid per month:" + month);
		for (int i = total; i >= 0;) {
			System.out.println("" + i);
			i = i - month;

		}

	}

}
