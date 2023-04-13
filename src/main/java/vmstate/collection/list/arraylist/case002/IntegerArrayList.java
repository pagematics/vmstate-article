package vmstate.collection.list.arraylist.case002;

import java.util.ArrayList;

public class IntegerArrayList {
public static void main(String[] args) {
        
        // ArrayList creation
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
       
        // Print ArrayList
        System.out.println("\nArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        
        // Add element to ArrayList
        arrayList.add(4);
        
        // Print the ArrayList again
        System.out.println("\nArrayList after adding an element:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

}
