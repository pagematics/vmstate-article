package com.vmstate.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonArrayListOperations 
{
	public static void main(String[] arg)
	{
			// Declaring an ArrayList with an initial size
			List<Integer> arrayList = new ArrayList<Integer>(15);

			
			// Printing the ArrayList
			System.out.println("Array:"+arrayList);
				
			// Adding new elements at the end of the list
			for (int i = 1; i <= 12; i++)
			{
				arrayList.add(i);
			}
			
			// Printing the ArrayList
			System.out.println("Array:"+arrayList);
			
			//Removing element at a particular index
			arrayList.remove(3);
			
			// Insert an element at a particular index
			arrayList.add(3, 345);
			System.out.println("ArrayList after removing element 3 and inserting element 345: "+arrayList);
			
			//Accessing elements from ArrayList
			System.out.println("Element at index 1 of Array:"+arrayList.get(1));
			
			//Search for an element in the list
			System.out.println("Is the ArrayList contains 1:"+arrayList.contains(1));
			System.out.println("Is the ArrayList contains 125:"+arrayList.contains(125));
			
			//Sort elements in the ArrayList in ascending order
			Collections.sort(arrayList);
			System.out.println("Sorted List:"+arrayList);
			
			//inserting an element at a specific index of the list
			arrayList.add(1, 232);
			System.out.println("Unsorted List:"+arrayList);
			
			//Sort elements in the ArrayList in ascending order without using sort method
			for (int i = 0; i < arrayList.size(); i++) 
			{
		          for (int j = arrayList.size() - 1; j > i; j--) 
		          {
		              if (arrayList.get(i) > arrayList.get(j)) 
		              {
		                  int tmp = arrayList.get(i);
		                  arrayList.set(i,arrayList.get(j)) ;
		                  arrayList.set(j,tmp);
		              }
		          }
			}
			System.out.println("Sorted List:"+arrayList);
			
			//Adding null element to the list
			arrayList.add(null);
			System.out.println("ArrayList after null element:"+arrayList);
			
			//Adding duplicate elements to the list
			arrayList.add(2);
			arrayList.add(345);
			System.out.println("ArrayList after adding duplicate elements:"+arrayList);
}
}
