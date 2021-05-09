package info.java8;
/*
  A Dog Class
*/
public class Dog {
    String name, colour;

    void dogLooks(String name, String colour) {
        System.out.println("Our dog " + name + " is " + colour + "(input arguments)");
        name = "zzz";
        colour = "zzz";
        System.out.println("Our dog " + name + " is " + colour + "(changed arguments)");
    }
}

