package Pyramid;
import java.util.*;

public class DuplicateElements {
	public static void main(String[] args) {
		//declare and initialize array
		int[] arr= {1,1,2,3,4,4,5,6,};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//check if two elements are equal and not the same element
				if((arr[i]==arr[j])&&(i!=j)) {
					System.out.println("Duplicate number:"+arr[j]);
				}
			}
		}
	}

}
/*
Duplicate number:1
Duplicate number:4
*/