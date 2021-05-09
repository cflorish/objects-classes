
package info.java8;
/*
  Two dimensional array examples
*/
public class TwoDimensionArrays {

    public static void main (String[] args) {
        int intArray1[][];             // Array declaration
        intArray1 = new int[3][4];     // Array allocation
        for (int i=0; i<intArray1.length; i++) {  // Array initialization using a for loop
            for (int j=0; j<intArray1[i].length; j++) {
                intArray1[i][j] = i + j;
                System.out.println("Array position: " + i + ":" + j + " = " + intArray1[i][j]);
            }
        }
        // Single statement array creation
        int[][] intArray2 = new int[][]{ {5, 33}, {0}, {5, 4, 71} };
        for (int i=0; i<intArray2.length; i++) {
            for (int j=0; j<intArray2[i].length; j++) {
                System.out.println("Array2 position: " + i + ":" + j + " = " + intArray2[i][j]);
            }
        }
    }
}

