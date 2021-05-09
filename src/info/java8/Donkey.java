
package info.java8;
/*
  A Donkey Class
*/
public class Donkey {
    static int count;  // We made this static

    public Donkey() {
        count++;  // Increment a counter
        // Prefix statics with the class name
        System.out.println("Our donkey count = " + Donkey.count);
    }
}

