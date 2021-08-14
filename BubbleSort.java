package HW;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 6, -5, 7, 87364));
		nums.add(-398);
		nums.add(72643);
		
		System.out.print ("The array to sort: ");
		show(nums);
		
		System.out.print ("From min to max: ");
		bubbleSortMinMax(nums);
		show(nums);
		
		System.out.print ("From max to min: ");
		bubbleSortMaxMin(nums);
		show(nums);
		
		System.out.print ("Sorted with 'sort' method: ");
		nums.sort(Comparator.naturalOrder());
		show(nums);
		
	}
	
	static void show(ArrayList<Integer> x) {
		for (Integer i: x) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void bubbleSortMinMax(ArrayList<Integer> x) {
		for (int a = 1; a < x.size(); a++) 
			for (int b = x.size()-1; b >= a; b--) {
				if (x.get(b-1) > x.get(b)) {
					int t = x.get(b-1);
					x.set(b-1, x.get(b));
					x.set(b, t);
			}
		}
	}
	
	static void bubbleSortMaxMin(ArrayList<Integer> x) {
		for (int a = 1; a < x.size(); a++) 
			for (int b = x.size()-1; b >= a; b--) {
				if (x.get(b-1) < x.get(b)) {
					int t = x.get(b-1);
					x.set(b-1, x.get(b));
					x.set(b, t);
			}
		}
	}

}
