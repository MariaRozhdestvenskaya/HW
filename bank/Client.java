package HW.bank;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Client {
	
	static 	Map<Client, Client> clients = new HashMap<Client, Client>();
	
	static int num; 
	private int clientID = 1;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String fullName = firstName + lastName;
	private Set <Account> accounts;
		
	Client(String fname, String lname, LocalDate bDay) {
		clientID = num++;
		firstName = fname;
		lastName = lname;
		birthDate = bDay;	
		accounts = new HashSet<>();
		clients.put(this, this);
			
	}
	
	public boolean isAdult() {
		LocalDate now = LocalDate.now();
		if (Period.between(now, birthDate).getYears() >= 18) {
			return true;
		} else {
			return false;
		}
	}	
	public int getClientID () {
		return clientID;
	}	
	public String getName() {
		return fullName;
	}
	public void addAccount(Account x) {
		accounts.add(x);
	}
	@Override
	public int hashCode() {
		return clientID;
	}
	public void showAccounts() {
		for (Account x: accounts) {
			x.showAccount();
		}
		System.out.println();
	}
	

}

