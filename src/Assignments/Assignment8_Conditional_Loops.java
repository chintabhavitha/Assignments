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

		System.out.println("The total Number of transactions are " + transaction.size());
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
		int totalCredits = 0;
		int totalDebits = 0;
		int suspiciousTransactions = 0;

		for (Integer i : transaction) {
			if (i > 0) {
				totalCredits++;
				sumOfCredit += i;

				if (i > 10000) {
					System.out.println("Suspicious credit transaction " + i);
					suspiciousTransactions++;
				}
			} else {
				totalDebits++;
				sumOfDebit += i;

				if (i < -10000) {
					System.out.println("Suspicious debit transaction " + i);
					suspiciousTransactions++;

				}
//			if(i>10000 || i<-10000) {
//				System.out.println("4. Suspicious credit/ debit Transaction with Amount are " + i);
//			}
			}
		}
		int remaining = sumOfCredit + sumOfDebit;
		System.out.println("Total no. of credits are " + totalCredits);
		System.out.println("Total no. of debits are " + totalDebits);
		System.out.println("The total amount remaining at the end in Bank Account is " + remaining);
		System.out.println(
				"The total credited amount is " + sumOfCredit + "\n" + "The total debited amount is  " + sumOfDebit);
		System.out.println("Total Suspicious transactions are " + suspiciousTransactions);

//		for (Integer k : transaction) {
//			if (k > 10000 || k < -10000) {
//				System.out.println("4. Suspicious credit/ debit Transaction with Amount are " + k);

	}
}
