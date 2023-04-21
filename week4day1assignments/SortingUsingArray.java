// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems

package week4day1assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingArray {

	public static void main(String[] args) {
		String[] str= {"HCL","Wipro","Aspire Systems","CTS"};
		int length = str.length;
		List<String> list= new ArrayList<String>();
		for (int i = 0; i <length; i++) {
			list.add(str[i]);
		}
		Collections.sort(list);
		for (int i = list.size()-1; i>=0; i--) {
			//for ignoring "," in last value
			if(i!=0) {
			System.out.print(list.get(i)+",");}
			else {
			System.out.println(list.get(i));
}
		}
	}
}


