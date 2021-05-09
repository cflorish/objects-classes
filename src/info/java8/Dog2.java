
package info.java8;
/*
  Another Dog Class
*/
public class Dog2 {
    String name, colour;

    void dogLooks(Dog2 dog) {
        System.out.println("Our dog " + dog.name + " is " + dog.colour + "(input arguments)");
        dog.name = "zzz";
        dog.colour = "zzz";
        System.out.println("Our dog " + dog.name + " is " + dog.colour + "(changed arguments)");
    }
}

