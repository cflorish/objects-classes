package info.java8;
/*
  Test Class4 for Soup
*/
public class SoupTest4 {

    public static void main (String[] args) {
        /*
          Using enum predefined values() method
        */
        Soup allSoups[] = Soup.values();
        for (Soup s : allSoups) {
            System.out.println("We have " + s + " soup in our list.");
        }
        /*
          Using enum predefined valueOf() method
        */
        Soup soup = Soup.valueOf("CHICKEN");
        System.out.println("Soup value is: " + soup);
    }
}

