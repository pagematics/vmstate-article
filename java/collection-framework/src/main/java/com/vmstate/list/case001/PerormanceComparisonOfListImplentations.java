package com.vmstate.list.case001;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class PerormanceComparisonOfListImplentations 
{
    public static void main(String[] args) throws InterruptedException 
    {
        
        //Defining the time variable
        long start;
        long end;
        
        //Running multiple test cases
        
        for (int x=0;x<=100;x++)
        {
	    	System.gc();
	    	TimeUnit.SECONDS.sleep(1);
	    	
	    	String timeTaken  = "";
	        	
	        //Declaring ArrayList, LinkedList, Vector, and Stack
	        List<Integer> arrayList = new ArrayList<Integer>();
	        List<Integer> linkedList = new LinkedList<Integer>();
	        List<Integer> vector = new Vector<Integer>();
	        List<Integer> stack = new Stack<Integer>();
	
	        // Insertion at the beginning
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.add(0, i);
	        }
	        end = System.nanoTime();
	        timeTaken = (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.add(0, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	        	vector.add(0, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	        	stack.add(0, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        // Insertion at the middle
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.add(arrayList.size()/2, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.add(linkedList.size()/2, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	        	vector.add(vector.size()/2, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.add(stack.size()/2, i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        // Insertion at the end
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.add(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.add(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            vector.add(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.add(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	      //Access from beginning
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            vector.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        // Access from the middle
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.get(arrayList.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.get(linkedList.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            vector.get(vector.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.get(stack.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	    	
	        // Access from the end
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            arrayList.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            linkedList.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            vector.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            stack.get(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        
	        // Deletion from the beginning
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.remove(0);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.remove(0);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            vector.remove(0);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.remove(0);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        // Deletion from the middle
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            arrayList.remove(arrayList.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            linkedList.remove(linkedList.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            vector.remove(vector.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            stack.remove(stack.size()/2);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	       
	        // Deletion from the end
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            arrayList.remove(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            linkedList.remove(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            vector.remove(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start)+",";
	        
	        start = System.nanoTime();
	        for (int i = 9999; i >= 0; i--) {
	            stack.remove(i);
	        }
	        end = System.nanoTime();
	        timeTaken = timeTaken + (end - start);
	        System.out.println(timeTaken);
        }
}
    
}
