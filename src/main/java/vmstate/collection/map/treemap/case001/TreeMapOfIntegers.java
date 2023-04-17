package vmstate.collection.map.treemap.case001;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOfIntegers {
	private static final int NUM_OF_ITEMS = 1000000;
    public static void main(String[] args) {
        long start, end, time;
        Map<Integer, Integer> treeMap = new TreeMap<>();
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ITEMS; i++) {
            treeMap.put(i, i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("TreeMap insertion time: " + time + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ITEMS; i++) {
            treeMap.get(i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println("TreeMap retrieval time: " + time + " ns");
    }
}
