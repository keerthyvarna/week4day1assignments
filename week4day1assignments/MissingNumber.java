/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
package week4day1assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = { 1, 4, 3, 3, 2, 5, 8, 7, 9, 10 };
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			ts.add(data[i]);
		}

		List<Integer> list = new ArrayList<Integer>(ts);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != i+1){
				System.out.println(i+1);
				break;
			}
			
		}

		}
	}



