package vmstate.collection.que.priorityque.case001;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueByPriorityQue {
	public static void main(String[] args) {
		 Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Test adding elements to the back of the queue
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        	priorityQueue.add(i);
        }
        endTime = System.nanoTime();
        long priorityQueueAddTime = endTime - startTime;


        // Test removing elements from the front of the queue

        startTime = System.nanoTime();
        while (!priorityQueue.isEmpty()) {
        	priorityQueue.remove();
        }
        endTime = System.nanoTime();
        long priorityQueueRemoveTime = endTime - startTime;


        // Print the results
        System.out.println("Time taken to add 100000 elements to the back of the queue:");
        System.out.println("PriorityQueue: " + priorityQueueAddTime + " nanoseconds");

        System.out.println("Time taken to remove 100000 elements from the front of the queue:");
        System.out.println("PriorityQueue: " + priorityQueueRemoveTime + " nanoseconds");
    }


}
