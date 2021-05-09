package info.java8;
/*
  Test Class for Soup
*/
public class SoupTest {

    public static void main (String[] args) {
        Soup soup;  //  Here we create an enum variable of type Soup
        soup = Soup.PRAWN;  // We qualify our assigned enumeration constants
        System.out.println("Our soup is: " + soup);
    }
}

