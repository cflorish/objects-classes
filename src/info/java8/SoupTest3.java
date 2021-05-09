package info.java8;
/*
  Test Class3 for Soup
*/
public class SoupTest3 {

    public static void main (String[] args) {
        Soup soup = Soup.PRAWN;
        switch (soup) {
            case CHICKEN:
                System.out.println("Our " + soup + " soup has meat in it!");
                break;
            case PRAWN:
                System.out.println("Our " + soup + " soup has fish in it!");
                break;
            case TOMATO:
                System.out.println("Our " + soup + " soup has vegetables in it!");
                break;
        }
    }
}
