package com.vmstate.list.arraylist;

import java.util.ArrayList;

public class AddNullElements 
{
	public static void main(String[] args)
	{
		ArrayList<String> freignPassportNumbers = new ArrayList();
		freignPassportNumbers.add("XYZ0934");
		freignPassportNumbers.add(null);
		freignPassportNumbers.add("EEN9087");
		freignPassportNumbers.add(null);
		System.out.println("List of foreign passport numbers: "+freignPassportNumbers);
	}

}
