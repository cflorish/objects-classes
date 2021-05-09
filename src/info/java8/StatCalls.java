package info.java8;

/*
  Test class for static calls
*/
public class StatCalls {

    public static void main (String[] args) {
//        int aSquare = squareNumber(5);   // Calling non-static method
//        System.out.println(aSquare);
    }

    /*
      A method that squares and returns the passed integer
    */
    int squareNumber(int number) {
        int square = number * number;
        return square;  // Here we use the return keyword to pass back a value
    }
}

