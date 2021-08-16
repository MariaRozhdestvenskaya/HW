package HW;



import java.util.Scanner;
import java.util.Base64;

public class HomeWork1 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter your first name"); 
		String firstName = sc.nextLine(); 
		String encodedFirstName 
			= Base64.getEncoder().encodeToString(firstName.getBytes()); 
		System.out.println("First name: " + encodedFirstName);
		System.out.println();
		String s = new String (Base64.getDecoder().decode(encodedFirstName));
		System.out.println(s);
		
		System.out.println("Please enter your last name");
		String lastName = sc.nextLine();
		String encodedLastName 
			= Base64.getEncoder().encodeToString(lastName.getBytes());
		System.out.println("Last name: " + encodedLastName);
		sc.close();
		} 
	}

