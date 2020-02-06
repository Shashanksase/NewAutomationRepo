package abstracation;

public class HDFC implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("HDFC Saving Acount");
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC Current Acount");
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC DebitCard ");
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC Credit card ");
	}

}
