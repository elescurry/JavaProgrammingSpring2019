package day19_Transactions;
import java.util.*;

public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		 
		
		while (balance > 0) {
			count++; //increase transaction by 1
			System.out.println("What is transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
			// balance = balance - transaction
			//if(transaction > balance) {
			//System.out.println("Your balance is about to be negative due to this transaction);
			balance -= transaction;
		}
		System.out.println("You have insufficient funds for anymore transactions,your balance is: "+balance);
		}
	}
		
	


