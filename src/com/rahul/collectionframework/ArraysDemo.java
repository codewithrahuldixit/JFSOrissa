package com.rahul.collectionframework;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
public static void main(String[] args) {
	int arr[] = {1,3,5,6,77,44,33,2,5,34};
	/*System.out.print("Before Sort : ");
	for (int i : arr) {
		System.out.print(" "+i);
	}
	System.out.println("");
	Arrays.sort(arr, 4, 8);
	System.out.print("After Sorting subset : ");
	for (int i : arr) {
		System.out.print(" "+i);
	}
	System.out.println("");
	Arrays.sort(arr);
	System.out.print("After Sort : ");
	for (int i : arr) {
		System.out.print(" "+i);
	}
	*/
	Arrays.stream(arr).filter(y->y%2==1).forEach(System.out::println);
}
}
