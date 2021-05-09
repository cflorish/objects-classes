
package info.java8;
/*
  Out of bounds example
*/
public class OutOfBoundsArray {

    public static void main (String[] args) {
        String strArray[] = {"one", "aa"}; // Single statement array creation
        System.out.println("Position 3 (index 2) : " + strArray[2]); // Access outside allocation
    }
}

