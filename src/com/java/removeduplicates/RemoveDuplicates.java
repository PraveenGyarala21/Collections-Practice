package com.java.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	
	public static void main(String args[]) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		
		System.out.println(numbers);
		

// Removing the Duplicates from the ArrayList using the LinkedHashSet
		

		LinkedHashSet<Integer> linkedListnumbers = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numberWithOutDuplicates = new ArrayList<Integer>(linkedListnumbers);
		
		System.out.println(numberWithOutDuplicates);
		
		
// Removing the Duplicates from the ArrayList using the JDK-8 Stream.
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
		
		List<Integer> numbers1Unique = numbers1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numbers1Unique);
		
		
		
		
		
		
		
		
		
		
	}

}
