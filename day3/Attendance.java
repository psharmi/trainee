package day3;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("No of classes to held");
		int i=sc.nextInt();
		System.out.println("No of classes to attented");
		int j=sc.nextInt();
		float ij;
		ij=(j*100)/i;
		if(ij>=75) {
			System.out.println("Allowed to attend the exam:"+j);}
			else
			{
				System.out.println("Not allowed to attend the exam :"+j);}
	}
}
	
			
			
		
		
		

	

