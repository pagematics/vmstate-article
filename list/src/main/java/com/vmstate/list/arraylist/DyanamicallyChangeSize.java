package com.vmstate.list.arraylist;

import java.util.ArrayList;

public class DyanamicallyChangeSize 
{
public static void main(String[] arg)
{
	ArrayList<String> members = new ArrayList<String>(5);
	members.add("John");
	members.add("Smith");
	members.add("Kiran");
	members.add("Sam");
	members.add("Ben");
	System.out.println("Intial size of the ArrayList: "+members.size());
	System.out.println("Initial members in the library: "+ members);
	members.add("Lilly");
	System.out.println("New size of the ArrayList: "+members.size());
	System.out.println("Current members in the library: "+ members);
	
	
}
}
