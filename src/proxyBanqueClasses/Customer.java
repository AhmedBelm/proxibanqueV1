package proxyBanqueClasses;

public class Customer {
	
	public String lastName;
	public int postaleCode;
	public int phoneNumber;
	public boolean quality;
	public int accountNumber;
	public CurrentAccount currentAccount;
	public SavingAccount savingAccount;
	public CreditCard card;
	
	public Customer(String lastName, int postaleCode, int phoneNumber, boolean quality, int accountNumber,
			CurrentAccount currentAccount, SavingAccount savingAccount, CreditCard card) {
		this.lastName = lastName;
		this.postaleCode = postaleCode;
		this.phoneNumber = phoneNumber;
		this.quality = quality;
		this.accountNumber = accountNumber;
		this.currentAccount = currentAccount;
		this.savingAccount = savingAccount;
		this.card = card;
	
		
	}

}
