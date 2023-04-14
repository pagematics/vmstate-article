package vmstate.collection.set.treeset.case001;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOfRandomNumbers {
	public static void main(String[] args) {
        int n = 1000000;
        Random rand = new Random();
        Set<Integer> treeSet = new TreeSet<>();
        
        long startTime, endTime, duration;
        
        // Populate the HashSet with random numbers
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            treeSet.add(num);
        }
        
        // Performance of adding elements
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
        	treeSet.add(rand.nextInt(n));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("TreeSet add duration: " + duration + "ms");
        
        // Performance of iterating over elements
        startTime = System.nanoTime();
        for (int num : treeSet) {}
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("TreeSet iteration duration: " + duration + "ms");
        
    }
}
