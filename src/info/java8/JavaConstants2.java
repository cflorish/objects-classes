
package info.java8;
/*
  Test class for Java Constants
*/
public class JavaConstants2 {
    public static final double EULERS_CONSTANT;
    public static final int SQUARE_OF_THREE;

    /*
      Static Initializer Block
    */
    static {
        EULERS_CONSTANT = 2.718281828459045;
        SQUARE_OF_THREE = 9;
    }

    public static void main (String[] args) {
        System.out.println("Euler's Constant = " + EULERS_CONSTANT);
        System.out.println("Three squared + " + SQUARE_OF_THREE);
    }
}

