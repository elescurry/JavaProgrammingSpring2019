package day19_Transactions;

public class DoWhileRunOnce {

	public static void main(String[] args) {
		//in this example, do while loop code will run once then test the condition, then exit the loop 
		//as condition is false
		int count = 10;
		do {
			System.out.println("Count: "+count);
			count++;
			
		}while(count <=5);

	}

}
