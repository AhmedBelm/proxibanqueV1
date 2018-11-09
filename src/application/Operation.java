package application;


import data.Storage;
import interaction.Interaction;
import proxyBanqueClasses.Advisor;
import proxyBanqueClasses.Agency;
import proxyBanqueClasses.CreditCard;
import proxyBanqueClasses.CurrentAccount;
import proxyBanqueClasses.Customer;
import proxyBanqueClasses.Manager;
import proxyBanqueClasses.SavingAccount;

public class Operation {

	Interaction interaction = new Interaction();
	Storage storage = new Storage();
	
	
	public void wire() {
		
		
		
	}

	
	
	public void loadData() {



        CurrentAccount currentAccount1 = new CurrentAccount("AGHB HSDQ SQDS POSQ 1589 QSDF", -2000 ,"01/01/1990");
        CurrentAccount currentAccount2 = new CurrentAccount("HSDQ SQDS FDSQ 9DSF DSQ9 SKIT", 2340 ,"compte préhistorique");
        CurrentAccount currentAccount3 = new CurrentAccount("SHYE SXYS LSIE SNXU SKJ1 PSOU", 500 ,"07/06/1990");
 
        SavingAccount savingAccount1 = new SavingAccount("SAKL OIDS DSQF 23SD 2312 SQDQ", 15406,"14/02/1999");
        SavingAccount savingAccount2 = new SavingAccount("23SD 2312 SQDQ SAKL OIDS DSQF",94100,"Demain Inchalah Il sera ouvert wallah");
        SavingAccount savingAccount3 = new SavingAccount("SAHY UIUY KIYP UTPA NUYB IKUY",19000,"14/02/1999");
      
        CreditCard creditCard1 = new CreditCard("5489 6325 1876 9635" , "18/09/2021" , 1111);
        CreditCard creditCard2 = new CreditCard("5489 6514 3954 8888" , "01/10/2022" , 1121);
        CreditCard creditCard3 = new CreditCard("5489 5474 1876 9635" , "18/09/2023" , 1451);
        Manager manager1 = new Manager("MANAGER AHMED");

        


                

        

        

        this.storage.agencies.add(new Agency("Agence Malawi","18/12/2018",manager1));

        this.storage.agencies.get(0).advisors.add(new Advisor("Mamadou LECONSEILLER" ));

        this.storage.agencies.get(0).advisors.add(new Advisor("Malouda LACONSEILLERE" ));

        this.storage.agencies.get(0).advisors.get(0).customers.add(new Customer("Ahmed" ,"BEN", "Versailles" , "90000" , "Tanger" , "0658479","entrepeneur","AZAEHAZ AZEJAZEJAZ AZEAZJEJ",currentAccount1,creditCard1));

        this.storage.agencies.get(0).advisors.get(0).customers.add(new Customer("Mohamed", "CHAY BINAENAE" ,"Chatillon", "12000" , "Paris", "06 00 01 02 03" , "particulier" ,"AZLAKA SQDKIZU KSDQIUA", currentAccount2,creditCard2 ));

//        storage1.agencies.get(0).advisors.get(0).customers.add(new Customer("hmido LKETT " , 99000 , "03 45 25 20 36" , "511515" , savingAccount1));
//
//        storage1.agencies.get(0).advisors.get(1).customers.add(new Customer("mohamed LKiiiTT " , 92115 , "04 08 09 02 02" , "511515" , savingAccount2 ));
//
//        storage1.agencies.get(0).advisors.get(1).customers.add(new Customer("hmido LKAKAT " , 58280 , "01 01 01 01 01" , "511515" , savingAccount3));
//
//        storage1.agencies.get(0).advisors.get(1).customers.add(new Customer("sameul SUMUAKL " , 64668 , "06 23 03 25 41" , "511515" , currentAccount3));

                System.out.println("Le numéro de compte : "+this.storage.agencies.get(0).advisors.get(0).customers.get(0).accountNumber
                		+"correspend à monsieur"+this.storage.agencies.get(0).advisors.get(0).customers.get(0).name+" "+storage.agencies.get(0).advisors.get(0).customers.get(0).lastName);

    }
	
	
	public void createCustomer() {
		
		
		
		
		
		this.interaction.display("Veuillez entrer son nom");
		String name = interaction.readData();
		
		this.interaction.display("Veuillez entrer son prénom");
		String firstname = interaction.readData();
		
		this.interaction.display("Veuillez entrer son adresse");
		String adress = interaction.readData();
		
		this.interaction.display("Veuillez entrer son code postale");
		String postaleCode = interaction.readData();
		
		this.interaction.display("Veuillez entrer sa ville");
		String city = interaction.readData();

		
		this.interaction.display("Veuillez entrer son numéro de téléphone");
		String phone = interaction.readData();
		
		// LocalDate localDate = LocalDate.now();
		
		
		CurrentAccount currentAccount = new CurrentAccount("021415987418698487", 0.0, "09/11/2018");
		SavingAccount savingAccount = new SavingAccount("021415987418698487", 0.0, "09/11/2018");
		CreditCard creditCard = new CreditCard("5131421045", "12/01", 2512);
		

		Customer newCustomer = new Customer(name, firstname, adress, postaleCode, city, phone, "az ", " az", currentAccount, creditCard);
		this.storage.agencies.get(0).advisors.get(0).customers.add(newCustomer);
		
		System.out.println("Le nouveau client a été rajouté avec succés. ");
		
		
		
	}
	
	
	public void manageCustomer() {
		int i = 0;
		
		System.out.println("Quel client voulez-vous modifier? ");
		for(Customer customer : this.storage.agencies.get(0).advisors.get(0).customers) {
			
			System.out.println((i + 1) + " - " + this.storage.agencies.get(0).advisors.get(0).customers.get(i).name);
			i ++;
		}
		
	
		
	}
	
	
	public void start() {
		
		
		this.loadData();
		this.createCustomer();
		this.manageCustomer();
		
		
	}
	
}


