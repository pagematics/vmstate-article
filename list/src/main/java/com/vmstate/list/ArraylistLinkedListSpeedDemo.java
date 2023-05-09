package com.vmstate.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArraylistLinkedListSpeedDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> vector = new Vector<Integer>();
        List<Integer> stack = new Stack<Integer>();

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

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
        	vector.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the beginning of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
        	stack.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the beginning of Stack: " + (end - start) + " ns");
        
        // Insertion at the middle
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of LinkedList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
        	vector.add(vector.size()/2, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of Vector: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.add(stack.size()/2, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements in the middle of Stack: " + (end - start) + " ns");

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

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the end of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to insert 10000 elements at the end of Stack: " + (end - start) + " ns");
       
        
      //Access from beginning
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the beginning of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the beginning of LinkedList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the beginning of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the beginning of Stack: " + (end - start) + " ns");
        
        // Access from the middle
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(arrayList.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the middle of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(linkedList.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the middle of LinkedList: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.get(vector.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the middle of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.get(stack.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the middle of Stack: " + (end - start) + " ns");
        
     // Access from the end
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the end of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the end of LinkedList: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            vector.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the end of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            stack.get(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to access 10000 elements from the end of Stack: " + (end - start) + " ns");
        
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

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the beginning of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the beginning of Stack: " + (end - start) + " ns");
        
        
        // Deletion from the middle
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(arrayList.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the middle of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the middle of LinkedList: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vector.remove(vector.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the middle of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.remove(stack.size()/2);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the middle of Stack: " + (end - start) + " ns");
        
        // Deletion from the end
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the end of ArrayList: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the end of LinkedList: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            vector.remove(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the end of Vector: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 9999; i >= 0; i--) {
            stack.remove(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken to remove 10000 elements from the end of Stack: " + (end - start) + " ns");
        
}
    
}
