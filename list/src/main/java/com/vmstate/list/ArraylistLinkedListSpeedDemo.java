package com.vmstate.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistLinkedListSpeedDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        // Insertion at the beginning
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the beginning of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the beginning of LinkedList: " + (end - start) + " ns");

        // Insertion at the middle
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(5000, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(5000, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of LinkedList: " + (end - start) + " ns");

        // Insertion at the end
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the end of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the end of LinkedList: " + (end - start) + " ns");

        // Deletion from the beginning
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the beginning of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the beginning of LinkedList: " + (end - start) + " ns");

        // Deletion from the middle
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(5000);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the middle of ArrayList: " + (end - start) + " ns");


}
    
}
