package vmstate.collection.que.linkedlist.case001;

import java.util.LinkedList;
import java.util.Queue;

public class QueByLinkedList {
	public static void main(String[] args) {
		Queue<Integer> linkedListQueue = new LinkedList<>();

        // Test adding elements to the back of the queue
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        	linkedListQueue.add(i);
        }
        endTime = System.nanoTime();
        long linkedListQueueAddTime = endTime - startTime;


        // Test removing elements from the front of the queue

        startTime = System.nanoTime();
        while (!linkedListQueue.isEmpty()) {
        	linkedListQueue.remove();
        }
        endTime = System.nanoTime();
        long linkedListQueueRemoveTime = endTime - startTime;


        // Print the results
        System.out.println("Time taken to add 100000 elements to the back of the queue:");
        System.out.println("LinkedList: " + linkedListQueueAddTime + " nanoseconds");

        System.out.println("Time taken to remove 100000 elements from the front of the queue:");
        System.out.println("LinkedList: " + linkedListQueueRemoveTime + " nanoseconds");
    }


}
