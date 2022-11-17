package day2;

import java.util.Scanner;
public class CallTest {
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Call call = new  Call();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 3 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			call.a=num1;
			call.b=num2;
		    call.c=num3;
			System.out.println("Sum of 3 numbers is"+(num1+num2+num3));
			System.out.println(num1+num2+num3);
			
			

		}

	}



