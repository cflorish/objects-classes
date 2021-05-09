package info.java8;

/*
  Test class for static calls
*/
public class StatCalls2 {
    public static void main (String[] args) {
//        this.number = 6;
//        int aSquare = StatCalls2.squareNumber(this.number);
//        System.out.println(aSquare);
    }
    int squareNumber(int number) {
        int square = number * number;
        return square;
    }
}
