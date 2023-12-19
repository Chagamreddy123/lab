package Pyramid;
import java.util.*;
import java.io.*;

public class pyramid {


	public static void main(String[] args) {
	    int rows=5;
	    int num=1;
	    for(int i=1;i<=rows;i++)
	    {
	    	// print spaces
	        for(int j=i;j<rows;j++)
	        {
	            System.out.print(" ");
	            
	        }
	        //print number for each level
	        for (int k=1;k<=i;k++)
	        {
	            System.out.printf("%-3d",num);
	            num++;
	        }
	        //move to the next line for the next row
	        System.out.println();
	    }
	
	}

}
	

/*
    1  
   2  3  
  4  5  6  
 7  8  9  10 
11 12 13 14 15 
*/
