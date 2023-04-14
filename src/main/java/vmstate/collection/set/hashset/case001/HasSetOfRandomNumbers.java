package vmstate.collection.set.hashset.case001;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HasSetOfRandomNumbers {
	public static void main(String[] args) {
        int n = 1000000;
        Random rand = new Random();
        Set<Integer> hashSet = new HashSet<>();
        
        long startTime, endTime, duration;
        
        // Populate the HashSet with random numbers
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            hashSet.add(num);
        }
        
        // Performance of adding elements
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            hashSet.add(rand.nextInt(n));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet add duration: " + duration + "ms");
        
        // Performance of iterating over elements
        startTime = System.nanoTime();
        for (int num : hashSet) {}
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("HashSet iteration duration: " + duration + "ms");
        
    }
}
