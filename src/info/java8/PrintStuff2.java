
package info.java8;
/*
  Test class for maths stuff
*/
public class PrintStuff2 {

    public static void main (String[] args) {
        String a = "wilma" ;
        printArray();  // Call with no arguments
//        printArray(a);  // Call with 1 arguments
        String b = "fred" ;
        printArray();  // Call with no arguments
//        printArray(b);  // Call with 1 arguments
    }

    /*
        A method that Prints one or more String
    */
    static void printArray(String ... string) {
        for (int i=0; i<string.length; i++) {
            System.out.print("Array position: " + i + ": " + string[i]);
        }
    }

    /*
        A method that Prints one or more String
    */
    static void printArray(String singleString, String ... string) {
        for (int i=0; i<string.length; i++) {
            System.out.print("Array position: " + i + ": " + string[i]);
        }
    }
}

