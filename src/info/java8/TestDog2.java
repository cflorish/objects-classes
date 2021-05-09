
package info.java8;
/*
  Test Class for Dog2
*/
public class TestDog2 {

    public static void main (String[] args) {
        Dog2 doggy = new Dog2();  // Create a Dog instance
        doggy.name = "rover";
        doggy.colour = "black";
        doggy.dogLooks(doggy);  // Pass a reference variable to a method
        System.out.println("Our dog " + doggy.name + " is " + doggy.colour
                + "(after call to dogLooks() )");
    }
}

