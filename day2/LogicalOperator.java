package day2;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long accountNumber;
int aadharNumber=45672,transactionPin=1234,password=9898;
System.out.println("Enter  acccount holer name");
Scanner sc= new Scanner(System.in);
String accountHolderName = sc.next();
if((accountHolderName.trim()!= null)&&(accountHolderName.length()>3)) {
	System.out.println("Enter account number");
	accountNumber=sc.nextLong();
	System.out.println("Enter aadhar number");
	aadharNumber = sc.nextInt();
	if (aadharNumber==45674) {
	System.out.println("Enter transaction pin and password");
	transactionPin=sc.nextInt();
	password = sc.nextInt();
	}
	if ((transactionPin==1234) || (password==9898)) {
		System.out.println("Successful Transcation");
		}
	else {
		System.out.println("Invalid credentials");
		
		
		
	}

}
	}
}
	


