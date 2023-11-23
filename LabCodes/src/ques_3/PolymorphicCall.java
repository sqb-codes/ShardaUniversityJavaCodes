package ques_3;

class Loan {
	void emi() {
		System.out.println("EMI Function...");
	}
	void roi() {
		System.out.println("Default ROI of bank is 8.00%");
	}
	void tenure() {
		System.out.println("Minimum tenure is 12 months...");
	}
}

class HomeLoan extends Loan {
	@Override
	void roi() {
		System.out.println("ROI for HomeLoan is 8.50%");
	}
	void eligible(double salary) {
		if(salary > 50000) {
			System.out.println("Eligible for Home Loan");
		}
		else {
			System.out.println("Not eligible for Home Loan");
		}
	}
}

class EduLoan extends Loan {
	@Override
	void tenure() {
		System.out.println("Minimum tenure is 24 months...");
	}
	
	void verifyMarks(double percentage) {
		if(percentage > 80) {
			System.out.println("Eligible for loan upto 10 Lac");
		}
		else {
			System.out.println("Eligible for loan upto 7 Lac");
		}
	}
}

public class PolymorphicCall {
	
	void caller(Loan loan) {
		loan.roi();
		loan.emi();
		loan.tenure();
		// Downcasting - we type cast the data type of object back to child class
		if(loan instanceof HomeLoan) {
			HomeLoan homeLoan = (HomeLoan) loan;
			homeLoan.eligible(45000);
		}
		if(loan instanceof EduLoan) {
			EduLoan eduLoan = (EduLoan) loan;
			eduLoan.verifyMarks(70.00);
		}
	}

	public static void main(String[] args) {
		
		// UpCasting - Object is of child class but data type of object is parent class
		//Loan loan = new HomeLoan();
		
		PolymorphicCall obj = new PolymorphicCall();
		obj.caller(new HomeLoan());
		obj.caller(new EduLoan());

		
//		HomeLoan homeLoan = new HomeLoan();
//		homeLoan.emi(); // Parent class - Loan
//		homeLoan.roi(); // Child Class - HomeLoan
//		homeLoan.tenure(); // Parent Class - Loan
//		homeLoan.eligible(45000.00); // Child Class
//		
//		System.out.println("=================");
//		
//		EduLoan eduLoan = new EduLoan();
//		eduLoan.emi();
//		eduLoan.roi();
//		eduLoan.tenure();
//		eduLoan.verifyMarks(70.00);

	}

}
