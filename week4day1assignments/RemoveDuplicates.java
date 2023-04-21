//Declare a String as "PayPal India"


//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
package week4day1assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] ch = str.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			//charSet.add(ch[i]);

			if (!charSet.add(ch[i])) {
				dupCharSet.add(ch[i]);
			}
		}
		System.out.println(charSet);

		System.out.println("Duplicates: " + dupCharSet);

		charSet.removeAll(dupCharSet);
		
		System.out.print("After removing duplicates :");
		for (Character character : charSet) {
			if (character != ' ') {
				System.out.print(character);
		
			
		}
		
			
		}
	}
}


	

