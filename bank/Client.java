package HW.bank;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Client {
	
	static 	Map<Integer, Client> clients = new HashMap<Integer, Client>();
	
	static int num = 1; 
	private Integer clientID = 1;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String fullName;
	private Set <Account> accounts;
		
	Client(String fname, String lname, LocalDate bDay) {
		clientID = num++;
		firstName = fname;
		lastName = lname;
		fullName = fname + " " + lastName;
		birthDate = bDay;	
		accounts = new HashSet<>();
		clients.put(clientID, this);
			
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
	public void showName() {
		System.out.println(fullName);
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
	public static void showClientInfo (Account x) {
		clients.get(x.getClientID()).showName();
		clients.get(x.getClientID()).showAccounts();
		}
	

}

