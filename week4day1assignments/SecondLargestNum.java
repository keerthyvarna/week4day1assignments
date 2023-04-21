// Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */

package week4day1assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> s=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			s.add(num[i]);
		//	System.out.println(s);
			//break;
			
		} 
			
		List<Integer> n=new ArrayList<Integer>(s);
		for (int i = 0; i < n.size()-1; i++) {
			System.out.println(n.get(n.size()-2));
			break;
			
		}
			
		}
		
		
			
			
		
		
		

	}


