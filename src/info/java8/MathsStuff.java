package info.java8;
/*
  Test class for maths stuff
*/
public class MathsStuff {

    public static void main (String[] args) {
        int aSquare = squareNumber(5);   // The return value will go into aSquare
        System.out.println(aSquare);
    }

    /*
        A method that squares and returns the passed integer
    */
    static int squareNumber(int number) {
        int square = number * number;
        return square;  // Here we use the return keyword to pass back a value
    }
}
