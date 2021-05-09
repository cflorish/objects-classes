
package info.java8;
/*
  Test Class5 for Soup
*/
public class SoupTest5 {

    public static void main (String[] args) {
        for (Soup s : Soup.values()) {
            System.out.println("We have " + s + " soup in our list, which is a "
                    + s.getType() + " soup.");
        }
    }
}

