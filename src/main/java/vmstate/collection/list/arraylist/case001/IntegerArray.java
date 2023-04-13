package vmstate.collection.list.arraylist.case001;

public class IntegerArray {
public static void main(String[] args) {
        
        // Array Creation
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        
        // Print the array
        System.out.println("Array ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
         // Add element to array
        array[3] = 4;
        
        // Again print the array
        System.out.println("\nArray after adding an element:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
}
}
