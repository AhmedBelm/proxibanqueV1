package proxyBanqueClasses;

public class Customer {
	
	public String name;
	public String lastName;
	public String adress;
	public String postaleCode;
	public String city;
	public String phoneNumber;
	public String quality;
	public String accountNumber;
	public CurrentAccount currentAccount;
	public SavingAccount savingAccount;
	public CreditCard card;
	
	public Customer(String name, String lastName, String adress, String postaleCode, String city, String phoneNumber, String quality, String accountNumber,
			BankAccount bankAccount, CreditCard card) {
		
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.postaleCode = postaleCode;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.quality = quality;
		this.accountNumber = accountNumber;
		this.currentAccount = currentAccount;
		this.savingAccount = savingAccount;
		this.card = card;
	
		
	}

}
