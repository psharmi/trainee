package day3;
import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your purchase Quantity");
		int  Quantity=sc.nextInt();
		if(Quantity>1000) {
		System.out.println("total cost=" +(Quantity-(Quantity/100*10)));
		}
		else {
			System.out.println("total cost="+Quantity);
		}
	}
}

