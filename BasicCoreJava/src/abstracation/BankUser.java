package abstracation;

public class BankUser {

	public static void main(String[] args) {

		RBI bank1 = new HDFC();
		bank1.creditCard();
		bank1.currentAccount();
		bank1.debitCard();
		bank1.savingAccount();
		
		
		bank1 = new SBI();
		bank1.creditCard();
		bank1.currentAccount();
		bank1.debitCard();
		bank1.savingAccount();
		
		bank1 = new ICICI();
		bank1.creditCard();
		bank1.currentAccount();
		bank1.debitCard();
		bank1.savingAccount();
	}

}
