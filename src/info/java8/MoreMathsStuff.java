
package info.java8;
/*
  Test class for more maths stuff
*/
public class MoreMathsStuff {

    public static void main (String[] args) {
        int aSquare = squareNumber(5);   // The return value will go into aSquare
        System.out.println(aSquare);
        float aFracSquare = squareNumber(12.2F);   // The return value will go into aFracSquare
        System.out.println(aFracSquare);
    }

    /*
        A method that squares and returns the passed integer
    */
    static int squareNumber(int number) {
        int square = number * number;
        return square;  // Here we use the return keyword to pass back a value
    }

    /*
        A method that squares and returns the passed float
    */
    static float squareNumber(float number) {
        float square = number * number;
        return square;  // Here we use the return keyword to pass back a value
    }
}

