package vmstate.collection.map.linkedhashmap.case001;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOfIntegers {
	private static final int NUM_OF_ITEMS = 1000000;
    public static void main(String[] args) {
        long start, end, time;
        
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ITEMS; i++) {
            linkedHashMap.put(i, i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("LinkedHashMap insertion time: " + time + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ITEMS; i++) {
            linkedHashMap.get(i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("LinkedHashMap retrieval time: " + time + " ns");
        System.out.println("HashMap retrieval time: " + time + " ns");
        
    }
}
