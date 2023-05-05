package com.vmstate.list.arraylist;

import java.util.ArrayList;

public class CommonArrayListOperations 
{
	public static void main(String[] arg)
	{
			// Declaring an ArrayList with an initial size
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>(5);

			// Declaring a second ArrayList
			ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
			
			// Printing the ArrayList
			System.out.println("Array 1:"+arrayList1);
			System.out.println("Array 2:"+arrayList2);
				
			// Adding new elements at
			// the end of the list
			for (int i = 1; i <= 5; i++)
			{
				arrayList1.add(i);
				arrayList2.add(i);
			}
			
			// Printing the ArrayList
			System.out.println("Array 1:"+arrayList1);
			System.out.println("Array 2:"+arrayList2);
			
			//Removing element at a particular index
			arrayList1.remove(3);
			arrayList2.remove(2);
			
			// Printing the ArrayList after removing element
			System.out.println("Array 1:"+arrayList1);
			System.out.println("Array 2:"+arrayList2);
			
			//Accessing elements from ArrayList
			System.out.println("Element at index 1 of Array 1:"+arrayList1.get(1));
			System.out.println("Element at index 3 of Array 2:"+arrayList2.get(3));
	}

}
