
package info.java8;
/*
  Test class for maths stuff
*/
public class NumberAdder2 {

    public static void main (String[] args) {
        int a = 12;
        int b = 97;
        int c = 100;
        addNumbers();  // Call with no arguments
        addNumbers(a);  // Call with 1 arguments
        addNumbers(a, b);  // Call with 2 arguments
        addNumbers(a, b, c);  // Call with 3 arguments
        System.out.println("\n");
        float d = 12.1F;
        float e = 97.2F;
        float f = 100.3F;
        addNumbers();  // Call with no arguments
        addNumbers(d);  // Call with 1 arguments
        addNumbers(d, e);  // Call with 2 arguments
        addNumbers(d, e, f);  // Call with 3 arguments
    }

    /*
        A method that adds up the integers in a varargs list
    */
    static void addNumbers(int ... number) {
        int adder = 0;
        for (int i=0; i<number.length; i++) {
            System.out.println("Array position: " + i + ": " + number[i]);
            adder += number[i];
        }
        System.out.println("Total = " + adder);
    }

    /*
        A method that adds up the floats in a varargs list
    */
    static void addNumbers(float ... number) {
        int adder = 0;
        for (int i=0; i<number.length; i++) {
            System.out.println("Array position: " + i + ": " + number[i]);
            adder += number[i];
        }
        System.out.println("Total = ");
    }
}

