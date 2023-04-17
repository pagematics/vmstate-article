package vmstate.collection.map.hashmap.case001;

import java.util.HashMap;
import java.util.Map;

public class HashMapOfIntegers {
	 private static final int NUM_OF_ITEMS = 1000000;
	    public static void main(String[] args) {
	        long start, end, time;
	        
	        Map<Integer, Integer> hashMap = new HashMap<>();
	        start = System.nanoTime();
	        for (int i = 0; i < NUM_OF_ITEMS; i++) {
	            hashMap.put(i, i);
	        }
	        end = System.nanoTime();
	        time = end - start;
	        System.out.println("HashMap insertion time: " + time + " ns");
	        
	        start = System.nanoTime();
	        for (int i = 0; i < NUM_OF_ITEMS; i++) {
	            hashMap.get(i);
	        }
	        end = System.nanoTime();
	        time = end - start;
	        System.out.println("HashMap retrieval time: " + time + " ns");
	        
	    }

}
