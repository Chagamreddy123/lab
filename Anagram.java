package Pyramid;
import java.util.*;


public class Anagram {
	public static void main(String[] args) {
		//create object of Scanner class
		Scanner sc=new Scanner(System.in);
		//take input from user
		System.out.println("Enter  string:");
		String str1=sc.nextLine();
		System.out.println("enter another string:");
		String str2=sc.nextLine();
		//check if length same
		if(str1.length()==str2.length()) {
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			//sorting the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean result=Arrays.equals(arr1, arr2);
			if(result) {
				System.out.println(" anagram");
			}
			else {
				System.out.println("not an anagram");
				
			}
		}
		else {
				System.out.println("not an anagram");
			}
			
		}
	}


/*
Enter  string:
car
enter another string:
dog
not an anagram
*/


