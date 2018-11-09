package proxyBanqueClasses;


public class CreditCard {
	
	public String cardNumber;
	public String expirationDate;
	public int secretCode;
	
	public CreditCard(String cardNumber, String expirationDate, int secretCode) {
		
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.secretCode = secretCode;
		
	}

}
