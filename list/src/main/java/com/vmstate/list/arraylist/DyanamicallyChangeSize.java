package com.vmstate.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DyanamicallyChangeSize 
{
public static void main(String[] arg)
{
	List<String> members = new ArrayList<String>();
	members.add("John");
	members.add("Smith");
	members.add("Kiran");
	members.add("Sam");
	members.add("Ben");
	members.add("Peter");
	members.add("Tom");
	members.add("Katie");
	members.add("Helen");
	members.add("Ann");
	System.out.println("Intial size of the ArrayList: "+members.size());
	System.out.println("Initial members in the library: "+ members);
	members.add("Lilly");
	System.out.println("New size of the ArrayList: "+members.size());
	System.out.println("Current members in the library: "+ members);
	
	
}
}
