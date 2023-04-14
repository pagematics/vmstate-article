package vmstate.collection.set.linkedhashset.case001;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetOfRandomNumbers {
	public static void main(String[] args) {
        int n = 1000000;
        Random rand = new Random();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        
        long startTime, endTime, duration;
        
        // Populate the HashSet with random numbers
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            linkedHashSet.add(num);
        }
        
        // Performance of adding elements
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
        	linkedHashSet.add(rand.nextInt(n));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("LinkedHashSet add duration: " + duration + "ms");
        
        // Performance of iterating over elements
        startTime = System.nanoTime();
        for (int num : linkedHashSet) {}
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("LinkedHashSet iteration duration: " + duration + "ms");
        
    }

}
