package vmstate.collection.list.linkedlist.case001;

import java.util.ArrayList;

public class ArrayListOfIntegers {
	public static void main(String[] args) {
        // ArrayList Creation
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // add elements to the ArrayList
        for (int i = 0; i < 2000000; i++) {
            arrayList.add(i);
        }
        
        // measure the time to get the element at index 1000000
        long start = System.currentTimeMillis();
        arrayList.get(1000000);
        long end = System.currentTimeMillis();
        System.out.println("Time to get the element at index 1000000 from ArrayList: " + (end - start) + " ms");
        
        
        // measure the time to insert an element at index 1000000
        start = System.currentTimeMillis();
        arrayList.add(1000000, 199999);
        end = System.currentTimeMillis();
        System.out.println("Time to insert element at index 1000000 to the ArrayList: " + (end - start) + " ms");
        
        
        // measure the time to remove an element at index 1000000
        start = System.currentTimeMillis();
        arrayList.remove(1000000);
        end = System.currentTimeMillis();
        System.out.println("Time to remove element at index 1000000 from ArrayList: " + (end - start) + " ms");
        
    }
}
