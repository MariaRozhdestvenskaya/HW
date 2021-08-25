package HW.bank;

import java.time.LocalDate;
import java.time.Month;

public class Bank {

	public static void main(String[] args) {
		
		Client c001 = new Client("Ivan", "Ivanov", LocalDate.of(2005, Month.APRIL, 28));
		Client c002 = new Client("Lena", "Mitina", LocalDate.of(1978, Month.JANUARY, 14));
		Client c003 = new Client("Petr", "Petrov", LocalDate.of(1984, Month.OCTOBER, 22));
		
		Account a001 = new Account(c001);
		Account a002 = new Account(c001);
		Account a003 = new Account(c002);
		Account a004 = new Account(c002);
		Account a005 = new Account(c003);
		Account a006 = new Account(c003);
		
		a001.changeTotal(3800);
		
		
		c001.showAccounts();
		c002.showAccounts();
		c003.showAccounts();
		
		Client.showClientInfo(a005);
		
		
		
		
		



	}

}
