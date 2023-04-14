package vmstate.collection.list.vector.case001;

import java.util.LinkedList;

public class LinkedListOfIntegers {
	 public static void main(String[] args) {

	int size = 500000;
    LinkedList<Integer> linkedList = new LinkedList<>();

    // Add elements to LinkedList
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
        linkedList.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken by LinkedList to add " + size + " elements: " + (endTime - startTime) + " ms");


    // Access elements at random positions in the LinkedList
    startTime = System.currentTimeMillis();
    for (int j = 0; j < size; j++) {
        linkedList.get(j);
    }
    endTime = System.currentTimeMillis();
    System.out.println("Time taken by LinkedList to access " + size + " elements: " + (endTime - startTime) + " ms");


    // Remove element from the LinkedList
    startTime = System.currentTimeMillis();
    linkedList.remove(300000);
    endTime = System.currentTimeMillis();
    System.out.println("Time taken by LinkedList to remove " + size / 2 + " elements: " + (endTime - startTime) + " ms");
	 }
}
