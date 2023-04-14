package vmstate.collection.que.arraydeque.case001;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueByArrayDeque {
	public static void main(String[] args) {
        Queue<Integer> arrayDequeQueue = new ArrayDeque<>();

        // Test adding elements to the back of the queue
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayDequeQueue.add(i);
        }
        endTime = System.nanoTime();
        long arrayDequeAddTime = endTime - startTime;


        // Test removing elements from the front of the queue

        startTime = System.nanoTime();
        while (!arrayDequeQueue.isEmpty()) {
            arrayDequeQueue.remove();
        }
        endTime = System.nanoTime();
        long arrayDequeRemoveTime = endTime - startTime;


        // Print the results
        System.out.println("Time taken to add 100000 elements to the back of the queue:");
        System.out.println("ArrayDeque: " + arrayDequeAddTime + " nanoseconds");

        System.out.println("Time taken to remove 100000 elements from the front of the queue:");
        System.out.println("ArrayDeque: " + arrayDequeRemoveTime + " nanoseconds");
    }

}
