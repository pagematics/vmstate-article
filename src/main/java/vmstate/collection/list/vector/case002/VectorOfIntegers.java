package vmstate.collection.list.vector.case002;
import java.util.Vector;

public class VectorOfIntegers {
	public static void main(String[] args) {

		int size = 500000;
	    Vector<Integer> vector = new Vector<>();

	    // Add elements to Vector
	    long startTime = System.currentTimeMillis();
	    for (int i = 0; i < size; i++) {
	    	vector.add(i);
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println("Time taken by Vector to add " + size + " elements: " + (endTime - startTime) + " ms");


	    // Access elements at random positions in the Vector
	    startTime = System.currentTimeMillis();
	    for (int j = 0; j < size; j++) {
	    	vector.get(j);
	    }
	    endTime = System.currentTimeMillis();
	    System.out.println("Time taken by Vector to access " + size + " elements: " + (endTime - startTime) + " ms");


	    // Remove element from the Vector
	    startTime = System.currentTimeMillis();
    	vector.remove(300000);
	    endTime = System.currentTimeMillis();
	    System.out.println("Time taken by Vector to remove " + size / 2 + " elements: " + (endTime - startTime) + " ms");
		 }


}
