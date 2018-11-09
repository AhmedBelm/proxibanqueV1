package proxyBanqueClasses;

import java.util.ArrayList;
import java.util.List;

public class Advisor {
	
	public String idAdvisor;
	public List<Customer> customers;
	
	public Advisor(String idAdvisor) {
		
		this.idAdvisor = idAdvisor;
		this.customers = new ArrayList<Customer>();
		
	}

}
