package info.java8;
/*
  Test Class for Dog
*/
public class TestDog {

    public static void main (String[] args) {
        Dog doggy = new Dog();  // Create a Dog instance
        String name = "rover";
        String colour = "black";
        doggy.dogLooks(name, colour);
        System.out.println("Our dog " + name + " is " + colour + "(after call to dogLooks() )");
    }
}
