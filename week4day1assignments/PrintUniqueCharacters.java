//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
package week4day1assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
	String Name ="Keerthana";
	char[] ch = Name.toCharArray();
	Set<Character> s= new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		s.add(ch[i]);
		System.out.println(s);
		
	}
	//for (Character character : s) {
		//System.out.print(character);
	//}
	

	}

}
