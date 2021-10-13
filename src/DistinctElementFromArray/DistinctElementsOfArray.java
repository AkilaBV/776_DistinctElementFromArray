package DistinctElementFromArray;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DistinctElementsOfArray {
	public Set<Integer> distinctElements(int arr[]){
		Set<Integer> set=new HashSet<Integer>();
		if(arr.length!=0) {
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		}
		return set;
		
		
	}
	
	
	@Test
	public void test1() {
		int a[]= {1,2,3,1,2};
		Set<Integer> s= distinctElements(a);
		System.out.println(s + ":"+s.size());
		
	}
	
	@Test
	public void test2() {
		int a[]= {};
		Set<Integer> s= distinctElements(a);
		System.out.println(s + ":"+s.size());
		
	}

}
