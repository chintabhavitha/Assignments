package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		int creditScore = 720;
		double customerIncome = 50000;
		boolean isEmployed = true;
		String employeeName = "John Doe";
		float debtToIncomeRatio = 35.0f;

		if (creditScore > 750) {
			System.out.println("The loan is automatically approved");

		} else if (creditScore >= 650 && creditScore <= 750) {
			//System.out.println("Additional Checks are Performed because credit score is 720");

			if (customerIncome >= 50000) {
				//System.out.println("The loan to be considered because employee income is at least 50000");

				if (isEmployed) {
					//System.out.println("The customer is employed and loan is considered");

					if (debtToIncomeRatio < 40.0) {
						System.out.println("The loan is Approved");
					} else {
						System.out.println("The loan is denied due to high debt-to-income ratio");
					}

				} else {
					System.out.println("The loan is denied due to employment status");
				}

			} else {
				System.out.println("The loan is denied due to income");
			}

		} else {
			System.out.println("The loan is denied due to credit score");
		}
	}
}
