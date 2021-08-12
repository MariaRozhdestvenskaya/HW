import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 6, -5, 7, 87364));
		
		int a, b, t;
		
		System.out.print ("The array to sort: ");
		for (int i = 0; i < nums.size(); i++)
			System.out.print (" "+ nums.get(i));
		System.out.println ();
		
		for (a = 1; a < nums.size(); a++) 
			for (b = nums.size()-1; b >= a; b--) {
				if (nums.get(b-1) > nums.get(b)) {
					t = nums.get(b-1);
					nums.set(b-1, nums.get(b));
					nums.set(b, t);
			}
		}
		
		System.out.print ("From min to max: ");
		for (int i = 0; i < nums.size(); i++)
			System.out.print (" " + nums.get(i));
		System.out.println ();
		
		for (a = 1; a < nums.size(); a++) 
			for (b = nums.size()-1; b >= a; b--) {
				if (nums.get(b-1) < nums.get(b)) {
					t = nums.get(b-1);
					nums.set(b-1, nums.get(b));
					nums.set(b, t);
			}
		}
		
		System.out.print ("From max to min: ");
		for (int i = 0; i < nums.size(); i++)
			System.out.print (" " + nums.get(i));
		System.out.println ();
		
		nums.sort(null);
		
		System.out.print ("Sorted with 'sort' method: ");
		for (int i = 0; i < nums.size(); i++)
			System.out.print (" " + nums.get(i));
		System.out.println ();
		

	}

}
