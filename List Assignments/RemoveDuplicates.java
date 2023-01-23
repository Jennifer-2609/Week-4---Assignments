package week4Assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String text="We learn java basics as part of java sessions in java week1";
		String[] textnew = text.split(" ");
		
		List<String> lst=new ArrayList<String>();
		for (int i = 0; i < textnew.length; i++) {
			lst.add(textnew[i]);
		}
		System.out.println(lst);
		
		Collections.sort(lst);
		for (int i = 0; i < lst.size()-1; i++) {
			if(lst.get(i).equals(lst.get(i+1))){
				System.out.println(lst.get(i));
			}
		}
	}
}


/*
* Pseudo code 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 * g) Displaying the String without duplicate words	
 */
/*
for (int i = 0; i < lst.size(); i++) {
for (int j = i+1; j < lst.size(); j++) {
	if(lst.get(i)==lst.get(j)) {
	System.out.println(lst.get(i));
			}
		}
	}
 */