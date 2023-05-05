package com.vmstate.list.arraylist;

import java.util.ArrayList;

public class AccessElements 
{
	public static void main(String[] arg)
	{
		ArrayList<String> businessList = new ArrayList();
		businessList.add("ABC corp");
		businessList.add("Dew Drops");
		businessList.add("Axelon");
		System.out.println("Getting element at position 1: " +businessList.get(1)); 
	}

}
