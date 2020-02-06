package abstracation;

public class SBI  implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("SBI Saving Acount");
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI Current Acount");
	}

	@Override
	public void debitCard() {
		System.out.println("SBI DebitCard ");
	}

	@Override
	public void creditCard() {
		System.out.println("SBI Credit card ");
	}
}
