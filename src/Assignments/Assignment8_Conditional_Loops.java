package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_Conditional_Loops {

	public static void main(String[] args) {

		List<Integer> transaction = new ArrayList<Integer>();
		transaction.add(50000);
		transaction.add(3000);
		transaction.add(4000);
		transaction.add(-2000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(-3000);

		System.out.println("1. The total Number of transactions are " + transaction.size());
//
//		int sumOfCredit = 0;
//		for (Integer i : transaction) {
//			if (i > 0) {
//				sumOfCredit += i;
//			}
//		}
//		System.out.println("2. The total amount of credited transaction is " + sumOfCredit);
//
//		int sumOfDebit = 0;
//		for (Integer j : transaction) {
//			if (j < 0) {
//				sumOfDebit += j;
//			}
//		}
//		System.out.println("2. The total amount of debited transaction is " + sumOfDebit);
		
		int sumOfCredit = 0; 
		int sumOfDebit = 0;
		
		for(Integer i:transaction) {
			if(i>0) {
				sumOfCredit += i;
			}
			else {
				sumOfDebit += i;
			}
//			if(i>10000 || i<-10000) {
//				System.out.println("4. Suspicious credit/ debit Transaction with Amount are " + i);
//			}
		}
		System.out.println("2. The total amount of credited transaction is " + sumOfCredit + "\n" + "   The total amount of debited transaction is  " + sumOfDebit );
		
		int remaining = sumOfCredit + sumOfDebit;
		System.out.println("3. The total amount remaining at the end in Bank Account is " + remaining);

		for (Integer k : transaction) {
			if (k > 10000 || k < -10000) {
				System.out.println("4. Suspicious credit/ debit Transaction with Amount are " + k);

			}
		}

		

		
	}

}
