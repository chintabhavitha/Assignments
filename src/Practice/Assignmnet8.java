package Practice;

public class Assignmnet8 {

	public static void main(String[] args) {

		int[] transaction = new int[8];
		transaction[0] = 50000;
		transaction[1] = 3000;
		transaction[2] = 4000;
		transaction[3] = -2000;
		transaction[4] = -15000;
		transaction[5] = -200;
		transaction[6] = -300;
		transaction[7] = -3000;

		System.out.println(transaction.length);

		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;
		int totalCredits = 0;
		int totalDebits = 0;

//		for (int amount : transaction) {
//			if (amount > 0) {
//				totalCredits++;
//				totalCreditAmount += amount;
//
//				if (amount > 10000) {
//					System.out.println("Suspicious credit transactions are " + amount);
//					suspiciousTransactions++;
//				}
//			} else {
//				totalDebits++;
//				totalDebitAmount += Math.abs(amount);
//
//				if (amount < -10000) {
//					System.out.println("Suspicious debit transactions " + amount);
//					suspiciousTransactions++;
//				}
//			}
//
//		}
		
		for(int i = 0; i<transaction.length; i++) {
			int amount = transaction[i];
			if(amount>0) {
				totalCredits++;
				totalCreditAmount += amount;
				
				if(amount > 10000) {
					System.out.println("the suspicious credit transactions are " +amount);
					suspiciousTransactions++;
				}
			}
			else {
				totalDebits++;
				totalDebitAmount += amount;
				
				if(amount<-10000) {
					System.out.println("the suspicious credit transactions are " +amount);
					suspiciousTransactions++;
					
				}
			}
		}
		
		int finalAmount = totalCreditAmount + totalDebitAmount;

		System.out.println("total credited amount " + totalCreditAmount);
		System.out.println("total debited amount " + totalDebitAmount);
		System.out.println("total credits " + totalCredits);
		System.out.println("total debits " + totalDebits);
		System.out.println("final amount " + finalAmount);
		System.out.println("total suspicious transactions " + suspiciousTransactions );
		

	}

}
