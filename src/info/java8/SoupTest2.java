package info.java8;
/*
  Test Class2 for Soup
*/
public class SoupTest2 {

    public static void main (String[] args) {
        Soup soup = Soup.TOMATO;
        if (soup == Soup.CHICKEN) {
            System.out.println("Our " + soup + " soup has meat in it!");
        } else {
            System.out.println("Our " + soup + " soup has no meat in it!");
        }
    }
}
