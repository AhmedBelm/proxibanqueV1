package proxyBanqueClasses;

import java.util.ArrayList;
import java.util.List;

public class Agency {
	
	public String idNumber;
	public String dateAgency;
	public List<Advisor> advisors;
	public Manager manager;
	
	
	public Agency(String idNumber,String dateAgency,Manager manager) {
		this.idNumber = idNumber;
		this.dateAgency = dateAgency;
		this.advisors = new ArrayList<Advisor>();
		this.manager = manager;
		
		
	}
	

}
