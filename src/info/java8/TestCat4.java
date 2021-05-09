package info.java8;
/*
  Test Class4 for Cat
*/
public class TestCat4 {

    public static void main (String[] args) {
        Cat moggy = new Cat();
        Cat tigger = new Cat();
        Cat tabby = new Cat();
        moggy.name = "Henry";
        moggy.colour = "black";
        moggy.age = 4;
        tigger.name = "Kitty";
        tigger.colour = "grey";
        tigger.age = 15;
        tabby.name = "Felix";
        tabby.colour = "white";
        tabby.age = 8;
        System.out.println("Our " + moggy.colour + " cat called " + moggy.name + " is " + moggy.age);
        System.out.println("Our " + tigger.colour + " cat called " + tigger.name + " is " + tigger.age);
        System.out.println("Our " + tabby.colour + " cat called " + tabby.name + " is " + tabby.age);
    }
}
