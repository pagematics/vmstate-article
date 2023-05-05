package com.vmstate.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddDuplicateElements 
{
	public static void main(String arg[])
	{
		 List<String> arrayList = new ArrayList<String>(); 
		 // Adding elements to the list
		 arrayList.add("Nila");
		 arrayList.add("Kevin");
		 arrayList.add("Anna");
		 arrayList.add("Kevin");
		 System.out.println("Students List: "+ arrayList); 
		 System.out.println("Student at index1: "+ arrayList.get(1)); 
		 System.out.println("Student at index2: "+ arrayList.get(3)); 
		 
	}

}
