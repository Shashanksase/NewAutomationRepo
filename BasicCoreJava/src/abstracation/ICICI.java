package abstracation;

public class ICICI implements RBI{
	@Override
	public void savingAccount() {
		System.out.println("ICICI Saving Acount");
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI Current Acount");
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI DebitCard ");
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI Credit card ");
	}
}
