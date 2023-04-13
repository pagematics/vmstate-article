package vmstate.collection.list.linkedlist.case002;

import java.util.LinkedList;

public class LinkedListOfIntegers {
	
	public static void main(String[] args) {
        // LinkedList Creation
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // add elements to the LinkedList
        for (int i = 0; i < 2000000; i++) {
        	linkedList.add(i);
        }
        
        // measure the time to get the element at index 1000000
        long start = System.currentTimeMillis();
        linkedList.get(1000000);
        long end = System.currentTimeMillis();
        System.out.println("Time to get the element at index 1000000 from LinkedList: " + (end - start) + " ms");
        
        
        // measure the time to insert an element at index 1000000
        start = System.currentTimeMillis();
        linkedList.add(1000000, 199999);
        end = System.currentTimeMillis();
        System.out.println("Time to insert element at index 1000000 to the LinkedList: " + (end - start) + " ms");
        
        
        // measure the time to remove an element at index 1000000
        start = System.currentTimeMillis();
        linkedList.remove(1000000);
        end = System.currentTimeMillis();
        System.out.println("Time to remove element at index 1000000 from LinkedList: " + (end - start) + " ms");
        
    }

}
