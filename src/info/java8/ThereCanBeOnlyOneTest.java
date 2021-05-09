package info.java8;
/*
  Test Class for ThereCanBeOnlyOne
*/
public class ThereCanBeOnlyOneTest {

    public static void main (String[] args) {
        ThereCanBeOnlyOne me = ThereCanBeOnlyOne.INSTANCE;
        System.out.println("Our instance " + me);
        ThereCanBeOnlyOne me2 = ThereCanBeOnlyOne.INSTANCE;
        System.out.println("Our instance " + me2);
    }
}
