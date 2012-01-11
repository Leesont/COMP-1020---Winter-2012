

import java.io.*;
import java.math.*;


public class Lookup {
	public static void main(String args[])
	{
			
		
		long start;
		int i;
		
		final int max = 10000000;

		int [] list = new int[max];  //get the data and place in list1
		
		int tempLookupValue;
		
		for (i = 0; i < list.length; i++)
			//list[i] = (int)(Math.random()*1000000);
			list[i] = i+1;
		
	
		final int n = 1000;
			
		//iterate once for each sample
		
		for (i = 0; i < n; i++)
		{
			start = System.currentTimeMillis();

			tempLookupValue = -1;
			linearSearch(list, tempLookupValue);
						 
			start = System.currentTimeMillis();
			binarySearch(list, tempLookupValue);
		
		}   	
		System.out.println("Done");
	}
	
	public static int linearSearch(int[] list, int element)
	{
		int counter;
		int result;
		
		//linear search of an ordered list
		result = -1;
		for (counter=0; counter<list.length && result==-1 && element>=list[counter]; counter++)
		{
			if (list[counter] == element)
			{
				result = counter;
			}
		}
		return result;
	}
	
		
	public static int binarySearch(int[] list, int element)
	{	//binary search of an ordered list
		int left;
		int right;
		int middle;
		int result;
		int middleElement;
		
		result = -1;
		left = 0;
		right = list.length-1;
		
		while ((left <= right) && (result == -1))
		{
			middle = (left + right) / 2;
			middleElement = list[middle];
			if (middleElement == element)
			{
				result = middle;
			}
			else if (middleElement < element)
			{
				left = middle + 1;
			}
			else if (middleElement > element)
			{
				right = middle - 1;
			}
		}
		return result;
	}
	
}
