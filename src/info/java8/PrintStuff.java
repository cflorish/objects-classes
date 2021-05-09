
package info.java8;
/*
  Test class for maths stuff
*/
public class PrintStuff {

    public static void main (String[] args) {
        int a = 12;
//        printArray();  // Call with no arguments
        printArray(a);  // Call with 1 arguments
        String b = "fred" ;
//        printArray();  // Call with no arguments
        printArray(b);  // Call with 1 arguments
    }

    /*
        A method that Prints an array of ints
    */
    static void printArray(int ... number) {
        for (int i=0; i<number.length; i++) {
            System.out.print("Array position: " + i + ": " + number[i]);
        }
    }

    /*
        A method that Prints an array of Strings
    */
    static void printArray(String ... string) {
        for (int i=0; i<string.length; i++) {
            System.out.print("Array position: " + i + ": " + string[i]);
        }
    }
}

