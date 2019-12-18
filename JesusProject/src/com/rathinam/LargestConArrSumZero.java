package com.rathinam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestConArrSumZero {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> A = new ArrayList<Integer>();
		 * 
		 * A.add(1); A.add(2); A.add(-3); A.add(3);
		 * 
		 * System.out.println(new LargestConArrSumZero().lszero(A));
		 */
		/*
		 * Integer [] a= { 2, 11,7, 15 }; System.out.println(new
		 * LargestConArrSumZero().twoSum(Arrays.asList(a), 26));
		 */
		
		
		//new  LargestConArrSumZero().selectionSortAlgorthim();
		
		
		List<Integer> number = Arrays.asList(5,10,20,30,40,50);
		System.out.println(number.stream().mapToInt(Integer :: intValue).sum());;
		System.out.println(number.stream().mapToInt(i->i.intValue()).sum());		
		System.out.println(number.stream().mapToInt(value->value).sum());
		number.stream().forEach(System.out::println);
		
	
		List<String> a = Arrays.asList("caat", "taac", "dog", "god", "acta", "bat");
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
 
		for (int i = 0; i < a.size(); i++) {
			
			/**
			 * Converting String to Char array to sort the same.
			 * Again we are creating a String from Char array so at the end any Anagram string will have unique form.
			 * For Example:
			 * "caat" and "taac" will be formed to "aact" after sorting the array. 
			 */
			char[] c = a.get(i).toCharArray();
			Arrays.sort(c); 
			String t = String.valueOf(c);
			
			//check if key is present than add to the existing group else create new.
			if (map.get(t) == null) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.add(i + 1);
				map.put(t, l);
			} else
				map.get(t).add(i + 1);
		}
		
		// Iterate map to add final result groups to result array.
		for (ArrayList<Integer> l : map.values()) {		
			result.add(l);	
		}
		
		System.out.println(" Result-->"+result);
		
		
		
		
	}

	public ArrayList<Integer> lszero(ArrayList<Integer> A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int k = 0, l = 0, prefixSum = 0;
		map.put(0, -1);
		for (int i = 0; i < A.size(); i++) {
			prefixSum += A.get(i);
			if (map.containsKey(prefixSum)) {
				if (i - map.get(prefixSum) > l - k) {
					k = map.get(prefixSum);
					l = i;
				}
			} else {
				map.put(prefixSum, i);
			}
		}
		for (int i = k + 1; i <= l; i++) {
			result.add(A.get(i));
		}
		return result;
	}
	//{ 2, 7, 11, 15 };
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
		ArrayList<Integer> result = new ArrayList<Integer>(); // result list for index1 and index2
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (A.size() < 2)
			return result;
		for (int i = 0; i < A.size(); i++) {
			if (map.containsKey(A.get(i))) { // Check if number is already present in Map
				result.add(map.get(A.get(i))); // Get index1 from Map entry value.
				result.add(i + 1); // Current index will be index2
				break;
			}
			if (!map.containsKey(B - A.get(i)))
				map.put(B - A.get(i), i + 1); // Insert new entry
		}
		return result;
	}
	
	
	public void selectionSortAlgorthim() {
		int arrayOfUnorderList[] = { 20, 3, 35, 11, 2 };
		
		
		
		
		for(int i=0;i<arrayOfUnorderList.length-1;i++) {
			
			int minindex = i;
			for(int j=i+1;j<arrayOfUnorderList.length;j++) {
				
				if(arrayOfUnorderList[j] < arrayOfUnorderList[minindex]	) {
					minindex = j;
					
				}
				
				int temp = arrayOfUnorderList[minindex];
				arrayOfUnorderList[minindex] =arrayOfUnorderList[i];
				arrayOfUnorderList[i] = temp;
				
				
				
			}
			
		}
		
		for(int res : arrayOfUnorderList) {
			System.out.println(res);
		}
		
		
		
	}

}