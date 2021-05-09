
package info.java8;
/*
  Test Class5 for Cat
*/
public class TestCat5 {

    public static void main (String[] args) {
        Cat moggy = new Cat("Henry", "black", 4);   // Call new Cat constructor with three arguments
        Cat tigger = new Cat("Kitty", "black", 15); // Call new Cat constructor with three arguments
        Cat tabby = new Cat("Felix", "white", 8);   // Call new Cat constructor with three arguments
        Cat tommy = new Cat();  // Call Cat constructor with no arguments
        Cat bobby = new Cat("beige", 6);  // Call Cat constructor with colour and age
        System.out.println("Our " + moggy.colour + " cat called " + moggy.name + " is " + moggy.age);
        System.out.println("Our " + tigger.colour + " cat called " + tigger.name + " is "
                + tigger.age);
        System.out.println("Our " + tabby.colour + " cat called " + tabby.name + " is " + tabby.age);
        System.out.println("Our " + tommy.colour + " cat called " + tommy.name + " is " + tommy.age);
        System.out.println("Our " + bobby.colour + " cat called " + bobby.name + " is " + bobby.age);
    }
}

