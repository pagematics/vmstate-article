package com.vmstate.list.linkedlist;

import java.util.LinkedList;

public class CommonLinkedListOperations 
{
	public static void main(String[] arg)
	{
			// Declaring a LinkedList
			List<Integer> linkedList1 = new LinkedList<Integer>();

			// Declaring a second LinkedList
			LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
				
			// Adding new elements to the LinkedList
			for (int i = 1; i <= 5; i++)
			{
				linkedList1.add(i);
				linkedList2.add(i);
			}
			
			// Printing the LinkedList
			System.out.println("Initial Lists");
			System.out.println("LinkedList 1:"+linkedList1);
			System.out.println("LinkedList 2:"+linkedList2);
			
			//Removing element at a particular index
			linkedList1.remove(3);
			linkedList2.remove(2);
			
			// Printing the LinkedList after removing element
			System.out.println("LinkedList after removing the elements");
			System.out.println("LinkedList 1:"+linkedList1);
			System.out.println("LinkedList 2:"+linkedList2);
			
			//Inserting elements to LinkedList
			linkedList1.add(23);
			linkedList2.add(1, 45);
			
			// Printing the LinkedList after inserting element
			System.out.println("LinkedList after insering elements");
			System.out.println("LinkedList 1:"+linkedList1);
			System.out.println("LinkedList 2:"+linkedList2);
			
			//Accessing elements from LinkedList
			System.out.println("Accessing elements from the LinkedList");
			System.out.println("Element at index 1 of LinkedList 1:"+linkedList1.get(1));
			System.out.println("Element at index 3 of LinkedList 2:"+linkedList2.get(3));
	}

}
