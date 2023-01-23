package week4Assigments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

public static void main(String[] args) {
		
		int[] num= {3,2,11,4,6,7};
		int[] nums= {1,2,8,4,9,7};
		
		List<Integer> lst=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			lst.add(num[i]);
		}
		
		List<Integer> lst1=new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			lst1.add(nums[i]);
		}
		System.out.println(lst);
		System.out.println(lst1);
		
		for (int i = 0; i < lst.size(); i++) {
			for (int j = 0; j < lst1.size(); j++) {
				if(lst.get(i)==lst1.get(j)) {
					System.out.print(lst.get(i));
				}
			}
			
		}
	

	}

}


/*
 * Pseudo Code
 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 *  f) Print the first array (shoud match item in both arrays)
 */